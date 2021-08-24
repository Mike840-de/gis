package com.example.kafka.controller;

import com.example.kafka.dto.UserDto;
import com.example.kafka.utils.exception.ApiException;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/api/v1/gis")
@AllArgsConstructor
public class MockGisController {

    private Random random;

    @PostMapping("/loadMessage")
    public UserDto sendOrder(@RequestBody UserDto userDto){
        if(random.nextBoolean()){
            throw new ApiException();
        }
        System.out.println(userDto.toString());
        return userDto;
    }
}
