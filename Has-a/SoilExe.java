class SoilExe {
    public static void main(String[] plantgrowth) {
        Soil soil = new Soil();
        soil.setSoilName("Clay");
        soil.setMoistur("25% to 45%");
        soil.setMinerals("silica, alumina, and water");

        Plant plant = new Plant();
        plant.soil = soil;
        plant.plantName = "Cabbage";

        System.out.println("Plant Name: " + plant.plantName);
        System.out.println("Soil Name: " + plant.soil.getSoilName());
        System.out.println("Moisture: " + plant.soil.getMoistur());
        System.out.println("Minerals: " + plant.soil.getMinerals());
    }
}