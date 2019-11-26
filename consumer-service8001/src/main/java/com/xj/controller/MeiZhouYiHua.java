package com.xj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mzyh")
public class MeiZhouYiHua {
    @RequestMapping("toIndex")
    public String toIndex(Model model){
        return "FrontDesk/MeiZhouYiHua";
    }
}
