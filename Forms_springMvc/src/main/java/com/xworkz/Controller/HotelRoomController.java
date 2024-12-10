package com.xworkz.Controller;

import com.xworkz.Service.HotelRoomService;
import com.xworkz.dto.HotelRoomDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HotelRoomController {

    @Autowired
    private HotelRoomService hotelRoomService;

    public HotelRoomController() {
        System.out.println("Running HotelRoomController");
    }

    @RequestMapping("/hotelroom")
    public String onPress(HotelRoomDTO hotelRoomDTO) {
        System.out.println(hotelRoomDTO);
        boolean valid = hotelRoomService.isValidAndSave(hotelRoomDTO);
        if (valid) {
            System.out.println("Valid HotelRoomDTO");
        } else {
            System.err.println("Invalid HotelRoomDTO");
        }
        return "HotelRoom.jsp";
    }
}
