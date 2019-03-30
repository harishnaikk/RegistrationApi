package com.hn.registration.rest.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegistrationApiController {

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    @ResponseBody
    public String getHello(){
        return "Hello";
    }



}
