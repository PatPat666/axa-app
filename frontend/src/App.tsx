import { useState } from 'react'

type ApiResponse = {
    response: string
    statusCode: number
}

export default function App() {
    const [message, setMessage] = useState<string>('')
    const [response, setResponse] = useState<ApiResponse | null>(null)
    const [loading, setLoading] = useState<boolean>(false)

    const sendMessage = async () => {
        setLoading(true)
        try {
            const res = await fetch('http://localhost:8080/api/message', {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify({ message }),
            })

            const data: ApiResponse = await res.json()
            setResponse(data)
        } catch (err) {
            setResponse({ response: 'Error connecting', statusCode: 0 })
        } finally {
            setLoading(false)
        }
    }

    return (
        <div style={{ padding: 20, maxWidth: 400, margin: '0 auto' }}>
            <h1>Axa App</h1>
            <input
                style={{ width: '100%', padding: 8, marginBottom: 10 }}
                type="text"
                placeholder="Enter a message"
                value={message}
                onChange={(e) => setMessage(e.target.value)}
            />
            <button style={{ width: '100%', padding: 10 }} onClick={sendMessage}>
                {loading ? 'Sending...' : 'Send'}
            </button>
            {response && (
                <div style={{marginTop: 20, fontWeight: 'bold'}}>
                    <div>{response.response}</div>
                    <div>Status Code: {response.statusCode}</div>
                </div>
            )}
        </div>
    )
}
