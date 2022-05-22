package com.rodrigotroy.roomwebapp.controllers;

import com.rodrigotroy.roomwebapp.models.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * $ Project: spring-boot-et
 * User: rodrigotroy
 * Date: 22-05-22
 * Time: 11:44
 */
@Controller
@RequestMapping("/rooms")
public class RoomController {
    private static final List<Room> rooms = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            rooms.add(new Room(i,
                               "Room " + i,
                               "Name " + i,
                               "Info " + i));
        }
    }

    @GetMapping
    public String getAllRooms(Model model) {
        model.addAttribute("rooms",
                           rooms);
        return "rooms";
    }
}
