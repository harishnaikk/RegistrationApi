package com.hn.registration.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    private Integer Id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String emailId;

}
