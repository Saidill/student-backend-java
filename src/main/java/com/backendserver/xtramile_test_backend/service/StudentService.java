package com.backendserver.xtramile_test_backend.service;

import com.backendserver.xtramile_test_backend.dto.StudentDTO;
import com.backendserver.xtramile_test_backend.entity.Student;
import com.backendserver.xtramile_test_backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    // GetAll
    public List<StudentDTO> getAllStudents() {
        return studentRepository.findAll().stream()
                .map(s -> new StudentDTO(s.getId(), s.getNamaDepan(), s.getNamaBelakang(), s.getTanggalLahir()))
                .collect(Collectors.toList());
    }

    // Add Student
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Delete Student
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    // Update Student
    public Student updateStudent(Long id, Student studentDetails) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mahasiswa tidak ditemukan"));

        student.setNamaDepan(studentDetails.getNamaDepan());
        student.setNamaBelakang(studentDetails.getNamaBelakang());
        student.setTanggalLahir(studentDetails.getTanggalLahir());

        return studentRepository.save(student);
    }

}