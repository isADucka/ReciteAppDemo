package pojo.po;

/**
 * 用户个人信息封装类
 */
public class User {
    private int userId;
    private String nickName;
    private String sex;
    private String birthday;
    private int points;
    private String imagePath;
    private String cityId;
    private String school;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public User(int userId, String nickName, String sex, String birthday, int points, String imagePath, String cityId, String school) {
        this.userId = userId;
        this.nickName = nickName;
        this.sex = sex;
        this.birthday = birthday;
        this.points = points;
        this.imagePath = imagePath;
        this.cityId = cityId;
        this.school = school;
    }

    public User() {
    }
}
