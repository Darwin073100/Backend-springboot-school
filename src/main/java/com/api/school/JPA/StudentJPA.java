package com.api.school.JPA;

import com.api.school.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJPA extends JpaRepository<StudentModel, Integer> {
}
