package com.aman.boot.bootweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
@Controller
public class RequestAttributetest {

    @GetMapping("/goto")
    public String goToPage(HttpServletRequest request){
        request.setAttribute("msg","success");
        return "forward:/success";
    }
    @GetMapping("/param")
    public String paramPage(Map<String,Object> map,
                            Model model,
                            HttpServletRequest request,
                            HttpServletResponse response){
        map.put("hello","Amanzgz");
        model.addAttribute("world","HelloWord");
        Cookie cookie = new Cookie("_ga","ssss");
        response.addCookie(cookie);
        request.setAttribute("msg","success");
        return "forward:/success";
    }

    @ResponseBody
    @GetMapping("/success")
    public Map success(@RequestAttribute("msg")String msg, HttpServletRequest request)
    {
        Map<String, Object> map = new HashMap<>();
        map.put("msg",msg);
        map.put("request_map",request.getAttribute("msg"));
        map.put("hello",request.getAttribute("hello"));
        map.put("world",request.getAttribute("world"));
        return map;
    }
}
