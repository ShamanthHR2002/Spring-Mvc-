package com.xworkz.Service;

import com.xworkz.dto.DeathCertificateDto;
import org.springframework.stereotype.Service;


@Service
public class DeathcertificateServiceImpl implements DeathcertificateService {

    @Override
    public boolean isValidAnSave(DeathCertificateDto deathCertificateDto) {
        return true;
    }
}

