package com.example.sp25tutorsof3022.controller;

import com.example.sp25tutorsof3022.model.NhanVien;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NhanVienController {

    List<NhanVien> nhanVienList = new ArrayList<>();

    public NhanVienController() {
        nhanVienList.add(new NhanVien(1, "Nguyen Van A", 20, "nam", "hoat dong"));
        nhanVienList.add(new NhanVien(2, "Nguyen Van A", 20, "nam", "hoat dong"));
        nhanVienList.add(new NhanVien(3, "Nguyen Van A", 20, "nam", "hoat dong"));
    }

    @GetMapping("/nhan-vien/hien-thi")
    public String hienThi(Model model, @ModelAttribute("nhanVien") NhanVien nhanVien) {
        model.addAttribute("nhanVienList", nhanVienList);
        return "/nhan-vien.html";
    }

    @PostMapping("/nhan-vien/add")
    public String add(@Valid @ModelAttribute NhanVien nhanVien, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("nhanVienList", nhanVienList);
            return "/nhan-vien.html";
        } else {
            nhanVienList.add(nhanVien);
            return "redirect:/nhan-vien/hien-thi";
        }
    }

    @GetMapping("/nhan-vien/delete/{id}")
    public String delete(@PathVariable Integer id, Model model) {
        NhanVien nhanVienDetail = new NhanVien();
        for (NhanVien nhanVien : nhanVienList) {
            if (nhanVien.getId() == id) {
                nhanVienDetail = nhanVien;
            }
        }
        nhanVienList.remove(nhanVienDetail);
        return "redirect:/nhan-vien/hien-thi";
    }
}
