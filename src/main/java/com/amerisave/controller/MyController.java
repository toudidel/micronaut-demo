package com.amerisave.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.util.Date;

@Controller
public class MyController {

  @Get("/getdate")
  public String getDate() {
    return (new Date()).toString();
  }
}
