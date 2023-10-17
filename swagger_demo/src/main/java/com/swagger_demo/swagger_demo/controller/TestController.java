package com.swagger_demo.swagger_demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test/v1")
@Tag(name = "Test", description = "Endpoints for Test messages")
public class TestController {

  @GetMapping("india")
  @Operation(
      summary = "India",
      description = "India India India",
      tags = {"Test"}
  )
  public String indiaMessage(@RequestParam String name) {
    return "India " + name;
  }

  @PostMapping("canada")
  @Operation(
      summary = "Canada",
      description = "Canada Canada Canada",
      tags = {"Test"}
  )
  public String canadaMessage(@RequestParam String name) {
    return "Canada " + name;
  }

  @DeleteMapping("USA")
  @Operation(
      summary = "USA",
      description = "USA USA USA",
      tags = {"Test"}
  )
  public String USAMessage(@RequestParam String name) {
    return "USA " + name;
  }

}
