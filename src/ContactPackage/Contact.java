package ContactPackage;

public class Contact {
    private String name;
    private String phoneNumber;

    public void setNamePhoneNumber(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber=phoneNumber;
    }
    public String getName(){
        return name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }


}
