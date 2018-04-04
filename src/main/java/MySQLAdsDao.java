import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
  private Connection connection = null;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Ad> all()  {
        List<Ad> allAds = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
            while (rs.next()){
                Ad ad = new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                );
                allAds.add(ad);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return allAds;
    }

    @Override
    public Long insert(Ad ad) {
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO ads (user_id,title, description) VALUES ("+
                   ad.getUserId() + ",'" + ad.getTitle() + "','" + ad.getDescription() + "')");
           ResultSet rs = stmt.executeQuery("SELECT * FROM ads ORDER BY id DESC limit 1");
           if(rs.next()){
                System.out.println(rs.getString("id"));
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
