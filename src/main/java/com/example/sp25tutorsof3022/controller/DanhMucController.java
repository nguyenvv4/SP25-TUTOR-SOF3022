package com.example.sp25tutorsof3022.controller;

import com.example.sp25tutorsof3022.model.DanhMuc;
import com.example.sp25tutorsof3022.repository.DanhMucRepo;
import com.example.sp25tutorsof3022.service.DanhMucService;
import com.example.sp25tutorsof3022.service.impl.DanhMucServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.util.List;

@Controller
public class DanhMucController {

    @Autowired
    DanhMucService danhMucService;

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
        danhMucService.addDanhMuc(danhMuc);
        return "redirect:/danh-muc/hien-thi";
    }

    @GetMapping("/phan-trang")
    public String phanTrang(Model model, Pageable pageable) {
        Page<DanhMuc> list = danhMucService.getListDanhMuc(pageable);
        model.addAttribute("list", list.getContent());
        return "/danh-muc/trang-chu.html";
    }

    @Scheduled(fixedRate = 3000)
    public void test(){
        System.out.println(new Date());
    }
}
