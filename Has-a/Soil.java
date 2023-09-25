class Soil {
    private String soilName;
    private String moistur;
    private String minerals;

    public Soil() {

    }

    public void setSoilName(String soilName) {
        this.soilName = soilName;
    }

    public void setMoistur(String moisturizer) {
        this.moistur = moisturizer;
    }

    public void setMinerals(String minerals) {
        this.minerals = minerals;
    }

    public String getSoilName() {
        return soilName;
    }

    public String getMoistur() {
        return moistur;
    }

    public String getMinerals() {
        return minerals;
    }
}