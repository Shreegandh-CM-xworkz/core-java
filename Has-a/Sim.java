class Sim {
    private String simName;
    private long number;
    private String datapack;
    private int price;

    public Sim() {

    }

    public void setSimName(String simName) {
        this.simName = simName;
    }

    public String getSimName() {
        return simName;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public long getNumber() {
        return number;
    }

    public void setDatapack(String datapack) {
        this.datapack = datapack;
    }

    public String getDatapack() {
        return datapack;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}