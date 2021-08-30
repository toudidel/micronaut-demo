package com.amerisave.controller;

import com.amerisave.service.IFirstService;
import com.amerisave.service.ISecondService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ServiceController {

    private final IFirstService firstService;
    @Inject
    ISecondService secondService;

    @Get("/service/1")
    public String first() {
        return firstService.firstMethod();
    }

    @Get("/service/2")
    public String second() {
        return secondService.secondMethod();
    }
}
