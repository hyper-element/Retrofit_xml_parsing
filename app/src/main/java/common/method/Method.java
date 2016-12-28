package common.method;

import android.app.Activity;
import android.app.ProgressDialog;
import common.utils.Data;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * The type Method.
 */
public class Method {

    private static Retrofit retrofit = null;

    /**
     * Gets retrofit.
     *
     * @return the retrofit
     */
    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Data.URL_base)
                    .addConverterFactory(SimpleXmlConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    /**
     * The type Dialogue.
     */
    public static class Dialogue {
        private static ProgressDialog progressDialog;

        /**
         * S d.
         *
         * @param activity the activity
         * @param message  the message
         */
        public static void sD(Activity activity, String message) {
            progressDialog = new ProgressDialog(activity);
            progressDialog.setMessage(message);
            progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progressDialog.setIndeterminate(true);
            progressDialog.show();
        }


        /**
         * S d.
         *
         * @param activity the activity
         */
        public static void sD(Activity activity) {
            progressDialog = new ProgressDialog(activity);
            progressDialog.setMessage("Loading, please wait");
            progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();
        }

        /**
         * H d.
         */
        public static void hD() {
            if (progressDialog != null) {
                if (progressDialog.isShowing()) {
                    progressDialog.dismiss();
                    progressDialog = null;
                }
            }

        }
    }
}
