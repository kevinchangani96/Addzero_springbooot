package com.swagger_demo.swagger_demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello/v1")
@Tag(name = "Greeting", description = "Endpoints for greeting messages")
public class HelloController {

  @GetMapping("morning")
  @Operation(
      summary = "Good Morning",
      description = "Good Morning Message",
      tags = {"Greeting"}
  )
  public String goodMorning(@RequestParam String name) {
    return "Good Morning " + name + " 🌅";
  }

  @GetMapping("evening")
  @Operation(
      summary = "Good Evening",
      description = "Good Evening Message",
      tags = {"Greeting"}
  )
  public String goodEvening(@RequestParam String name) {
    return "Good Evening " + name + " 🌆";
  }

  @PutMapping("night")
  @Operation(
      summary = "Good Night",
      description = "Good Night Message",
      tags = {"Greeting"}
  )
  public String goodNight(@RequestParam String name) {
    return "Good Night " + name + " 🌃";
  }

}
