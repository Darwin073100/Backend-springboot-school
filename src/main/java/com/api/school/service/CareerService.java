package com.api.school.service;

import com.api.school.model.CareerModel;
import com.api.school.repositiry.CareerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CareerService implements CareerRepository {
    @Override
    public List<CareerModel> findAll() {
        return null;
    }

    @Override
    public Optional<CareerModel> findOne(int id) {
        return Optional.empty();
    }

    @Override
    public CareerModel save(CareerModel model) {
        return null;
    }

    @Override
    public CareerModel upDate(int id, CareerModel model) {
        return null;
    }

    @Override
    public Boolean delete(int id) {
        return null;
    }
}
