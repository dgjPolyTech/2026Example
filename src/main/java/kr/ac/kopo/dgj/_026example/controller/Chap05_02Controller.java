package kr.ac.kopo.dgj._026example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Calendar;

@Controller
public class Chap05_02Controller {

    @GetMapping("/chap0502/{name}/{birthYear}")
    public String requestMethod(@PathVariable("name") String name,
                                @PathVariable("birthYear") int birthYear,
                                Model model){

        // 날짜나 나이 계산은 Calendar 사용(dar임)
        Calendar calender = Calendar.getInstance();
        int nowYear = calender.get(Calendar.YEAR);
        int age = nowYear - birthYear;

        model.addAttribute("name", name);
        model.addAttribute("age", age);

        return "viewPage05_02";
    }
}
