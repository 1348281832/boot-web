package com.aman.boot.bootweb.Controller;


import com.aman.boot.bootweb.Bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@Slf4j
public class ResponseTest {
    @ResponseBody
    @GetMapping("/test/person")
    public Person getPerson() {
        return new Person();
    }

    @ResponseBody
    @PostMapping("upload")
    public void upload(@RequestParam("Img") MultipartFile img) {
        log.info("文件大小是:" + img.getSize());
        log.info("文件名称是:" + img.getOriginalFilename());
        try {
            if (!img.isEmpty()) {
                String originalName = img.getOriginalFilename();
                File file = new File("C:\\Users\\13482\\Desktop\\"+originalName);
                img.transferTo(file);
                log.info("文件的路径在:"+file.getAbsolutePath());
            }
        }catch(Exception e)
        {
            log.info("错误"+e.getMessage());
        }
    }

}
