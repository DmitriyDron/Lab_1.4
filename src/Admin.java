public class Admin {
    public Admin() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Crew confirmCrew(Stuff[] allStuff, int number) {
        int count = 0;

        if (allStuff == null) {
            System.out.println("Empty link!");
            return null;
        }
        if (allStuff.length < number) {
            System.out.println("We need more people!");
            return null;
        }

        Crew crewOne = new Crew();
        crewOne.setCrewNumber(123);
        Stuff[] newCrew = new Stuff[number];
        crewOne.setStuff(newCrew);

        for (int i = 0; i < allStuff.length; i++) {
            if (allStuff[i] != null && allStuff[i].getCrewNumber() == 0) {
                newCrew[count] = allStuff[i];
                newCrew[count].setCrewNumber(crewOne.getCrewNumber());
                count++;
            }
            if (count == number) break;

        }
        if (count < number) {
            System.out.println("You have only " + (count + 1) + " people!");
        }
        return crewOne;
    }

    public void cancellFlight(Flight flight, Weather weatherNow) {
        if (weatherNow.isGoodConditions() == false) {
            flight.setCancelled(true);
        } else flight.setCancelled(false);
    }

    public void changeAirport(Flight flight, Airport airport) {
        flight.setFinishAirport(airport);
    }
}