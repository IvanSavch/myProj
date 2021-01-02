package projectNomber1.io;

import java.io.IOException;

public interface IOInterface {

    String MENU_LEGEND =
                    "\t1. extract\n" +
                    "\t2. select_flight_of_airports\n" +
                    "\t3. select_flight_in_airports\n" +
                    "\te. exit\n";

    String readStringValue() throws IOException;

}
