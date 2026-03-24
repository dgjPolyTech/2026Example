package kr.ac.kopo.dgj._026example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/home")
public class EX05Controller {
    @GetMapping("/exam05")
    public String requestMethod(){
        return "view05"; // 여기 그냥 html 파일명만 적어줘도 리턴 잘 된다.
    }
}
