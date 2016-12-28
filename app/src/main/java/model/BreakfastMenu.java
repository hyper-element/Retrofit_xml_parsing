package model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Text;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.net.URL;
import java.util.List;

/**
 * The type Breakfast menu.
 */
@Root(name="breakfast_menu")
public class BreakfastMenu {

    /**
     * The Food.
     */
    @ElementList(name="food", required=false, entry="food", inline=true)
    List<Food> food;

    /**
     * Gets food.
     *
     * @return the food
     */
    public List<Food> getFood() {return this.food;}

    /**
     * Sets food.
     *
     * @param value the value
     */
    public void setFood(List<Food> value) {this.food = value;}

    /**
     * The type Food.
     */
    public static class Food {

        /**
         * The Price.
         */
        @Element(name="price", required=false)
        String price;

        /**
         * The Name.
         */
        @Element(name="name", required=false)
        String name;

        /**
         * The Description.
         */
        @Element(name="description", required=false)
        String description;

        /**
         * The Calories.
         */
        @Element(name="calories", required=false)
        String calories;

        /**
         * Gets price.
         *
         * @return the price
         */
        public String getPrice() {return this.price;}

        /**
         * Sets price.
         *
         * @param value the value
         */
        public void setPrice(String value) {this.price = value;}

        /**
         * Gets name.
         *
         * @return the name
         */
        public String getName() {return this.name;}

        /**
         * Sets name.
         *
         * @param value the value
         */
        public void setName(String value) {this.name = value;}

        /**
         * Gets description.
         *
         * @return the description
         */
        public String getDescription() {return this.description;}

        /**
         * Sets description.
         *
         * @param value the value
         */
        public void setDescription(String value) {this.description = value;}

        /**
         * Gets calories.
         *
         * @return the calories
         */
        public String getCalories() {return this.calories;}

        /**
         * Sets calories.
         *
         * @param value the value
         */
        public void setCalories(String value) {this.calories = value;}

    }

}