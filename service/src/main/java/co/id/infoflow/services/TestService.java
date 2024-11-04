package co.id.infoflow.services;

import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService {
    @Override
    public String getSay() {
        return "Hello World!";
    }
}
