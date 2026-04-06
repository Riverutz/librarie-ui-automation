package objectdata;

public class LoginObject extends GeneralObject{
    private String email;
    private String password;

    public LoginObject(String filepath) {
        fromJsonToObject(filepath);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
