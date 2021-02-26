package com.labyrinth.mq.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProducerServiceTest {


    @Resource
    ProducerService producerService;

    @Test
    public void sendMessage(){
        producerService.sendMessage("ceshishishihsihsihsihsi");
    }
}
