package com.api.school.repositiry;

import com.api.school.model.ClassModel;

import java.util.List;
import java.util.Optional;

public interface ClassRepository {
    List<ClassModel> findAll();
    Optional<ClassModel> findOne(int classId);
    ClassModel save(ClassModel model);
    ClassModel upDate(int id, ClassModel model);
    boolean delete(int id);
}
