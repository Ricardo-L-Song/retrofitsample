package com.example.sl.retrofitsample.Impl;

import com.example.sl.retrofitsample.Gson.WeatherDataBean;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by sl on 2018/5/17.
 */
//http://op.juhe.cn/onebox/weather/query?cityname=深圳&key=您申请的KEY
//get请求 使用QueryMap拼接 多个参数
public interface WeatherApi1 {
    @GET("onebox/weather/query?")
    Call<WeatherDataBean>getWeatherInfo(@QueryMap Map<String,String> params);//K-V键值对的形式 等会可以put多个参数
}
