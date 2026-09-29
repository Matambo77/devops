package com.odc.odcdevops.repository;

import com.odc.odcdevops.entites.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}