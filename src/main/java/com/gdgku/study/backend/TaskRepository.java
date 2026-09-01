package com.gdgku.study.backend;

import org.springframework.data.jpa.repository.JpaRepository;

// No implementation. Spring generates one at runtime.
public interface TaskRepository extends JpaRepository<Task, Long> {
}
