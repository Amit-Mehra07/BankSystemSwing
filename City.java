package JavaProject.BankSystemSwing.src;
//This class contains a small list of city name,
//from which customers can select their city by clicking on dropdown box
public class City {
    String cityName;
    String stateName;

    //a constructor which takes two parameters in it
    public City(String cityName, String stateName) {
        this.cityName = cityName;
        this.stateName = stateName;
    }

    //here I'm overriding toString() method
    @Override
    public String toString() {
        return cityName + " - " + stateName;
    }
}
