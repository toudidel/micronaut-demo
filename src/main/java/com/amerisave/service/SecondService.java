package com.amerisave.service;

import jakarta.inject.Singleton;

@Singleton
public class SecondService implements ISecondService {

    @Override
    public String secondMethod() {
        return "Hello world from SecondService";
    }
}
