package com.sk.vitality.slack.slackdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/slack")
public class Controller {

    private static final Logger log = LoggerFactory.getLogger(Controller.class);

    @PostMapping("/createMember")
    public HttpEntity<String> createMember(@RequestBody String[] body){
        log.debug(body.toString());
        return ResponseEntity.ok("Hello");
    }
}
