package task_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskApiController {

    @GetMapping("/api/tasks")
    public String getTasks() {
        return "Task API is working!";
    }
}
