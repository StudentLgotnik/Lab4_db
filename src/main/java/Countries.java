import java.sql.*;
import java.util.ArrayList;
import java.util.Objects;

public class Countries {
    private String id;
    private String country;
    private String mainland;
    private int population;
    private String capital;
    private String timezone;

    static ArrayList<Countries> Countries = new ArrayList<Countries>();

    public Countries() {
    }

    public Countries(String id, String country, String mainland, int population, String capital, String timezone){
        this.id = id;
        this.country = country;
        this.mainland = mainland;
        this.population = population;
        this.capital = capital;
        this.timezone = timezone;
    }

    public String getId() {
        return id;
    }

    public static void getCountriesData() throws ClassNotFoundException {
        Connection connection = Connections.connect();
        try {
            Statement statement = connection.createStatement();
            ResultSet rset = statement.executeQuery("select * from SYSTEM.COUNTRIES");
            while (rset.next()){
                Countries countries = new Countries(rset.getString(1),
                        rset.getString(2),
                        rset.getString(3),
                        rset.getInt(4),
                        rset.getString(5),
                        rset.getString(6));
                Countries.add(countries);
            }
            rset.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Connections.closeCon(connection);
    }
    public static void addCountries(Countries countries) throws ClassNotFoundException {
        boolean exist = false;
        Connection connection = Connections.connect();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet rset = statement.executeQuery("SELECT * FROM SYSTEM.CONTINENT");
            while (rset.next()) {
                if (Objects.equals(rset.getString(2), countries.mainland)) exist = true;
            }
            rset.close();
            if (exist) {
                String sql = "UPDATE CONTINENT SET DEFCOUNTRIES = DEFCOUNTRIES + 1 WHERE CONTINENT = (?)";
                try (final PreparedStatement pstmt = connection.prepareStatement(sql)) {
                    pstmt.setString(1, countries.mainland);
                    pstmt.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {
                String climate = "climate";
                ResultSet rset1 = statement.executeQuery("SELECT * FROM SYSTEM.CONTINENTS");
                while (rset1.next()) {
                    if (Objects.equals(rset1.getString(2), countries.mainland)) {
                        climate = rset1.getString(2);
                    }
                }
                String sql = "INSERT INTO CONTINENT VALUES (sys_guid(), ?, ?, 1)";
                try (final PreparedStatement pstmt1 = connection.prepareStatement(sql)) {
                    pstmt1.setString(1, countries.mainland);
                    pstmt1.setString(2, climate);
                    pstmt1.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
            if(!Countriesemployer.contains(countries.country)) {
                String sql = "INSERT INTO COUNTRIESEMPLOYER VALUES (sys_guid(), ?, '0%')";
                try (final PreparedStatement pstmt = connection.prepareStatement(sql)) {
                    pstmt.setString(1, countries.country);
                    pstmt.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(!Capital.contains(countries.capital)) {
                String sql = "INSERT INTO CAPITAL VALUES (sys_guid(), ?, 'noone', 0)";
                try (final PreparedStatement pstmt = connection.prepareStatement(sql)) {
                    pstmt.setString(1, countries.capital);
                    pstmt.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            String sq3 = "INSERT INTO COUNTRIES VALUES (sys_guid(), ?, ?, ?, ?, ?)";
            try (final PreparedStatement pstmt = connection.prepareStatement(sq3)) {
                pstmt.setString(1, countries.country);
                pstmt.setString(2, countries.mainland);
                pstmt.setInt(3, countries.population);
                pstmt.setString(4, countries.capital);
                pstmt.setString(5, countries.timezone);
                pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Countries countries = (Countries) o;

        if (population != countries.population) return false;
        if (!country.equals(countries.country)) return false;
        if (!mainland.equals(countries.mainland)) return false;
        if (!capital.equals(countries.capital)) return false;
        return timezone.equals(countries.timezone);
    }

    @Override
    public int hashCode() {
        int result = country.hashCode();
        result = 31 * result + mainland.hashCode();
        result = 31 * result + population;
        result = 31 * result + capital.hashCode();
        result = 31 * result + timezone.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "CountriesDB{" +
                "country='" + country + '\'' +
                ", mainland='" + mainland + '\'' +
                ", population=" + population +
                ", capital='" + capital + '\'' +
                ", timezone='" + timezone + '\'' +
                '}';
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public void setCapital(String capital) {

        this.capital = capital;
    }

    public void setPopulation(int population) {

        this.population = population;
    }

    public void setMainland(String mainland) {

        this.mainland = mainland;
    }

    public void setCountry(String country) {

        this.country = country;
    }

    public String getTimezone() {

        return timezone;
    }

    public String getCapital() {

        return capital;
    }

    public int getPopulation() {

        return population;
    }

    public String getMainland() {

        return mainland;
    }

    public String getCountry() {

        return country;
    }
}
