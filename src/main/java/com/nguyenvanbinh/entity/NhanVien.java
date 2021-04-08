package com.nguyenvanbinh.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "NhanVien")
public class NhanVien {

    @Id
    int idNhanVien;
    String tenNhanVien;
    int tuoi;

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

}


