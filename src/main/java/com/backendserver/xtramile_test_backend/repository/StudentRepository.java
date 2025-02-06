package com.backendserver.xtramile_test_backend.repository;

import com.backendserver.xtramile_test_backend.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}