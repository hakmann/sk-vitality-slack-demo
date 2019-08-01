package com.sk.vitality.slack.slackdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/slack")
public class Controller {

    private static final Logger log = LoggerFactory.getLogger(Controller.class);

    @GetMapping(value = "/")
    public HttpEntity<String> hello(){
        return ResponseEntity.ok("Hello!");
    }

    @PostMapping(value = "/createMember", consumes = "application/x-www-form-urlencoded")
    public HttpEntity<String> createMember(@RequestBody String[] body){
        log.debug(body.toString());
        return ResponseEntity.ok("Hello");
    }
}
