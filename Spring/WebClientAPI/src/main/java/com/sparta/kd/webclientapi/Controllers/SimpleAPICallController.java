package com.sparta.kd.webclientapi.Controllers;

import com.sparta.kd.webclientapi.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/api")
public class SimpleAPICallController {

    private final WebClient webClient;

    public SimpleAPICallController(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping("/welcome")
    public String welcome() {
        return webClient
                .get()
                .uri("postcodes/hd33np")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    @GetMapping("/another")
    public ResponseEntity<Response> another() {
        Response response = webClient
                .get()
                .uri("postcodes/hd33np")
                .retrieve()
                .bodyToMono(Response.class)
                .block();

        return ResponseEntity.ok(response);
    }
}
