
import dao.CityDAO;
import dao.DbHelper;
import domain.City;

import java.util.List;

public class B4_6 {
    public static void main(String[] args) {
        // TODO code application logic here
        CityDAO cityDao = new CityDAO();
        List<City> cities = cityDao.findByCountryCode(10); // Lay 10 ket qua
        for (City city : cities) 
            System.out.println(city);
        DbHelper.close();
    }
}
