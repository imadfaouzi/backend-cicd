package ma.backend_cicd.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageProvider {

    @Value("${message}")
    private String message;

    public String getMessage() {
        return message;
    }
}
