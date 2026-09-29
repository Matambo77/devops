package com.odc.odcdevops.services;

import com.odc.odcdevops.entites.Student;
import com.odc.odcdevops.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {

    private final StudentRepository repository;

    public StudentServices(StudentRepository repository) {
        this.repository = repository;
    }

    public Student createStudent(Student st) {
        return repository.save(st);
    }

    public List<Student> listStudents() {
        return repository.findAll();
    }

    public Student updateStudent(Student st) {
        return repository.save(st);
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}