public class Flight extends Airplane {
    private Crew crew;
    private Airport finishAirport;
    boolean isCancelled = false;



    public Flight() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Flight(String name, int capacity, int distance) {
        super(name, capacity, distance);
        // TODO Auto-generated constructor stub
    }

    public Flight(String name, int capacity, int distance, Crew crew, Airport finishAirport, boolean isCancelled) {
        super(name, capacity, distance);
        this.crew = crew;
        this.finishAirport = finishAirport;
        this.isCancelled = isCancelled;
    }

    /**
     * @return the crew
     */
    public Crew getCrew() {
        return crew;
    }

    /**
     * @param crew the crew to set
     */
    public void setCrew(Crew crew) {
        if(crew == null) return; //empty link
        if(crew.getStuff().length != this.getCapacity()) return; // there are more or less people, than need
        this.crew = crew;
    }

    /**
     * @return the finishAirport
     */
    public Airport getFinishAirport() {
        return finishAirport;
    }

    /**
     * @param finishAirport the finishAirport to set
     */
    public void setFinishAirport(Airport finishAirport) {
        if(finishAirport == null) return; //empty link
        if(finishAirport.getDistance() > this.getDistance()) return; // this airport is too far
        this.finishAirport = finishAirport;
    }

    /**
     * @return the isCancelled
     */
    public boolean isCancelled() {
        return isCancelled;
    }

    /**
     * @param isCancelled the isCancelled to set
     */
    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((crew == null) ? 0 : crew.hashCode());
        result = prime * result + ((finishAirport == null) ? 0 : finishAirport.hashCode());
        result = prime * result + (isCancelled ? 1231 : 1237);
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Flight other = (Flight) obj;
        if (crew == null) {
            if (other.crew != null)
                return false;
        } else if (!crew.equals(other.crew))
            return false;
        if (finishAirport == null) {
            if (other.finishAirport != null)
                return false;
        } else if (!finishAirport.equals(other.finishAirport))
            return false;
        if (isCancelled != other.isCancelled)
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String strOne = "Flight: \n";
        strOne += super.toString();
        strOne += "\n";
        strOne += crew.toString();
        strOne += finishAirport.toString();
        strOne += "\n";
        if(isCancelled == false) strOne += "Flight active";
        else strOne += "Flight cancelled";
        return strOne;
    }


}