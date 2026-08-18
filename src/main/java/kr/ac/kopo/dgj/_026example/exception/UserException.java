package kr.ac.kopo.dgj._026example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "찾을 수 없습니다.")
public class UserException extends RuntimeException{
    public UserException(String msg) {
        super(msg);
        System.out.println(msg);
    }
}
