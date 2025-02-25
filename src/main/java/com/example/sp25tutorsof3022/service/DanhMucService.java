package com.example.sp25tutorsof3022.service;

import com.example.sp25tutorsof3022.model.DanhMuc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DanhMucService {

    Page<DanhMuc> getListDanhMuc(Pageable pageable);

    void addDanhMuc(DanhMuc danhMuc);
}
