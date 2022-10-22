package com.api.school.repositiry;

import com.api.school.model.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<UserModel> findAll();
    Optional<UserModel> findOne();
    UserModel save(UserModel model);
    UserModel upDate(int id);
    Boolean delete(int id);
}
