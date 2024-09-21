package com.fire.service_one;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping(path = "fire")
    ResponseEntity<?>GetFire(){
        return ResponseEntity.ok("Yoooo Fireeeeeeee");
    }
}
