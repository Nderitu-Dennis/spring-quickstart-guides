package com.mazindere.assessment_prep.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice // intercepts exceptions globally across controllers
public class GlobalExceptionHandler {

    //ExceptionHandler-Handles a specific exception type
    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<Map<String, Object>> handle(
            ResponseStatusException ex, HttpServletRequest request) {

        Map<String, Object> body = new HashMap<>();
        body.put("status", ex.getStatusCode().value());
        body.put("error", ex.getReason());
        body.put("timestamp", LocalDateTime.now());
        body.put("path", request.getRequestURI());

        return ResponseEntity.status(ex.getStatusCode()).body(body);
    }
}