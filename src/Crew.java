import java.util.Arrays;

public class Crew {
    private int crewNumber;
    private Stuff stuff[];

    public Crew() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Crew(int crewNumber, Stuff[] stuff) {
        super();
        this.crewNumber = crewNumber;
        this.stuff = stuff;
    }

    /**
     * @return the crewNumber
     */
    public int getCrewNumber() {
        return crewNumber;
    }

    /**
     * @param crewNumber the crewNumber to set
     */
    public void setCrewNumber(int crewNumber) {
        this.crewNumber = crewNumber;
    }

    /**
     * @param stuff the stuff to set
     */
    public void setStuff(Stuff[] stuff) {
        this.stuff = stuff;
    }

    /**
     * @param stuff the stuff to add
     */
    public void addStuff(Stuff stuff, int maximal) {
        if (stuff == null)
            return; // empty link
        if (stuff.getCrewNumber() != 0)
            return; // this stuff is in crew
        if (this.stuff.length == maximal) return; //this crew is full
        if (this.stuff == null) {
            this.stuff = new Stuff[1];
            this.stuff[1] = stuff;
            this.stuff[1].setCrewNumber(crewNumber);
        } else {
            Stuff[] temp = new Stuff[this.stuff.length + 1];
            for (int i = 0; i < this.stuff.length; i++) {
                temp[i] = this.stuff[i];
            }
            temp[this.stuff.length] = stuff;
            temp[this.stuff.length].setCrewNumber(this.crewNumber);
            this.stuff = temp;
        }
    }

    /**
     * @param stuff the stuff to remove
     */

    public void removeStuff(Stuff stuff) {
        int index = -1;
        if (stuff == null)
            return; // empty link
        if (this.stuff == null)
            return;// this crew is empty
        if (stuff.getCrewNumber() != this.crewNumber)
            return; // this stuff is not in this crew
        if (this.stuff.length == 1) {
            this.stuff = null;
        } else {
            for (int i = 0; i < this.stuff.length; i++) {
                if (stuff.getPersonnalNumber() == this.stuff[i].getPersonnalNumber()) {
                    index = i;
                }
            }
            Stuff[] temp = new Stuff[this.stuff.length - 1];
            for (int i = 0; i < index; i++) {
                temp[i] = this.stuff[i];
            }
            for (int i = index; i < temp.length; i++) {
                temp[i] = this.stuff[i + 1];
            }
        }
        stuff.setCrewNumber(0);
    }

    /**
     * @return the stuff
     */
    public Stuff[] getStuff() {
        return stuff;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + crewNumber;
        result = prime * result + Arrays.hashCode(stuff);
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
        Crew other = (Crew) obj;
        if (crewNumber != other.crewNumber)
            return false;
        if (!Arrays.equals(stuff, other.stuff))
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String strOne = "Crew: \n";
        for(int i = 0; i < stuff.length; i++) {
            strOne+= stuff[i].toString();
            strOne += "\n";
        }
        return strOne;
    }

}
