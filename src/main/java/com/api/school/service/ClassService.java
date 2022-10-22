package com.api.school.service;

import com.api.school.JPA.ClassJPA;
import com.api.school.model.ClassModel;
import com.api.school.repositiry.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassService implements ClassRepository {

    @Autowired
    private ClassJPA classJPA;

    @Override
    public List<ClassModel> findAll() {
        return (List<ClassModel>) classJPA.findAll();
    }

    @Override
    public Optional<ClassModel> findOne(int classId) {
        return classJPA.findById(classId);
    }

    @Override
    public ClassModel save(ClassModel model) {
        return classJPA.save(model);
    }

    @Override
    public ClassModel upDate(int id, ClassModel model) {
        model.setId(id);
        return classJPA.saveAndFlush(model);
    }

    @Override
    public Boolean delete(int id) {
        return findOne(id).map(classModel -> {
            classJPA.deleteById(id);
            return true;
        }).orElse(false);
    }
}
