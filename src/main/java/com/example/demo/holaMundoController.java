package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class holaMundoController {
    @GetMapping
    public ResponseEntity<String> test(){
        return new ResponseEntity<>("holi", HttpStatus.ACCEPTED);
    }
    @GetMapping("/test2")
    public ResponseEntity<String> test2(){
        return new ResponseEntity<>("holi jhon f", HttpStatus.ACCEPTED);
    }
}
