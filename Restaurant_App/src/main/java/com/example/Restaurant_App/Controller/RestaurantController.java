package com.example.Restaurant_App.Controller;

import com.example.Restaurant_App.Model.Restaurant;
import com.example.Restaurant_App.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/Restaurant-App")
public class RestaurantController {

  @Autowired
    private  RestaurantService Restaurant_Info;



  @GetMapping("getAll_Rest")
  public ArrayList<Restaurant> getAll_Rest(){
      return Restaurant_Info.getAll_Rest();
  }

  @GetMapping("name/{name}/getBy_name")
    public  Restaurant getBy_name(@PathVariable String name){
    return Restaurant_Info.getBy_Name(name);
  }

  @PostMapping("/Add_Rest")
  public void AddRest( @RequestBody Restaurant restaurant){

    Restaurant_Info.AddRestaurant(restaurant);
  }

  @PutMapping("updateByname/name/{name}")
  public void  UpdateRestaurant(@PathVariable String name, @RequestBody Restaurant restaurant){
          Restaurant_Info.UpdateRestaurannt(name, restaurant);
  }

  @DeleteMapping("/Delete-Restaurant/name/{name}")
  public void DeeleteRestaurant(@PathVariable String name){
     Restaurant_Info.DeleteRestaurant(name);
  }

}
