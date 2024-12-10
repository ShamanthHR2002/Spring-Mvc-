package com.xworkz.Service;

import com.xworkz.dto.HospitalDTO;
import com.xworkz.dto.HotelRoomDTO;
import org.springframework.stereotype.Service;


@Service
public class HotelRoomServiceImp implements HotelRoomService {

    HotelRoomServiceImp() {
        System.out.println("running HotelRoomServiceImp");
    }


    @Override
    public boolean isValidAndSave(HotelRoomDTO hotelRoomDTO) {
        return false;
    }
}
