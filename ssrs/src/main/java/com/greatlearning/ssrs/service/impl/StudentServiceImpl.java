package com.greatlearning.ssrs.service.impl;

import com.greatlearning.ssrs.entity.Student;
import com.greatlearning.ssrs.repository.StudentRepository;
import com.greatlearning.ssrs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository repository;

    @Override
    public List<Student> findAll() {
        List<Student> students = repository.findAll();
        return students;
    }

    @Override
    public void save(Student student) {
        repository.save(student);
    }

    @Override
    public Student findById(int studentId) {
        return repository.findById(studentId).get();
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
