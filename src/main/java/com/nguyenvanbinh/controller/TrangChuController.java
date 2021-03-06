package com.nguyenvanbinh.controller;

import com.nguyenvanbinh.entity.NhanVien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class TrangChuController {

    @Autowired
    SessionFactory sessionFactory;

    @GetMapping
    @Transactional

    public String Default() {

        Session session = sessionFactory.getCurrentSession();
        String sql = "from NhanVien";
        List<NhanVien> list = session.createQuery(sql).getResultList();

        for(NhanVien nv : list) {
            System.out.println("name:" + nv.getTenNhanVien());
        }
        return "homepage";
    }
}
