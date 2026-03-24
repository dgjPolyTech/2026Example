package kr.ac.kopo.dgj._026example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// RestController 는 string 형태 데이터(json, xml 등)을 반환하는 것에 사용함.
@RestController
public class EX02Controller {
    @RequestMapping(value = "/exam02", method= RequestMethod.GET)
    public String requestMethod(){
        return "<h1>@RestController 연습 중</h1>";
    }
}
