package com.aman.boot.bootweb.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HanlerController {
    //    @RequestMapping(value="RestType",method = RequestMethod.GET)
    @GetMapping("RestType")
    public String RestTypeGET() {
        return "GET";
    }

    @RequestMapping(value = "RestType", method = RequestMethod.POST)
    public String RestTypePost() {
        return "POST";
    }

    @RequestMapping(value = "RestType", method = RequestMethod.DELETE)
    public String RestTypeDELETE() {
        return "DELETE";
    }

    @RequestMapping(value = "RestType", method = RequestMethod.PUT)
    public String RestTypePUT() {
        return "PUT";
    }

}
