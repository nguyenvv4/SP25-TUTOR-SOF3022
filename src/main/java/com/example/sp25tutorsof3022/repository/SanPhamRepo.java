package com.example.sp25tutorsof3022.repository;

import com.example.sp25tutorsof3022.model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SanPhamRepo extends JpaRepository<SanPham, Integer> {

    @Query(value = "select * from san_pham where ten_san_pham = :tenSp And trang_thai = :trangThai", nativeQuery = true)
    List<SanPham> timKiemTheoTenVaTrangThai(String tenSp, String trangThai);
}
