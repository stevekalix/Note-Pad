package com.example.NotePad.controller;


import com.example.NotePad.Services.TextServices;
import com.example.NotePad.model.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;


@RestController
public class TestController {
    @Autowired
    private TextServices textServices;

    @PostMapping("add")
    public Text addall(@RequestBody Text request) {
        textServices.addall(request.getNo(), request.getText(), request.getDate());
        return null;
    }
}
