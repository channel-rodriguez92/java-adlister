public class Config {
    private String url = "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
    private String user = "adlister";
    private String password = "ads123";

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    //    This class should have 3 private instance properties, url, user, and password, all of
//    which should be strings, as well as getters for those properties.
}
