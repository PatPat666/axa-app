package com.fsociety.axaapp.controller;
import com.fsociety.axaapp.model.MessageRequest;
import com.fsociety.axaapp.model.MessageResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")

public class MessageController {

@PostMapping("/message")
    public ResponseEntity<MessageResponse> handleMessage(@RequestBody MessageRequest request) {
        if (request.getMessage() == null || request.getMessage().isBlank()) {
            int status = HttpStatus.BAD_REQUEST.value();

            return ResponseEntity.badRequest().body(new MessageResponse("Message cannot be empty", status));
        }

        int status = HttpStatus.OK.value();

        return ResponseEntity.ok(new MessageResponse("You said: " + request.getMessage(), status));
    }
}
