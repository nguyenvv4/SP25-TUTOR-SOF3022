package com.example.sp25tutorsof3022.controller;

import com.example.sp25tutorsof3022.model.DanhMuc;
import com.example.sp25tutorsof3022.model.SanPham;
import com.example.sp25tutorsof3022.repository.DanhMucRepo;
import com.example.sp25tutorsof3022.repository.SanPhamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.util.List;

@Controller
public class SanPhamController {

    @Autowired
    SanPhamRepo sanPhamRepo;

    @Autowired
    DanhMucRepo danhMucRepo;

    @GetMapping("/san-pham/hien-thi")
    public String hienThi(Model model) {
        List<DanhMuc> listDanhMuc = danhMucRepo.findAll();
        model.addAttribute("listDanhMuc", listDanhMuc);
        List<SanPham> sanPhamList = sanPhamRepo.findAll();
//        List<SanPham> sanPhamList = sanPhamRepo.timKiemTheoTenVaTrangThai("Ao thun nam co tron","Hoat dong");
        model.addAttribute("sanPhamList", sanPhamList);
        return "/san-pham/trang-chu.html";
    }

    @PostMapping("/sam-pham/add")
    public String addSanPham(SanPham sanPham) {
        System.out.println(sanPham.toString());
        sanPham.setNgaySua(new Date());
        sanPham.setNgayTao(new Date());
        sanPhamRepo.save(sanPham);
        return "redirect:/san-pham/hien-thi";
    }

    @GetMapping("/san-pham/delete/{id}")
    public String deleteSanPham(@PathVariable("id") Integer id) {
        sanPhamRepo.deleteById(id);
        return "redirect:/san-pham/hien-thi";
    }

    @GetMapping("/san-pham/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model) {
        List<DanhMuc> listDanhMuc = danhMucRepo.findAll();
        model.addAttribute("listDanhMuc", listDanhMuc);
        SanPham sanPham = sanPhamRepo.findById(id).get();
        model.addAttribute("sanPham", sanPham);
        return "/san-pham/detail.html";
    }
}
