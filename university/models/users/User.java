package university.models.users;


import university.interfaces.Serializable;

public class User implements Serializable {

    public int id;
    public String username;
    public String password;
    public boolean isLoggedIn;

    public User() {
    }
    public void login(String username, String password) {
        if(this.username.equals(username) && this.password.equals(password)) {
            this.isLoggedIn = true;
        } else {
            throw new IllegalArgumentException("Invalid credentials");
        }
    }
    public void logout() {
        this.isLoggedIn = false;
    }
    public void update(String newPassword) {
        this.password = newPassword;
    }

}