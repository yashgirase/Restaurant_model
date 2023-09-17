package com.geekster.Controller;

import com.geekster.Entity.Restaurant;
import com.geekster.Entity.RestaurantSpecialities;
import com.geekster.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    Service restaurantService;

    @GetMapping("restaurant/{id}")
    public Restaurant getRestaurantById(@PathVariable Integer id){
        return restaurantService.getRestaurantById(id);
    }

    @GetMapping("restaurants")
    public List<Restaurant> getAllRestaurants(){
        return restaurantService.getAllRestaurants();
    }
    @PostMapping("restaurant")
    public String addRestaurant(@RequestBody  Restaurant restaurant){
        return restaurantService.addRestaurant(restaurant);
    }

    @PutMapping("restaurant/update/restaurantSpeciality/{restaurantSpeciality}/restaurantId/{id}")
    public String updateRestaurantSpeciality(@PathVariable RestaurantSpecialities restaurantSpeciality , @PathVariable Integer id){
        return restaurantService.updateRestaurantSpeciality(restaurantSpeciality , id);
    }

    @DeleteMapping("restaurant/{id}")
    public String deleteRestaurantById(@PathVariable Integer id){
        return restaurantService.deleteRestaurantById(id);
    }
}
