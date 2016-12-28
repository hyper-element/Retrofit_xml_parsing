package main;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import common.method.Method;
import example.retrofit.xml.parser.R;
import interfaces.Webservices;
import model.BreakfastMenu;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFood();
    }

    /**
     * Get food.
     */
    public void getFood(){
        Method.Dialogue.sD(MainActivity.this);
        Webservices webservices = Method.getRetrofit().create(Webservices.class);
        Call<BreakfastMenu> m_user_signup_form_resCall = webservices.getFood();
        m_user_signup_form_resCall.enqueue(new Callback<BreakfastMenu>() {
            @Override
            public void onResponse(Call<BreakfastMenu> call, Response<BreakfastMenu> response) {
                Method.Dialogue.hD();
                Log.d("RES", response.body().getFood().get(0).getDescription() + "...");
                String name = response.body().getFood().get(0).getName();
                String des = response.body().getFood().get(0).getDescription();
                String cal = response.body().getFood().get(0).getCalories();
                String price = response.body().getFood().get(0).getPrice();
                Toast.makeText(MainActivity.this, "NAME: "+name+"\n"+"DES: "+des+"\n"+"CAL: "+cal+"\n"+"PRICE: "+price, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<BreakfastMenu> call, Throwable t) {
                Method.Dialogue.hD();
                Log.e("Error", t.toString());
            }
        });
    }
}
