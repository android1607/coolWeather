package com.rengui.coolweather.gson;

/**
 * Created by Administrator on 2017/6/6 0006.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
