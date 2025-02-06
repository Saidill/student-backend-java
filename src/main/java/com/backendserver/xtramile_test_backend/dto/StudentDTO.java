package com.backendserver.xtramile_test_backend.dto;

import java.time.LocalDate;
import java.time.Period;

public class StudentDTO {
    private Long id;
    private String namaLengkap;
    private LocalDate tanggalLahir;
    private int usia;

    // Constructor
    public StudentDTO(Long id, String namaDepan, String namaBelakang, LocalDate tanggalLahir) {
        this.id = id;
        this.namaLengkap = (namaBelakang == null || namaBelakang.isEmpty()) ? namaDepan : namaDepan + " " + namaBelakang;
        this.tanggalLahir = tanggalLahir;
        this.usia = Period.between(tanggalLahir, LocalDate.now()).getYears();
    }

    // Getter & Setter
    public Long getId() { return id; }
    public String getNamaLengkap() { return namaLengkap; }
    public LocalDate getTanggalLahir() { return tanggalLahir; }
    public int getUsia() { return usia; }
}
