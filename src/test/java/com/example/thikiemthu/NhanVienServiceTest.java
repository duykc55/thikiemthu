package com.example.thikiemthu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {

    NhanVienService nvs = new NhanVienService();

    @Test
    void testSuaAll() {

        NhanVien nhanVien = new NhanVien("a","a",1,1,1,"a");
        nvs.them(nhanVien);


        nhanVien.setTen("b");
        nhanVien.setLuong(8);
        nvs.sua(nhanVien);

        assertEquals("b", nvs.getStudentById("a").getTen());
        assertEquals(8, nvs.getStudentById("a").getLuong());

    }


    @Test
    void themTenNull() {


        Exception exception = assertThrows(IllegalArgumentException.class, ()->nvs.sua(new NhanVien(null,"a",1,1,1,"a")));

        assertEquals("tên không đc null",exception.getMessage());

    }

    @Test
    void themMaNull() {


        Exception exception = assertThrows(IllegalArgumentException.class, ()->nvs.sua(new NhanVien("as",null,1,1,1,"a")));

        assertEquals("mã không đc null",exception.getMessage());

    }

    @Test
    void suaMaNull() {


        Exception exception = assertThrows(IllegalArgumentException.class, ()->nvs.sua(null));

        assertEquals("nhân viên không đc null",exception.getMessage());

    }

    @Test
    void suaPhongBanNull() {


        Exception exception = assertThrows(IllegalArgumentException.class, ()->nvs.sua(new NhanVien("as","a",1,1,1,null)));

        assertEquals("phong ban không đc null",exception.getMessage());


    }



}