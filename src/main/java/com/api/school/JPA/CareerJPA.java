package com.api.school.JPA;

import com.api.school.model.CareerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CareerJPA extends JpaRepository<CareerModel, Integer> {
}
