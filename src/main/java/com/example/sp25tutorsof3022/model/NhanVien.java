package com.example.sp25tutorsof3022.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NhanVien {

    private Integer id;

    @NotBlank(message = "Ten khong duoc de trong")
    private String hoTen;

    @NotNull(message = "Tuoi khong duoc de trong")
    private Integer tuoi;

    @NotBlank(message = "Gioi tinh khong duoc de trong")
    private String gioiTinh;

    @NotBlank(message = "Trang thai khong duoc de trong")
    private String trangThai;
}
