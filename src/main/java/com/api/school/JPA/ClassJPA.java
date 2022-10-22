package com.api.school.JPA;

import com.api.school.model.ClassModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassJPA extends JpaRepository<ClassModel, Integer> {
}
