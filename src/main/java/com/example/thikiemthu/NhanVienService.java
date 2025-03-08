package com.example.thikiemthu;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {

    List<NhanVien> listNhanvien = new ArrayList<>();

    public void them(NhanVien nhanVien){

        listNhanvien.add(nhanVien);
    }

    public NhanVien getStudentById(String ma) {

        for (NhanVien nhanVien: listNhanvien) {
            if (nhanVien.getMa() == ma) {
                return nhanVien;
            }
        }

        return null;
    }


    public void sua(NhanVien nhanVien){

        if(nhanVien == null ){
            throw new IllegalArgumentException("nhân viên không đc null");
        }

        for (int i = 0; i < listNhanvien.size(); i++) {
            if (listNhanvien.get(i).equals(nhanVien)) {
                listNhanvien.set(i, nhanVien);
            }else {
                throw new IllegalArgumentException("không tìm thấy nhân viên");
            }
        }

    }

}
