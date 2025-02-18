package com.example.sp25tutorsof3022.repository;

import com.example.sp25tutorsof3022.model.DanhMuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DanhMucRepo extends JpaRepository<DanhMuc, Integer> {
}
