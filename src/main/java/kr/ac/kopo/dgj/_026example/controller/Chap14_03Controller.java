package kr.ac.kopo.dgj._026example.controller;

import kr.ac.kopo.dgj._026example.domain.Detail;
import kr.ac.kopo.dgj._026example.domain.Member3;
import kr.ac.kopo.dgj._026example.domain.Product2;
import kr.ac.kopo.dgj._026example.repository.DetailRepository;
import kr.ac.kopo.dgj._026example.repository.Member3Repository2;
import kr.ac.kopo.dgj._026example.repository.Product2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

// JPA 첫번째 예제
@Controller
@RequestMapping("/exam14_03")
public class Chap14_03Controller {
    @Autowired
    private Product2Repository product2Repository;

    @Autowired
    private DetailRepository detailRepository;

    @GetMapping
    public String requestInsert(Model model){
        Product2 product2 = new Product2();
        Detail detail = new Detail();

        product2.setName("아이폰듀오");
        product2.setPrice(3500000);

        detail.setDescription("아이폰 최초 폴더폰:너무 비쌈");
        detail.setWeight(300);
        detail.setWidth(124.5f);
        detail.setHeight(132.7f);
        product2.setDetail(detail);

        product2Repository.save(product2);

        Iterable<Product2> product2List = product2Repository.findAll();
        Iterable<Detail> detailList = detailRepository.findAll();

        model.addAttribute("product2List", product2List);
        model.addAttribute("detailList", detailList);

        return "viewPage04";
    }
}
