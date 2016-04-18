package top.tanghaibin.entity;

/**
 * Created by Administrator on 2016/4/18.
 */
public class User {
    private String username;
    private String pswd;
    private String salt;

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
