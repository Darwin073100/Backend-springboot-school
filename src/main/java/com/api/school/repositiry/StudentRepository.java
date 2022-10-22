package com.api.school.repositiry;

import com.api.school.model.StudentModel;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
    List<StudentModel> findAll();
    Optional<StudentModel> findOne(int id);
    StudentModel save(StudentModel model);
    StudentModel upDate(int id, StudentModel model);
    Boolean delete(int id);
}
