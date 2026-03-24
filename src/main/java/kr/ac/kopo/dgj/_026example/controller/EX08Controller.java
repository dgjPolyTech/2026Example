package kr.ac.kopo.dgj._026example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EX08Controller {
    @GetMapping("exam08")
    public ModelAndView requestMethod(){
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("title1", "modelAndView 연습");
        modelView.addObject("title2", "modelAndView는 addObject와 serViewwName(을 사용)");
        modelView.setViewName("view page");

        return modelView;
    }
}
