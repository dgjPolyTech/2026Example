package kr.ac.kopo.dgj._026example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


// RestController 는 string 형태 데이터(json, xml 등)을 반환하는 것에 사용함.
@Controller
public class EX03Controller {
    // 여기는 url을 따로 지정 안해줬으니, exam03만 실행했을 때에는 얘가 디폴트로 실행됨.
    // method는 get이 디폴트로 실행됨.
    @RequestMapping(value = "/exam03", method= RequestMethod.GET)
    public String requestMethod(){
        return "view03";
    }

    @RequestMapping(value="/exam03_1", method=RequestMethod.GET) // /exam03/exam03_1로 쓰면 얘가 실행됨.
    public String requestMethod2(){
        return "view04";
    }
}
