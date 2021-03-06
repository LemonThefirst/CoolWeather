package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lemon on 17-4-10.
 */

public class Suggestion {
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }


    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

}
