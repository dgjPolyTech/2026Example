package kr.ac.kopo.dgj._026example.controller;

import kr.ac.kopo.dgj._026example.domain.Member3;
import kr.ac.kopo.dgj._026example.repository.Member3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

// JPA 첫번째 예제
@Controller
@RequestMapping("/exam14_01")
public class Chap14_01Controller {
    @Autowired
    Member3Repository repository;

    @GetMapping
    public String viewHomePage(Model model){
        Iterable<Member3> memberList = repository.findAll();
        model.addAttribute("memberList", memberList);
        return "viewPage02";
    }

    // Create를 위한 입력 화면
    @GetMapping("/new")
    public String newMember3(Model model){
        Member3 member3 = new Member3();
        model.addAttribute("member", member3);
        return "viewPage02_new";
    }

    // Create(insert) 실행
    @PostMapping("/insert")
    public String insertMember(@ModelAttribute("member") Member3 member3) {
        repository.save(member3);
        return "redirect:/exam14_01";
    }

    @GetMapping("/edit/{id}")
    public String updateInputMethod(@PathVariable(name = "id") int id, Model model) {
        Optional<Member3> member3 =  repository.findById(id);
        model.addAttribute("member", member3);
        return "viewPage02_edit";
    }

    @PostMapping("/update")
    public String updateMember(@ModelAttribute("member") Member3 member3) {
        repository.save(member3);
        return "redirect:/exam14_01";
    }

    @GetMapping("/delete/{id}")
    public String deleteMember(@PathVariable(name = "id") int id) {
        repository.deleteById(id);

        return "redirect:/exam14_01";
    }
}
