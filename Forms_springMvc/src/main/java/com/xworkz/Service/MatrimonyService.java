package com.xworkz.Service;

import com.xworkz.dto.MatrimonyDTO;
import org.springframework.stereotype.Service;


public interface MatrimonyService {
    boolean isValidAndSave(MatrimonyDTO matrimonyDTO);
}
