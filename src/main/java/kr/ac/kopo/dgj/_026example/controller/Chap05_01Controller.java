package kr.ac.kopo.dgj._026example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Chap05_01Controller {
    @GetMapping("/chap0501") // 괄호 안의 지구본 모양 클릭하면, 요청 url 양식 복붙해서 받을 수 있음.
    public String requestMethod(@RequestParam("id") String userId,
                                @RequestParam("pwd") String userPwd,
                                Model model){

        model.addAttribute("userId", userId);
        model.addAttribute("userPwd", userPwd);

        return "viewPage05_01";
    }

    @GetMapping("/chap0502") // 값이 없을 때 기본값을 관리자로 지정할 수 있다.
    public String requestMethod2(@RequestParam(value = "id", defaultValue = "관리자") String userId,
                                @RequestParam("pwd") String userPwd,
                                Model model){

        model.addAttribute("userId", userId);
        model.addAttribute("userPwd", userPwd);

        return "viewPage05_01";
    }

    @GetMapping("/chap0504/{id1}/user/{id2}") //
    public String requestMethod4(
            @MatrixVariable(pathVar = "id1") MultiValueMap<String, String> var1,
            @MatrixVariable(pathVar = "id2") MultiValueMap<String, String> var2,
            Model model){

        model.addAttribute("title1", var1);
        model.addAttribute("title2", var2);

        return "viewPage";
    }

}
