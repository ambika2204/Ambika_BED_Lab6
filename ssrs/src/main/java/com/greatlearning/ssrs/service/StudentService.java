package com.greatlearning.ssrs.service;

import com.greatlearning.ssrs.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {


    public List<Student> findAll();

    public void save(Student student);

    public Student findById(int id);

    public void deleteById(int id);

}
