package com.oca.java.packages.office;

import com.oca.java.packages.home.LivingRoom;

public class Main {
    public static void main(String[] args) {
//        com.oca.java.packages.home.LivingRoom livingRoom = new LivingRoom();
//        com.oca.java.packages.office.MeetingRoom meetingRoom = new MeetingRoom();
//        livingRoom.relax();
//        meetingRoom.meet();

        LivingRoom livingRoom = new LivingRoom();
        MeetingRoom meetingRoom = new MeetingRoom();
        livingRoom.relax();
        meetingRoom.meet();
    }
}
