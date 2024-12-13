package com.xworkz.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DeathCertificateDto {
    private String Name;
    private int age;
    private String address;
    private String dob;
    private String dod;
    private String cause;
}
