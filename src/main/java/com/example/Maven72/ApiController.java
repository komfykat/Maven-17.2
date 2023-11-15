package com.example.Maven72;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class ApiController {
    @GetMapping("books")
    public ResponseEntity<String> getText() {
        return ResponseEntity.ok("Я, Воркожоков Максим, сделал работу, и у меня получилось создать и запустить сервис");
    }
}
