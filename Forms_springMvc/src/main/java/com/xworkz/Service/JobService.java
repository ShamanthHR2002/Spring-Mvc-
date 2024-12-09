package com.xworkz.Service;

import com.xworkz.dto.JobDTO;
import org.springframework.stereotype.Service;


@Service
public interface JobService {

    boolean validAndSave(JobDTO jobDTO);

}
