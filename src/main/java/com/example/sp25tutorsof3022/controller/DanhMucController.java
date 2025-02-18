package com.example.sp25tutorsof3022.controller;

import com.example.sp25tutorsof3022.model.DanhMuc;
import com.example.sp25tutorsof3022.repository.DanhMucRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.util.List;

@Controller
public class DanhMucController {

    @Autowired
    DanhMucRepo danhMucRepo;

//    @GetMapping("/danh-muc/hien-thi")
//    public String hienThi(Model model) {
//        List<DanhMuc> list = danhMucRepo.findAll();
//        model.addAttribute("list", list);
//        return "/danh-muc/trang-chu.html";
//    }

    @PostMapping("/danh-muc/add")
    public String add(DanhMuc danhMuc) {
        danhMuc.setNgayTao(new Date());
        danhMuc.setNgaySua(new Date());
        danhMucRepo.save(danhMuc);
        return "redirect:/danh-muc/hien-thi";
    }

    @GetMapping("/phan-trang")
    public String phanTrang(Model model, Pageable pageable) {
        Page<DanhMuc> list = danhMucRepo.findAll(pageable);
        model.addAttribute("list", list.getContent());
        return "/danh-muc/trang-chu.html";
    }
}
