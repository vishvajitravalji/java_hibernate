/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Vish
 */
@Entity
@Table(name = "COUNTRIES")


public class Countries implements Serializable {
    
    @Id
    @Column(name = "country_id")
    private Integer countryId;
    @Column(name = "country_name")
    private String countryName;
    @Column(name = "region_id")
    private Integer regionId;
    
    
    @OneToMany(mappedBy = "Loacations")
    private Locations locations;

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Countries() {
    }
    
    
    
    
}





