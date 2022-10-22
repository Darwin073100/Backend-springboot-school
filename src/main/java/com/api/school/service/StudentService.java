package com.api.school.service;

import com.api.school.model.StudentModel;
import com.api.school.repositiry.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements StudentRepository {
    @Override
    public List<StudentModel> findAll() {
        return null;
    }

    @Override
    public Optional<StudentModel> findOne(int id) {
        return Optional.empty();
    }

    @Override
    public StudentModel save(StudentModel model) {
        return null;
    }

    @Override
    public StudentModel upDate(int id, StudentModel model) {
        return null;
    }

    @Override
    public Boolean delete(int id) {
        return null;
    }
}
