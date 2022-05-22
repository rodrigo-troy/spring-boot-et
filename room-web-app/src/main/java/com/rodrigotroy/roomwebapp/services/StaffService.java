package com.rodrigotroy.roomwebapp.services;

import com.rodrigotroy.roomwebapp.models.Position;
import com.rodrigotroy.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * $ Project: spring-boot-et
 * User: rodrigotroy
 * Date: 22-05-22
 * Time: 15:43
 */
@Service
public class StaffService {
    private static final List<StaffMember> staff = new ArrayList<>();

    static {
        staff.add(new StaffMember(UUID.randomUUID().toString(),
                                  "John",
                                  "Doe",
                                  Position.CONCIERGE));
        staff.add(new StaffMember(UUID.randomUUID().toString(),
                                  "Jane",
                                  "Doe",
                                  Position.FRONT_DESK));
        staff.add(new StaffMember(UUID.randomUUID().toString(),
                                  "Oliver",
                                  "Handle",
                                  Position.SECURITY));
        staff.add(new StaffMember(UUID.randomUUID().toString(),
                                  "Sammy",
                                  "Smith",
                                  Position.HOUSEKEEPING));
    }

    public List<StaffMember> getAllStaff() {
        return staff;
    }
}
