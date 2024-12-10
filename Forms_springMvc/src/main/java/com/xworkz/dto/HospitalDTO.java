package com.xworkz.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HospitalDTO {
    private String patientName;
    private String dob;
    private String phoneNumber;
    private String registrationDate;
    private int age;
}