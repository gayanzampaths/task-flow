package com.gs.tfs.rest.controller;

import com.gs.tfs.rest.model.api.HealthCheck;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author: gayan
 * created: 2023-09-23
 **/
@Controller
@RequestMapping("/api")
public class AssistanceController
{
    @GetMapping("health")
    public ResponseEntity<HealthCheck> heathCheck()
    {
        final var healthCheck = new HealthCheck();
        healthCheck.setStatus( true );
        return ResponseEntity.ok(healthCheck);
    }
}
