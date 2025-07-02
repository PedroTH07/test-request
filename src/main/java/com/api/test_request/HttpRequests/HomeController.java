package com.api.test_request.HttpRequests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String homeResponse() {
        return "Try sending GET ✅, POST ✍, PUT ♻ and DELETE ❌ to path /api to see how this API responds!";
    }
}
