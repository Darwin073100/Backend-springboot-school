package com.api.school.service;

import com.api.school.model.UserModel;
import com.api.school.repositiry.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserRepository {
    @Override
    public List<UserModel> findAll() {
        return null;
    }

    @Override
    public Optional<UserModel> findOne() {
        return Optional.empty();
    }

    @Override
    public UserModel save(UserModel model) {
        return null;
    }

    @Override
    public UserModel upDate(int id) {
        return null;
    }

    @Override
    public Boolean delete(int id) {
        return null;
    }
}
