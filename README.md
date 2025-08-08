# AXA App

An application composed of a backend (Spring Boot) and a frontend (React + TypeScript).

## Requirements

- Node.js (version 18+ recommended)
- npm (installed with Node.js)
- Docker and Docker Compose
- Java 17+
- Maven (if the backend runs locally outside the container)

---

## Run the application

### 1. Installing frontend dependencies

Go to the `frontend` directory and install the npm packages:

```bash
cd frontend
npm install
```

### 2. Running the application in containers

In the project's root directory, run:

```bash
docker compose up --build
```
- The backend will be available at: http://localhost:8080

- The frontend will be available at: http://localhost:5173