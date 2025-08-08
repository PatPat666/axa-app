package com.fsociety.axaapp.model;

public class MessageResponse {
    private String response;
    private int statusCode;

    public MessageResponse(String response, int statusCode) {
        this.response = response;
        this.statusCode = statusCode;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
