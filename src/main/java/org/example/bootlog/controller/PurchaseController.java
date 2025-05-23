package org.example.bootlog.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseController {
    @PostMapping
    public void purchase() {
        System.out.println("purchase");
    }
}
