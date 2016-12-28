package interfaces;

import model.BreakfastMenu;
import model.M_breakfastmenu;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * The interface Webservices.
 */
public interface Webservices {

    /**
     * Gets food.
     *
     * @return the food
     */
    @GET("xml/simple.xml")

    Call<BreakfastMenu> getFood();
}
