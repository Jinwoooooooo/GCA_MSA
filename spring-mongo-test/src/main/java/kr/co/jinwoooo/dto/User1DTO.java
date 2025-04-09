package kr.co.jinwoooo.dto;

import kr.co.jinwoooo.document.User1Document;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User1DTO {

    private String _id;
    private String uid;
    private String name;
    private int age;
    private String addr;

    public User1Document toDocument() {
        return User1Document.builder()
                .uid(uid)
                .name(name)
                .age(age)
                .addr(addr)
                .build();
    }
}
