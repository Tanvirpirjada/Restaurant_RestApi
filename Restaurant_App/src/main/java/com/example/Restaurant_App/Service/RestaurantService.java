package com.example.Restaurant_App.Service;

import com.example.Restaurant_App.Model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RestaurantService {

    private static ArrayList<Restaurant> info=new ArrayList<>();
    static {        info.add(new Restaurant("Tanvir","Pizza_hunter","B-71, near main highway,Mumbai",990087,"Pizza",100,5,3.0));
        info.add(new Restaurant("Hasnain","Kitly","Opp,Gidc,Gujarat",984567,"Kitly_Special",150,6,4.0));
        info.add(new Restaurant("Atik","Hwa hWai","Near india gate,Delhi",897689,"Chole kulche",120,4,4.5));
        info.add(new Restaurant("j&j family","Hotel fivestar","near a City park,Delhi",92484,"masala_chat",534,1,4.0));
        info.add(new Restaurant("patil's family","Patils cafe","near railwaystatio,ahemdabad",658384,"sahi paneer",100,3,3.8));
        info.add(new Restaurant("Tokir","Chicken-day","near Bigmarket Benglore",746352,"chicken-masala",76,1,4.8));

    }


    public ArrayList<Restaurant> getAll_Rest(){
        return info;
    }

    public Restaurant getBy_Name(String name){
        for(Restaurant infos: info){
            if(infos.getRestaurant_name().equals(name)){
                return infos;
            }
        }
        return info.get(1);

    }

    public void AddRestaurant(Restaurant restaurant)
    {
        info.add(restaurant);
    }

    public void UpdateRestaurannt(String name, Restaurant restaurant){
        Restaurant oldRestaurant=getBy_Name(name);

        oldRestaurant.setRestaurant_name(restaurant.getRestaurant_name());
        oldRestaurant.setRestaurant_Owner(restaurant.getRestaurant_Owner());
        oldRestaurant.setRestaurant_Address(restaurant.getRestaurant_Address());
        oldRestaurant.setRestaurant_Number(restaurant.getRestaurant_Number());
        oldRestaurant.setRestaurant_Speciality(restaurant.getRestaurant_Speciality());
        oldRestaurant.setRestaurant_TotalStaff(restaurant.getRestaurant_TotalStaff());
        oldRestaurant.setRestaurant_TotalBranches(restaurant.getRestaurant_TotalBranches());
        oldRestaurant.setRestaurant_Stars(restaurant.getRestaurant_Stars());
    }


    public void DeleteRestaurant(String name){
          Restaurant restaurant=getBy_Name(name);
          info.remove(restaurant);
    }
}
