package com.skeleton.springboot.controller;


import com.skeleton.springboot.dto.response.MessageResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @GetMapping("/homes")
    public ResponseEntity<MessageResponseDTO> Home(){
        MessageResponseDTO message = new MessageResponseDTO();
        message.setMessage("Home page");
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
