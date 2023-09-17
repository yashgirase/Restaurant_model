package com.geekster.Repository;

import com.geekster.Entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
    @Autowired
    List<Restaurant> listOfRestaurants;

    public List<Restaurant> getListOfRestaurants(){
        return listOfRestaurants;
    }


}