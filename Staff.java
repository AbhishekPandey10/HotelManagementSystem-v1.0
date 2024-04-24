//Staff.java
public class Staff {
    private int staffId;
    private String name;
    private String role;
    public Staff(int staffId, String name, String role) {
        this.staffId = staffId;
        this.name = name;
        this.role = role;
    }
    public int getStaffId() {
        return staffId;
    }
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}
