package com.example.sp25tutorsof3022.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DanhMucDto {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "ten_danh_muc")
    private String tenDanhMuc;

    @Column(name = "so_luong_sp")
    private Integer soLuongSp;
}
