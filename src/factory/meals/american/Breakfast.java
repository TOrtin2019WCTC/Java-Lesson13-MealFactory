/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.meals.american;

import factory.meals.Meal;

/**
 *
 * @author tim
 */
public class Breakfast implements Meal {

    private String description;
    private int calories;

    public Breakfast() {
        description = "Omellete, Bacon, Sausage, Toast, HashBrowns";
        calories = 1200;
    }

    @Override
    public void dispayMeal() {
        System.out.println(description + " is " + calories + " calories.");
    }
    
}
