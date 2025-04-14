package com.brenodev.pilates.service;

import com.brenodev.pilates.model.Teacher;
import com.brenodev.pilates.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherService;

    public ResponseEntity<List<Teacher>> readList(){
        List<Teacher> teachers = teacherService.findAll();
        return new ResponseEntity<>(teachers, HttpStatus.OK);
    }
}
