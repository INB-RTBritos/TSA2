package TSA2;

public class Employee {
    int id;
    private String lastName, firstName, middleName, gender, birthday;
    private String fullName;

    //Constructor
    public Employee() {
        this.id = 0;
        this.firstName = "";
        this.middleName = "";
        this.lastName = "";
        this.gender = "";
        this.birthday = "";
    }

    // Setter Methods 
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    public void setMiddleName (String middleName) {
        this.middleName = middleName;
    }
    public void setGender (String gender) {
        this.gender = gender;
    }
    public void setBirthday (String birthday) {
        this.birthday = birthday;
    }

    // Getter Methods 
    public String getFullName() {
        this.fullName = this.firstName + " " + this.middleName + " " + this.lastName;
        return this.fullName.toUpperCase();
    }
    public String getGender() {
        return this.gender;
    }
    public String getBirthday() {
        return this.birthday;
    }

}

