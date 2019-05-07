package factory.meals;

import factory.meals.american.AmericanMealFactory;


public class Driver {

    public static void main(String[] args) {
        
        AmericanMealFactory mealFactory = new AmericanMealFactory();
        Hotel hotel = new Hotel(mealFactory);
        hotel.serveMeals();
    }
}
