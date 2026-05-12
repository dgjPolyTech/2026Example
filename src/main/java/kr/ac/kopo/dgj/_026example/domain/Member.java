package kr.ac.kopo.dgj._026example.domain;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class Member {
//    private String id;
//    private int passwd;
//    private String city;
//    private String sex;
//    private String[] hobby;
//    private String greetings;
    private String name;
    private MultipartFile fileImage;
}
