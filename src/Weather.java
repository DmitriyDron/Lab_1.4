
public class Weather {
    private boolean goodConditions = true;

    public Weather(boolean conditions) {
        super();
        this.goodConditions = conditions;
    }

    public Weather() {
        super();
        // TODO Auto-generated constructor stub
    }

    public boolean isGoodConditions() {
        return goodConditions;
    }

    public void setConditions(boolean conditions) {
        this.goodConditions = conditions;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (goodConditions ? 1231 : 1237);
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
        Weather other = (Weather) obj;
        if (goodConditions != other.goodConditions)
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Weather goodConditions=" + goodConditions;
    }


}