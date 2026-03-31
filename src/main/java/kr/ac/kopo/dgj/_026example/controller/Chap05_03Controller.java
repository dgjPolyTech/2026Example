package kr.ac.kopo.dgj._026example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Chap05_03Controller {
    @GetMapping("/chap0503/{id}") // 괄호 안의 지구본 모양 클릭하면, 요청 url 양식 복붙해서 받을 수 있음.
    public String requestMethod3(@PathVariable("id") String userId,
                                 @MatrixVariable("pwd") String userPwd,
                                 Model model){

        model.addAttribute("userId", userId);
        model.addAttribute("userPwd", userPwd);

        return "viewPage05_01";
    }
}
