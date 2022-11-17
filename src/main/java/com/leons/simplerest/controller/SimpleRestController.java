package com.leons.simplerest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@RestController()
@RequestMapping(path="/simplerest")
public class SimpleRestController {


    @GetMapping
    public Map<String, String> getTagUrl(HttpServletRequest request){

        Map<String, String> urlInfo = new HashMap<>();

        String url = String.valueOf(request.getRequestURL());
        urlInfo.put("request_url",url);

        Enumeration<String> headers =request.getHeaderNames();
        while(headers.hasMoreElements()){
            String headerName = headers.nextElement();
            urlInfo.put(headerName,request.getHeader(headerName));
        }

        urlInfo.put("query_string", request.getQueryString());
        Enumeration<String> params = request.getParameterNames();
        while(params.hasMoreElements()){
            String paramName = params.nextElement();
            urlInfo.put(paramName, request.getParameter(paramName));
        }
        return urlInfo;
    }

}
