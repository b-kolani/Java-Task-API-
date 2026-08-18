package task_api.service;

import org.springframework.stereotype.Service;
import task_api.entity.Task;
import task_api.repository.TaskRepository;

import java.util.List;

@Service
public class TaskService {
    
    private final TaskRepository  taskRepository;

    public  TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task>   getAllTasks() {
        return taskRepository.findAll();
    }

    public  Task        createTask(Task task) {
        return taskRepository.save(task);
    }
}
