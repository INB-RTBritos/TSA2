package TSA2;

public class Regular extends Employee {
    private String role, department, status;

    // Constructor
    public Regular() {
        this.role = "";
        this.department = "";
        this.status = "";
    }

    // Setters
    public void setRole(String role) {
        this.role = role;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    // Getters
    public String getRole() {
        return this.role;
    }
    public String getDepartment() {
        return this.department;
    }
    public String getStatus() {
        return this.status;
    }
}
