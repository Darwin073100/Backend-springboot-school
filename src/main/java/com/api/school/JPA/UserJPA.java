package com.api.school.JPA;

import com.api.school.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPA extends JpaRepository<UserModel, Integer> {
}
