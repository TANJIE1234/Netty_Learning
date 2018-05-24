package chapter1;

import java.io.IOException;

public class TimeServer {

    public static void main(String[] args) throws IOException {
        int port = 8080;
        if (args != null && args.length > 0) {
            try {
                port = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {

            }
        }
        MultiplexTimeServer timeServer = new MultiplexTimeServer(port);
        new Thread(timeServer, "NIO-chapter1.MultiplexTimeServer-001").start();
    }
}
