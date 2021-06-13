/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.Locations;
import domain.Countries;
import domain.Regions;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;
import org.hibernate.criterion.Example;

/**
 *
 * @author Vish
 */
public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        getLocations();
        getLocationsByRegions(session);
        getRegionsByLocations(session);
        
        HibernateUtil.shutdown();
    }

    private static void getLocations() {
          Criteria query = session.createCriteria(Locations.class);
          Criteria qCountries =query.createCriteria("country_name", "region_name , street_address" );
           
              List<Locations> locations = qCountries.list();
              
              locations.forEach((Locations loc) -> {
                  System.out.println(loc.getCity());
          });
         
                 
    }

    private static void getLocationsByRegions(Session session) {
        Criteria query = session.createCriteria(Locations.class);
        Criteria qCountries =query.createCriteria("country_name", "region_name , street_address" );
            qCountries.add(Restrictions.eq("city", "Toronto"));
            
              List<Locations> locations = qCountries.list();
              
              locations.forEach((loc) -> {
                  System.out.println(loc.getCity() + " " + loc.getCountryId().getClass());
        });
    }
   
    
    private static void getRegionsByLocations(Session session) {
        Criteria query = session.createCriteria(Locations.class);
        Criteria qCountries =query.createCriteria("country_name", "region_name , street_address" );
            qCountries.add(Restrictions.eq("city", "United Kingdom"));
            
              List<Locations> locations = qCountries.list();
              
              locations.forEach((loc) -> {
                  System.out.println(loc.getCity() + " " + loc.getLocationId().getClass());
        });
    }
 }

    
    
    
