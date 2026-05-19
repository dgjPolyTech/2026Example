package kr.ac.kopo.dgj._026example.domain;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Member2 {
    @MemberId // 사용자 정의 어노테이션(유효성 검사에 기준을 사용자가 정의함)
    private String memberId;

    @Size(min=4, max = 10, message="최소 4 ~ 최대 10개의 문자열로 작성해야합니다.")
    private String passwd;
}
