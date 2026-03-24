package kr.ac.kopo.dgj._026example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EX06Controller {
//    @GetMapping("/exam06")
//    public String requestMethod(Model model){ // 이 메소드를 호출하면, model에 아래 속성(attribute)가 추가되고 이를 viewPage에서 사용할 수가 있음.
//        model.addAttribute("title1", "Model 유형연습1");
//        model.addAttribute("title2", "문자열 값 또는 객체 참조값 전달 가능");
//        return "viewPage";
//    }

    @GetMapping("/exam06")
    public String requestMethod(Model model){
        // 이 메소드를 호출하면, model에 아래 속성(attribute)가 추가되고 이를 viewPage에서 사용할 수가 있음.
        // title1이 key이고, Model 유형연습1을 value라고 함.
        model.addAttribute("title1", "Model 유형연습1");
        model.addAttribute("title2", "문자열 값 또는 객체 참조값 전달 가능");
        return "view06";
    }
}
