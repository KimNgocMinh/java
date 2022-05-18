package lesson9;

public class User {
    private int id;
    private String userName;
    private String password;
    private String displayName;
    private String email;

    public User() {

    }

    public User(int id, String userName, String password, String displayName, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.displayName = displayName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getEmail() {
        return email;
    }

    public void printInformation() {
        System.out.println("ID: " + this.id + "\r\n" +
                            "Username: " + this.userName +"\r\n" +
                            "Displayname: " + this.displayName);
    }
}
