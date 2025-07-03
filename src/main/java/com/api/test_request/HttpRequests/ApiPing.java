package com.api.test_request.HttpRequests;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiPing {
    private final RestTemplate restTemplate;
    private final String apiUrl = "https://test-request-vin5.onrender.com";

    public ApiPing(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Scheduled(fixedDelay = 3600000) // delay de 1 hora
    public void ping() {
        String response = this.restTemplate.getForObject(this.apiUrl, String.class);
        System.out.println(response);
    }
}
