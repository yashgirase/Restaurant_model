package com.geekster.Modelfactory;

import com.geekster.Entity.Restaurant;
import com.geekster.Entity.RestaurantSpecialities;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Bean {
    @org.springframework.context.annotation.Bean
    public List<Restaurant> getListOfRestaurants(){
        Restaurant restaurant1 = new Restaurant("Maharashtrian Food","Near Chaufully , Dondaicha , dist.Dhule 425408", 1, "9987654321" ,  RestaurantSpecialities.MAHARASHTRIAN , 15);
        Restaurant restaurant2 = new Restaurant("Thai Food","Near Shivaji Putla , Dondaicha, dist.Dhule 425408", 2,"9976543210" ,RestaurantSpecialities.THAI , 20 );
        List<Restaurant> listOfRestaurants = new ArrayList<>();
        listOfRestaurants.add(restaurant1);
        listOfRestaurants.add(restaurant2);
        return listOfRestaurants;

    }



}
