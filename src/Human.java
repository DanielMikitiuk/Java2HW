public class Human {
    private String name;
    private String surname;
    private int age;
    Human(String name, String surname, int age){
        this.name = name;
        if(age>0 && age<120) {
            this.age = age;
         }
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge(){
        return age;
    }
    public String getFullName(){
        return name + " " +surname;
    }

    public void setAge(int age) {
        if(age>0 && age<120) {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFullInfo(){
        return "\nName: " + name + "\nSurname: " + surname + "\nAge: " + age;
    }
}
