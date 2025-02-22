package com.example.sp25tutorsof3022.controller;

import com.example.sp25tutorsof3022.model.Ctsp;
import com.example.sp25tutorsof3022.model.DanhMucDto;
import com.example.sp25tutorsof3022.model.DmDto;
import com.example.sp25tutorsof3022.repository.CtspRepo;
import com.example.sp25tutorsof3022.repository.DanhMucDtoRepo;
import com.example.sp25tutorsof3022.repository.DanhMucRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CtspController {

    // hien thi thong tin
    // 1.id ctsp, ten san pham, mau sac, so luong ton, size, ten danh muc
    //2. hien thi ten danh muc va số lượng sản phẩm có trong danh mục đó
    // - cach 1=> tao doi tuong moi => Query
    // cach 2 => tao interface moi => query
    // 3,. hien thị sản phẩm và tổng số lươg tồn của sản phẩm đó

    @Autowired
    CtspRepo ctspRepo;
    @Autowired
    private DanhMucRepo danhMucRepo;

    @GetMapping("/ctsp/hien-thi")
    public String hienThi(Model model) {
        List<Ctsp> list = ctspRepo.findAll();
        model.addAttribute("list", list);
        return "ctsp";
    }

    @Autowired
    DanhMucDtoRepo danhMucDtoRepo;

    @GetMapping("/danh-muc/dto")
    public String hienThiDto(Model model){
//        List<DanhMucDto> listDanhMucDto = danhMucDtoRepo.getDanhMuc();
        List<DmDto> listDanhMucDto = danhMucRepo.getDanhMucDtoInterface();
        model.addAttribute("listDanhMucDto", listDanhMucDto);
        return "ctsp";
    }

}
