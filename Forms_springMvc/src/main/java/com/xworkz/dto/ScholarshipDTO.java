package com.xworkz.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ScholarshipDTO {
    private String firstName;
    private String lastName;
    private String email;
    private  Long phoneNo;
    private int otp;
    private  String password;
}
