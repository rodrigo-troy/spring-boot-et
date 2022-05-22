package com.rodrigotroy.roomwebapp.services;

import com.rodrigotroy.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * $ Project: spring-boot-et
 * User: rodrigotroy
 * Date: 22-05-22
 * Time: 15:22
 */
@Service
public class RoomService {
    private static final List<Room> rooms = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            rooms.add(new Room(i,
                               "Room " + i,
                               "R" + i,
                               "Q"));
        }
    }

    public List<Room> getAllRooms() {
        return rooms;
    }
}
