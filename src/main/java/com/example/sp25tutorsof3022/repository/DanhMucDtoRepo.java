package com.example.sp25tutorsof3022.repository;

import com.example.sp25tutorsof3022.model.DanhMucDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DanhMucDtoRepo extends JpaRepository<DanhMucDto, Integer> {

    @Query(value = "select d.id, d.ten_danh_muc , count(*) as so_luong_sp\n" +
            "from danh_muc d inner join san_pham sp \n" +
            "on d.id = sp.id_danh_muc \n" +
            "GROUP BY d.id,d.ten_danh_muc", nativeQuery = true)
    List<DanhMucDto> getDanhMuc();
}
