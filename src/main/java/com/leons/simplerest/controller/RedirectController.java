package com.leons.simplerest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController()
@RequestMapping(path="/redirect")
public class RedirectController {


    @GetMapping
    public void getTagUrl(HttpServletRequest request, HttpServletResponse response){

        response.setHeader("Location", "https://studio.parllay.com/");
        response.setStatus(302);

    }

}
