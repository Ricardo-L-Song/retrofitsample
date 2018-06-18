package com.example.sl.retrofitsample.Impl;

import com.example.sl.retrofitsample.Gson.WeatherDataBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by sl on 2018/5/16.
 */
//http://op.juhe.cn/onebox/weather/query?cityname=深圳&key=您申请的KEY 动态参数请求 拼接url 这里我们只拼接一个参数 KEY 要想拼接多个参数 就多生命一个query
//get请求 使用查询串拼接 单个参数
public interface WeatherApi {
    @GET("onebox/weather/query?cityname=深圳")
    Call<WeatherDataBean>getWeather(@Query("key")String key);//拼接查询串 我们这里只带了一个参数
}
