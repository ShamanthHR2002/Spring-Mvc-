package com.xworkz.Service;

import com.xworkz.dto.HotelRoomDTO;
import org.springframework.stereotype.Service;


public interface HotelRoomService {
    boolean isValidAndSave(HotelRoomDTO hotelRoomDTO);
}
