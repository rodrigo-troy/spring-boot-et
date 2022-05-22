package com.rodrigotroy.roomwebapp.controllers;

import com.rodrigotroy.roomwebapp.models.Room;
import com.rodrigotroy.roomwebapp.services.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * $ Project: spring-boot-et
 * User: rodrigotroy
 * Date: 22-05-22
 * Time: 15:40
 */
@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {
    private final RoomService roomService;

    public RoomRestController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }
}
