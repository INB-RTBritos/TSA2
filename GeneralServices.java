package TSA2;

public class GeneralServices extends Employee {
    private String department, status;

    //Constructor
    public GeneralServices() {
        department = "";
        status = "";
    }

    // Setters
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setStatus (String status) {
        this.status = status;
    }

    // Getters
    public String getDepartment() {
        return this.department;
    }
    public String getStatus() {
        return this.status;
    }
}
