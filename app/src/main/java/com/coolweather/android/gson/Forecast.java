package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lemon on 17-4-10.
 */

public class Forecast {

    public String date;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

}
