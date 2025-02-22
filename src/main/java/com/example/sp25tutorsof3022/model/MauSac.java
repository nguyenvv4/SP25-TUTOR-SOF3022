package com.example.sp25tutorsof3022.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "mau_sac")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MauSac {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ma_mau", nullable = false, unique = true)
    private String maMau;

    @Column(name = "ten_mau", nullable = false)
    private String tenMau;

    @Column(name = "trang_thai")
    private String trangThai;

    @Column(name = "ngay_tao")
    private Date ngayTao;

    @Column(name = "ngay_sua")
    private Date ngaySua;


}

