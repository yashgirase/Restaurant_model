package com.geekster.Service;

import com.geekster.Entity.Restaurant;
import com.geekster.Entity.RestaurantSpecialities;
import com.geekster.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Repository restaurantRepository;

    public Restaurant getRestaurantById(Integer id) {
        List<Restaurant> restaurants = restaurantRepository.getListOfRestaurants();

        for(Restaurant restaurant : restaurants){
            if(restaurant.getRestaurantId().equals(id)){
                return restaurant;
            }
        }
        return null;
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.getListOfRestaurants();
    }

    public String addRestaurant(Restaurant restaurant) {
        List<Restaurant> restaurants = restaurantRepository.getListOfRestaurants();
        restaurants.add(restaurant);
        return "Restaurant Added Successfully..";
    }


    public String updateRestaurantSpeciality(RestaurantSpecialities restaurantSpeciality , Integer id) {
        List<Restaurant> restaurants = restaurantRepository.getListOfRestaurants();

        for(Restaurant restaurant : restaurants){
            if(restaurant.getRestaurantId().equals(id)){
                restaurant.setRestaurantSpeciality(restaurantSpeciality);
                break;
            }
        }
        return "Restaurant Speciality Updated..";

    }

    public String deleteRestaurantById(Integer id) {
        List<Restaurant> restaurants = restaurantRepository.getListOfRestaurants();
        for(Restaurant restaurant : restaurants){
            if(restaurant.getRestaurantId().equals(id)){
                restaurants.remove(restaurant);
                break;
            }
        }
        return "restaurant successfully deleted..";
    }
}
