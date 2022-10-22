package com.api.school.router;

import com.api.school.model.ClassModel;
import com.api.school.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassRouter {
    @Autowired
    private ClassService service;

    @GetMapping("")
    public ResponseEntity<List<ClassModel>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClassModel> findOne(@PathVariable int id){
        return service.findOne(id)
                .map(classModel -> new ResponseEntity<>(classModel, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("")
    public ResponseEntity<ClassModel> save(@RequestBody ClassModel model){
        return new ResponseEntity<>(service.save(model), HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ClassModel> update(@PathVariable int id, @RequestBody ClassModel model){
        return new ResponseEntity<>(service.upDate(id, model), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id){
        if(service.delete(id)){
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
