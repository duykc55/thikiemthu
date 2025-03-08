package com.example.thikiemthu;

public class tinhTong {

    public int tong(int[] mang){

        int tong = 0;

        if(mang == null || mang.length <= 0 ){
            throw new IllegalArgumentException("mảng không đc null");
        }

        for(int i = 0; i < mang.length; i++){

            if(mang[i] % 6 != 0){
                if(mang[i] % 2 == 0){
                    tong += mang[i];
                }
            }

        }

        return tong;
    }

}
