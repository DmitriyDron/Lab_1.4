import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Admin admin = new Admin();
        Weather weatherNow = new Weather();
        Stuff[] allStuff = new Stuff[10];
        Airplane[] allAirplanes = new Airplane[3];
        Airport[] allAirports = new Airport[5];
        Crew[] allCrews = new Crew[4];
        Flight[] allFlights = new Flight[4];
        Airport nearAirport;

        for(int i = 0; i < 10; i++) {
            allStuff[i] = new Stuff("John" + (i + 1));
        }

        allCrews[1] = new Crew();
        allAirplanes[0] = new Airplane("SU-123", 4, 500);
        allAirports[0] = new Airport("Borispol", 500);
        allFlights[0] = new Flight("SU-123", 4, 500, null, allAirports[0], false);
        allFlights[0].setCrew(admin.confirmCrew(allStuff, allFlights[0].getCapacity()));
        System.out.println(allFlights[0].toString());
        System.out.println();

        weatherNow = new Weather(false);
        admin.cancellFlight(allFlights[0], weatherNow);
        System.out.println(allFlights[0].toString());
        System.out.println();

        weatherNow = new Weather(true);
        admin.cancellFlight(allFlights[0], weatherNow);

        for(int i = 1; i < 5; i++) {
            allAirports[i] = new Airport(("Zhulyany-" + i),((5000 + i * 10) / (30 * i - 20)));
        }
        nearAirport = allAirports[1];
        for(int i = 2; i < 5; i++) {
            if(nearAirport.getDistance() > allAirports[i].getDistance()) nearAirport = allAirports[i];
        }
        admin.changeAirport(allFlights[0], nearAirport);
        System.out.println(allFlights[0].toString());
    }



}