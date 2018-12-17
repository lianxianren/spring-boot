package com.baizhi.controller;

import com.baizhi.entity.Province;
import com.baizhi.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/province")
public class ProvinceController {
    @Autowired
    ProvinceService provinceService;

    @RequestMapping("/showAll")
    public String showAll(Model model) {
        List<Province> list = provinceService.getAll();
        model.addAttribute("list", list);
        return "province";
    }

}
