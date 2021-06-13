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
@Table (name = "REGIONS")

public class Regions implements Serializable {
    @Id
    @Column (name="region_id")
    private Integer regionID;
    
    @Column (name="region_name")
    private String regionName;
    
    
    @OneToMany(mappedBy = "Regions")
    private Countries countries;

    public Integer getRegionID() {
        return regionID;
    }

    public void setRegionID(Integer regionID) {
        this.regionID = regionID;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Regions() {
    }
    
    
}
