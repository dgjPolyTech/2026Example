package kr.ac.kopo.dgj._026example.domain;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

// implements Validator만 쓰면 오류가 날텐데, 빨간줄 뜬거 누르고 메서드 구현 누르면 자동으로 구현해야 하는 메소드 입력됨.
// spring framework 에서 가져와야함.

@Component
public class PersonValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return true; // 원래는 FALSE였는데 잘 안돼서 TRUE로 변경
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;
        String name = person.getName();
        String age = person.getAge();
        String email = person.getEmail();

        if(name == null || name.trim().isEmpty())
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", null, "이름을 입력하세요.");
        if(age == null || age.trim().isEmpty())
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", null, "나이를 입력하세요.");
        if(email == null || email.trim().isEmpty())
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", null, "이메일을 입력하세요.");
    }
}
