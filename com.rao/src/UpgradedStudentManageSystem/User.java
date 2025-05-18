package UpgradedStudentManageSystem;

public class User {
    private String userName;
    private String  password;
    private String personID;
    private String phone;

    public User() {
    }

    public User(String userName, String password, String personID, String phone) {
        this.userName = userName;
        this.password = password;
        this.personID = personID;
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
