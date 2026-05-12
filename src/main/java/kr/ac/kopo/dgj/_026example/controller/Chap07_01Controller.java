package kr.ac.kopo.dgj._026example.controller;

import kr.ac.kopo.dgj._026example.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

@Controller
@RequestMapping("/chap07")
public class Chap07_01Controller {

    @GetMapping("/form")
    public String requestForm(){
        return "viewFilePage";
    }

    // form을 submit하여 post 하면 실행되게 된다.
    // MultiPart는 전송을 받은 파일
    // SaveFile은 내 컴터에 저장을 할 파일
    @PostMapping("/form")
    public String requestFileUploadResult(@ModelAttribute Member member, Model model){
//    public String requestFileUploadResult(@RequestParam("name") String name, @RequestParam("fileImage") MultipartFile file, Model model){
//    public String requestFileUploadResult(MultipartHttpServletRequest request, Model model){
        String name = member.getName();
        MultipartFile file = member.getFileImage();

        String originFileName = file.getOriginalFilename();
        File saveFile = new File("d:\\upload\\"+name+"_"+originFileName);

        try {
            file.transferTo(saveFile);
            model.addAttribute("title", "파일업로드 결과 페이지");
            model.addAttribute("originFileName", originFileName);
            model.addAttribute("saveFileName", saveFile.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "viewFilePageResult";
    }
}
