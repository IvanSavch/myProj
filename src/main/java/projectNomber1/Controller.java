package projectNomber1;

import projectNomber1.io.IOInterface;
import projectNomber1.service.FlightService;

import javax.imageio.IIOException;
import java.io.IOException;

public class Controller {

    private final FlightService flightService;
    private final IOInterface ioInterface;

    public  Controller(){
        this.flightService = null;
        this.ioInterface = null;

    }
public void start(){
        String input = "";
        try {
            input = ioInterface.readStringValue();
        }catch (IOException e){
            System.err.println(e.getMessage());
        }

        switch (input){
            case"1":

                flightService.extractFlight();

        }


}


}
