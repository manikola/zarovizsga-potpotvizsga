package hu.nive.ujratervezes.zarovizsga.housecup;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HouseCup {

    private DataSource dataSource;

    public HouseCup(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public int getPointsOfHouse(String house){
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT `points_earned` FROM `house_points` WHERE `house_name` =?;")) {
            stmt.setString(1, house);

            return getPointsByPreparedStatement(stmt);



            } catch (SQLException se) {
            throw new IllegalArgumentException("Error by select", se);
        }

    }

        private int getPointsByPreparedStatement(PreparedStatement stmt) {
        int sum =0;
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    sum += rs.getInt("points_earned");

                }
                return sum;


            } catch (SQLException se) {
                throw new IllegalStateException("Error by select", se);

            }
        }


    }

