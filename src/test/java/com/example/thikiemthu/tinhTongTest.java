package com.example.thikiemthu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tinhTongTest {

    tinhTong tong = new tinhTong();

    @Test
    public void testTong(){

        int[] mang = {1,2,3,4,5,6};

        assertEquals(tong.tong(mang), 6);

    }

    @Test
    public void testTongMangla6(){

        int[] mang = {6};

        assertEquals(tong.tong(mang), 0);

    }

    @Test
    public void testTongMangNull(){


        Exception exception = assertThrows(IllegalArgumentException.class, ()->tong.tong(null));

        assertEquals(exception.getMessage(), "mảng không đc null");

    }

    @Test
    public void testTongMangAm(){


        int[] mang = {-1,-2,-3,-4,-5,-6};

        assertEquals(tong.tong(mang), -6);

    }

    @Test
    public void testTongMangCoGiaTriLaSoLe(){

        int[] mang = {5,7};

        assertEquals(tong.tong(mang), 0);

    }



}