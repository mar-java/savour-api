package com.marjava.savour_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping
    public String getOrder() {
        return "Here's your order";
    }

    @PostMapping
    public String createOrder() {
        return "Created a new order for you!";
    }
}
