package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication {

  @RequestMapping("/")
  @ResponseBody
  String home() {
    return "[{\"id\":\"1\",\"name\":\"Voice Unlimited 30 days\"},{\"id\":\"2\",\"name\":\"Data Unlimited 4MB\"}]";
  }

  @RequestMapping("/offers")
  @ResponseBody
  String hello() {
    return "[{\"id\":\"1\",\"name\":\"Voice Unlimited 30 days\"},{\"id\":\"2\",\"name\":\"Data Unlimited 4MB\"}]";
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
