package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lemon on 17-4-10.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    public class More{
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("cond")
    public More more;
}
