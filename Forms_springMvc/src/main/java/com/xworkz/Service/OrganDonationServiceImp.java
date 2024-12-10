package com.xworkz.Service;

import com.xworkz.dto.OrganDonationDTO;
import com.xworkz.dto.PassportDTO;
import org.springframework.stereotype.Service;


@Service
public class OrganDonationServiceImp implements OrganDonationService {

    OrganDonationServiceImp() {
        System.out.println("running OrganDonationServiceImp");
    }

    @Override
    public boolean isValidAndSave(OrganDonationDTO organDonationDTO) {
        return false;
    }
}

