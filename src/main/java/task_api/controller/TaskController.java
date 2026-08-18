package task_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import task_api.entity.Task;
import task_api.service.TaskService;

import java.util.List;

@RestController
public class TaskController {

    private final   TaskService taskService;

    public  TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/api/tasks")
    public List<Task>   getTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping("/api/tasks")
    public Task         createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }
}
