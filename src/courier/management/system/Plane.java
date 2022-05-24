package courier.management.system;

class Plane implements Transport {
    public void load(){
        AirplaneGUI pl = new AirplaneGUI();
        pl.setVisible(true);
    }
}
