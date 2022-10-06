public class Country {
    private String countryName;
    private int numberOfInhabitants;
    private int numberOfCities;
    Country(String countryName, int numberOfInhabitants, int numberOfCities){
        this.countryName = countryName;
        if(numberOfCities > 0) {
            this.numberOfCities = numberOfCities;

        }
        if(numberOfInhabitants > 0){
            this.numberOfInhabitants = numberOfInhabitants;

        }
    }

    public String getCountryName() {
        return countryName;
    }

    public int getNumberOfInhabitants() {
        return numberOfInhabitants;
    }

    public int getNumberOfCities() {
        return numberOfCities;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setNumberOfInhabitants(int numberOfInhabitants) {
        if(numberOfInhabitants > 0) {
            this.numberOfInhabitants = numberOfInhabitants;
        }
    }

    public void setNumberOfCities(int numberOfCities) {
        if(numberOfCities > 0) {
            this.numberOfCities = numberOfCities;
        }
    }

    public String getFullInfo(){
        return "\nCountry name: " + countryName + "\nNumber of Inhabitants: " + numberOfInhabitants + "\nNumber of Cities: " + numberOfCities;
    }
}
