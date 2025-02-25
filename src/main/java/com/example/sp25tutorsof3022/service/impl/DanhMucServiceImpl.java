package com.example.sp25tutorsof3022.service.impl;

import com.example.sp25tutorsof3022.model.DanhMuc;
import com.example.sp25tutorsof3022.repository.DanhMucRepo;
import com.example.sp25tutorsof3022.service.DanhMucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucServiceImpl implements DanhMucService {
    @Autowired
    DanhMucRepo danhMucRepo;

    @Override
    public Page<DanhMuc> getListDanhMuc(Pageable pageable) {
        return danhMucRepo.findAll(pageable);
    }

    @Override
    public void addDanhMuc(DanhMuc danhMuc) {
        danhMucRepo.save(danhMuc);
    }
}
