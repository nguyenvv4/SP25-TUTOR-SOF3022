package com.example.sp25tutorsof3022.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Table(name = "san_pham")
@Entity
@Data
public class SanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "ten_san_pham")
    private String tenSanPham;

    @Column(name = "ma_san_pham")
    private String maSanPham;

    @Column(name = "trang_thai")
    private String trangThai;

    @Column(name = "ngay_tao")
    @Temporal(TemporalType.DATE)
    private Date ngayTao;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "ngay_sua")
    @Temporal(TemporalType.DATE)
    private Date ngaySua;

    @JoinColumn(name = "id_danh_muc")
    @ManyToOne
    private DanhMuc idDanhMuc;

    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", maSanPham='" + maSanPham + '\'' +
                ", trangThai='" + trangThai + '\'' +
                ", ngayTao=" + ngayTao +
                ", moTa='" + moTa + '\'' +
                ", ngaySua=" + ngaySua +
                ", idDanhMuc=" + idDanhMuc +
                '}';
    }
}
