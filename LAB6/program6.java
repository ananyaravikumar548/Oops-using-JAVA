class TicketBooking {
    private int tickets = 5;

    synchronized void bookTicket(String name) {
        if (tickets > 0) {
            System.out.println(name + " booked ticket #" + tickets);
            tickets--;
        } else {
            System.out.println("Sorry " + name + ", tickets sold out!");
        }
    }
}

class User extends Thread {
    TicketBooking booking;
    String name;

    User(TicketBooking b, String n) {
        booking = b;
        name = n;
    }

    public void run() {
        booking.bookTicket(name);
    }
}

public class TicketDemo {
    public static void main(String[] args) {
        TicketBooking tb = new TicketBooking();
        User u1 = new User(tb, "User1");
        User u2 = new User(tb, "User2");
        User u3 = new User(tb, "User3");
        User u4 = new User(tb, "User4");
        User u5 = new User(tb, "User5");
        User u6 = new User(tb, "User6");
        u1.start(); u2.start(); u3.start(); u4.start(); u5.start(); u6.start();
    }
}
