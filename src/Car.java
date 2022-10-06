public class Car {
    private String carName;
    private String companyName;
    private int yearOfIssue;
    private int engineVolume;
    Car(String carName, String companyName, int yearOfIssue, int engineVolume){
        this.carName = carName;
        this.companyName = companyName;
        this.yearOfIssue = yearOfIssue;
        this.engineVolume = engineVolume;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public String getCarName() {
        return carName;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }
    public void setInfo(String carName){
        this.carName = carName;
    }
    public void setInfo(String carName, String companyName){
        this.carName = carName;
        this.companyName = companyName;
    }
}
