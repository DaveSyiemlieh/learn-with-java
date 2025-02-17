package org.example.SOLID;

public class O {
    // Open Ex, ClosedMod

    // 1 common interface implemented by many -> Notif interface
    public void notifyViaEmail(String notif, int userId) {
        // Email notif
    }
    public void notifyViaMobile(String notif, int userId) {
        // Mobile notif
    }
}
