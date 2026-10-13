package kr.ac.kopo.dgj._026example.controller;

import kr.ac.kopo.dgj._026example.domain.Member3;
import kr.ac.kopo.dgj._026example.repository.Member3Repository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// JPA 첫번째 예제
@Controller
@RequestMapping("/exam14_02")
public class Chap14_02Controller {
    @Autowired
    Member3Repository2 repository;

    @GetMapping
    public String viewHomePage(Model model){
        Iterable<Member3> memberList = repository.selectMembers();
        model.addAttribute("memberList", memberList);
        return "viewPage03";
    }

    // Create를 위한 입력 화면
    @GetMapping("/new")
    public String newMember3(Model model){
        Member3 member3 = new Member3();
        model.addAttribute("member", member3);
        return "viewPage03_new";
    }

    // Create(insert) 실행
    @PostMapping("/insert")
    public String insertMember(@ModelAttribute("member") Member3 member3) {
        repository.insertMember(member3.getName(), member3.getAge(), member3.getEmail());
        return "redirect:/exam14_02";
    }

    @GetMapping("/edit/{id}")
    public String updateInputMethod(@PathVariable(name = "id") int id, Model model) {
        Member3 member3 =  repository.selectById(id);
        model.addAttribute("member", member3);
        return "viewPage03_edit";
    }

    @PostMapping("/update")
    public String updateMember(@ModelAttribute("member") Member3 member3) {
        repository.updateMember(member3.getName(), member3.getAge(), member3.getEmail(), member3.getId());
        return "redirect:/exam14_02";
    }

    @GetMapping("/delete/{id}")
    public String deleteMember(@PathVariable(name = "id") int id) {
        repository.deleteById(id);

        return "redirect:/exam14_02";
    }
}
