package com.odc.odcdevops.api;

import com.odc.odcdevops.entites.Student;
import com.odc.odcdevops.services.StudentServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentApi {

    private final StudentServices studentServices;

    public StudentApi(StudentServices studentServices) {
        this.studentServices = studentServices;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentServices.createStudent(student);
    }

    @GetMapping
    public List<Student> listStudents() {
        return studentServices.listStudents();
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return studentServices.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentServices.deleteStudent(id);
    }
}