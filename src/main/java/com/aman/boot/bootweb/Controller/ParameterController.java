package com.aman.boot.bootweb.Controller;

import com.aman.boot.bootweb.Bean.Person;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ParameterController {

    @GetMapping("car/{id}/owner/{username}")
    public Map<String, Object> getCar(@PathVariable("id") Integer id,
                                      @PathVariable("username")String name,
                                      @PathVariable Map<String,String> pv,
                                      @RequestHeader("User-Agent") String agent,
                                      @RequestHeader Map<String,String> rh,
                                      @RequestParam("age")Integer age,
                                      @RequestParam Map<String,String> rq,
                                      @CookieValue("_ga")String _ga,
                                      @CookieValue("_ga") Cookie config
                                      ) {
        Map<String, Object> map = new HashMap<>();
        map.put("id",id);
        map.put("username",name);
        map.put("pv",pv);
        map.put("agent",agent);
        map.put("rh",rh);
        map.put("age",age);
        map.put("rq",rq);
        map.put("_ga",_ga);
        map.put("cookie",config);
        return map;
    }

    @PostMapping("/carpost")
    public Map postCar(@RequestBody String context)
    {
        Map<String, Object> map = new HashMap<>();
        map.put("context",context);
        return map;
    }

    @PostMapping("/perConvert")
    public Map perConvert(Person person)
    {
        Map<String, Object> map = new HashMap<>();
        map.put("person",person);
        return map;
    }
}
