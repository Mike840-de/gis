package com.example.kafka.controller;

import com.example.kafka.dto.UserDto;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/gis")
public class MockGisController {

    @PostMapping("/loadMessage")
    public UserDto sendOrder(@RequestBody UserDto userDto){
        return userDto;
    }
}
