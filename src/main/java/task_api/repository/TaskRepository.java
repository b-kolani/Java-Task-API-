package task_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import task_api.entity.Task;

public interface  TaskRepository extends JpaRepository<Task, Long> {
}
