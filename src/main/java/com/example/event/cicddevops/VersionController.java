package com.example.event.cicddevops;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class VersionController {

    private final String version;

    public VersionController(@Value("${app.version:unknown}") String version) {
        this.version = version;
    }

    @GetMapping("/version")
    public Map<String, String> getVersion() {
        return Map.of("version", version);
    }
}

