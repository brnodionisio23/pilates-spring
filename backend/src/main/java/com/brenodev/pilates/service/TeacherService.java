package com.brenodev.pilates.service;

import com.brenodev.pilates.model.Teacher;
import com.brenodev.pilates.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher save(Teacher teacher){
        return teacherRepository.save(teacher);
    }

    public List<Teacher> findAll() {
        List<Teacher> teachers = teacherRepository.findAll();
        return teachers;
    }

}
