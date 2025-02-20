package com.example.sp25tutorsof3022.repository;

import com.example.sp25tutorsof3022.model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanPhamRepo extends JpaRepository<SanPham, Integer> {
}
