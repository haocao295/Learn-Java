/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.City;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Duc Le
 */
public class CityDAO {

    private final Connection con;

    public CityDAO() {
        con = DbHelper.getConnection();
    }

    public List<City> findAll(int rows) {
        List<City> result = null;
        try {
            PreparedStatement pstmt = con.prepareStatement("select * from city limit 0, " + rows);
            ResultSet rs = pstmt.executeQuery();
            if (rs.isBeforeFirst()) {
                result = new ArrayList<>();
                while (rs.next()) {
                    City city = City.fromResult(rs);
                    result.add(city);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CityDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public List<City> findByCountryCode(int rows) {
        List<City> result = null;
        try {
            PreparedStatement pstmt = con.prepareStatement("select * from city, country where city.countrycode = country.code limit 0, " + rows);
            ResultSet rs = pstmt.executeQuery();
            if (rs.isBeforeFirst()) {
                result = new ArrayList<>();
                while (rs.next()) {
                    City city = City.fromResult(rs);
                    result.add(city);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CityDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

}
