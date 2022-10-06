public class City {
    private String cityName;
    private int numberOfInhabitants;
    private String countryName;
    City(String cityName, int numberOfInhabitants, String countryName){
        this.cityName = cityName;
        this.countryName = countryName;
        if(numberOfInhabitants>0){
            this.numberOfInhabitants = numberOfInhabitants;

        }
    }

    public String getCityName() {
        return cityName;
    }

    public int getNumberOfInhabitants() {
        return numberOfInhabitants;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setNumberOfInhabitants(int numberOfInhabitants) {
        if(numberOfInhabitants > 0) {
            this.numberOfInhabitants = numberOfInhabitants;
        }
    }

    public String getFullInfo(){
        return "\nCity name: " + cityName + "\nNumber of inhabitants: " + numberOfInhabitants + "\nCountry name: " + countryName;
    }
}
