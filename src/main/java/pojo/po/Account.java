package pojo.po;

/**
 * 用户个人账号封装类
 */
public class Account {
    private int userId;
    private String number;
    private String password;

    @Override
    public String toString() {
        return "Account{" +
                "userId=" + userId +
                ", number='" + number + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Account() {
    }

    public Account(int userId, String number, String password) {
        this.userId = userId;
        this.number = number;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
