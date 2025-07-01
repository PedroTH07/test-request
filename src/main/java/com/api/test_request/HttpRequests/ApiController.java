package com.api.test_request.HttpRequests;

import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping
    public Map<String, String> getResponse() {
        return Map.of("message", "ok");
    }

    @PostMapping
    public Map<Object, Object> postResponse(@RequestBody Map<Object, Object> data) {
        Integer randomId = new Random().nextInt(10) + 1;
        return Map.of( "data", data, "id", randomId);
    }
}
