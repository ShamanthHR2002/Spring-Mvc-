package com.xworkz.Service;

import com.xworkz.dto.OrganDonationDTO;
import org.springframework.stereotype.Service;


public interface OrganDonationService {
    boolean isValidAndSave(OrganDonationDTO organDonationDTO);
}
