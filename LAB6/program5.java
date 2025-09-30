class MessageSender {
    synchronized void sendMessage(String msg) {
        System.out.print("Sending: " + msg);
        try { Thread.sleep(1000); } catch (Exception e) {}
        System.out.println("...Sent!");
    }
}

class SenderThread extends Thread {
    MessageSender sender;
    String msg;

    SenderThread(MessageSender s, String m) {
        sender = s;
        msg = m;
    }

    public void run() {
        sender.sendMessage(msg);
    }
}

public class MessageDemo {
    public static void main(String[] args) {
        MessageSender ms = new MessageSender();
        SenderThread t1 = new SenderThread(ms, "Hello");
        SenderThread t2 = new SenderThread(ms, "Welcome");
        t1.start();
        t2.start();
    }
}
