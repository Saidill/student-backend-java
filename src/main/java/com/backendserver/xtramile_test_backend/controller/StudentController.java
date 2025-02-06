package com.backendserver.xtramile_test_backend.controller;

import com.backendserver.xtramile_test_backend.dto.StudentDTO;
import com.backendserver.xtramile_test_backend.entity.Student;
import com.backendserver.xtramile_test_backend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {
    @Autowired
    private StudentService studentService;

    // GET: Ambil daftar mahasiswa sebagai DTO
    @GetMapping
    public List<StudentDTO> getStudents() {
        return studentService.getAllStudents();
    }

    // POST: Tambah mahasiswa baru
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    // DELETE: Hapus mahasiswa
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

    // PUT: Update mahasiswa
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
        return studentService.updateStudent(id, studentDetails);
    }

}