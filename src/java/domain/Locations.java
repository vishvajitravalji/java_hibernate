/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 *
 * @author Vish
 */
@Entity
@Table(name = "LOCATIONS")

public class Locations implements Serializable {
    
    @Id
    @Column(name = "location_id")
    private Integer locationId;

    @Column(name = "street_address")
    private String streetAddress;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "city")
    private String City;

    @Column(name = "state_province")
    private String stateProvince;

    @Column(name = "country_id")
    private Integer countryId;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Countries", 
            joinColumns = {
                @JoinColumn(name = "COUNTRY_ID")},
             inverseJoinColumns = {
                @JoinColumn(name = "REGION_ID")})
            
    private Countries countries;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "regions", 
           joinColumns = {
               @JoinColumn(name = "REGION_ID")},
            inverseJoinColumns = {
               @JoinColumn(name = "REGION_NAME")})
    
     private Regions regions;
    
    
    
    
    

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    @Id
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Locations() {
    }
 



}
