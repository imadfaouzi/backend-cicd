package ma.backend_cicd.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private MessageProvider messageProvider;

    @GetMapping("/message")
    public String getMessage() {
        return messageProvider.getMessage();
    }
}
