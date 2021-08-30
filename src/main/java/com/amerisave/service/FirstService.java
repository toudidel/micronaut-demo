package com.amerisave.service;

import jakarta.inject.Singleton;

@Singleton
public class FirstService implements IFirstService {

    @Override
    public String firstMethod() {
        return "Hello world from FirstService";
    }
}
