/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Duc Le
 */
public class City {
    private int id;
    private String name;
    private String countryCode;
    private String district;
    private int population;
    
     public static City fromResult(ResultSet rs) throws SQLException {
        City city = new City();
        city.setId(rs.getInt(1));
        city.setName(rs.getString(2));
        city.setCountryCode(rs.getString(3));
        city.setDistrict(rs.getString(4));
        city.setPopulation(rs.getInt(5));
        return city;
    } 
    
    public City(int id, String name, String countryCode, String district, int population) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    public City() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" + "id=" + id + ", name=" + name + ", countryCode=" + countryCode + ", district=" + district + ", population=" + population + '}';
    }
    
}
