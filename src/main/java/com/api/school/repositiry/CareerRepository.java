package com.api.school.repositiry;

import com.api.school.model.CareerModel;

import java.util.List;
import java.util.Optional;

public interface CareerRepository {
    List<CareerModel> findAll();
    Optional<CareerModel> findOne(int id);
    CareerModel save(CareerModel model);
    CareerModel upDate(int id, CareerModel model);
    Boolean delete(int id);
}
