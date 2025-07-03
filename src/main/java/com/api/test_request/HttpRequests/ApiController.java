package com.api.test_request.HttpRequests;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping
    public ResponseEntity<?> getResponse(@RequestParam(
            name = "status", required = false, defaultValue = "0"
    ) Integer status) {
        if (status > 0) {
            return ResponseEntity.status(status).build();
        }

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("message", "ok"));
    }

    @PostMapping
    public ResponseEntity<?> postResponse(
            @RequestBody Map<Object, Object> data,
            @RequestParam(required = false, defaultValue = "0") Integer status
    ) {
        if (status > 0) {
            return ResponseEntity.status(status).build();
        }
        Integer randomId = new Random().nextInt(10) + 1;
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of( "data", data, "id", randomId));
    }

    @PutMapping
    public ResponseEntity<?> putResponse(
            @RequestBody Map<Object, Object> data,
            @RequestParam(required = false, defaultValue = "0") Integer status
    ) {
        if (status > 0) {
            return ResponseEntity.status(status).build();
        }
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/**")
    public ResponseEntity<?> deleteResponse(@RequestParam(required = false, defaultValue = "0") Integer status) {
        if (status > 0) {
            return ResponseEntity.status(status).build();
        }
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
