package com.example.sp25tutorsof3022.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "ctsp")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ctsp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_sp", nullable = false)
    private SanPham sanPham;

    @ManyToOne
    @JoinColumn(name = "id_mau_sac", nullable = false)
    private MauSac mauSac;

    @ManyToOne
    @JoinColumn(name = "id_size", nullable = false)
    private Size size;

    @Column(name = "gia_ban", nullable = false)
    private Double giaBan;

    @Column(name = "so_luong_ton", nullable = false)
    private Integer soLuongTon;

    @Column(name = "trang_thai")
    private String trangThai;

    @Column(name = "ngay_tao")
    private Date ngayTao;

    @Column(name = "ngay_sua")
    private Date ngaySua;

    public String convertGiaBan(){
        return giaBan.toString();
    }
}
