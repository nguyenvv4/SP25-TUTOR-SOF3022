package com.example.sp25tutorsof3022.model;


import lombok.Data;
import jakarta.persistence.*;

import java.util.Date;

@Data
@Entity
@Table(name = "Danh_muc")
public class DanhMuc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ma_danh_muc")
    private String maDanhMuc;

    @Column(name = "ten_danh_muc")
    private String tenDanhMuc;

    @Column(name = "trang_thai")
    private String trangThai;

    @Column(name = "ngay_tao")
    @Temporal(TemporalType.DATE) // lay dinh dang ngay thang nam
    private Date ngayTao;

    @Temporal(TemporalType.DATE)
    @Column(name = "ngay_sua")
    private Date ngaySua;

    @Override
    public String toString() {
        return "DanhMuc{" +
                "id=" + id +
                ", maDanhMuc='" + maDanhMuc + '\'' +
                ", tenDanhMuc='" + tenDanhMuc + '\'' +
                ", trangThai='" + trangThai + '\'' +
                ", ngayTao=" + ngayTao +
                ", ngaySua=" + ngaySua +
                '}';
    }
}
