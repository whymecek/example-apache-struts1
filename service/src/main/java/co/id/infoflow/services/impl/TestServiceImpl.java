package co.id.infoflow.services.impl;

import co.id.infoflow.services.TestService;


public class TestServiceImpl implements TestService {

    @Override
    public String getSay() {
        return "Hello World!";
    }
}
