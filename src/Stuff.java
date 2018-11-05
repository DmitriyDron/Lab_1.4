public class Stuff {
    private String name;
    private int crewNumber ;
    private int personnalNumber = 10000000 + (int) (Math.random() * 100000000);

    public Stuff(String name) {
        super();
        this.name = name;
        this.crewNumber = 0;
    }

    public Stuff() {
        super();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the crewName
     */
    public int getCrewNumber() {
        return crewNumber;
    }

    /**
     * @param // crewName the crewName to set
     */
    public void setCrewNumber(int crewNumber) {
        this.crewNumber = crewNumber;
    }

    /**
     * @return the personnalNumber
     */
    public int getPersonnalNumber() {
        return personnalNumber;
    }

    /**
     * @param //personnalNumber the personnalNumber to set
     */
    public void setPersonnalNumber() {
        this.personnalNumber = 10000000 + (int) (Math.random() * 99999999);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + personnalNumber;
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Stuff other = (Stuff) obj;
        if (personnalNumber != other.personnalNumber)
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "name = " + name + ", crewNumber = " + crewNumber + ", personnalNumber = " + personnalNumber ;
    }


}