package com.example.sl.retrofitsample.Impl;

import com.example.sl.retrofitsample.Gson.GankBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by sl on 2018/5/17.
 */
//http://gank.io/api/data/Android/10/1
//get请求 使用占位符 path
    //可选参数 使用占位符
//后面三个参数
//Android可接受参数  | Android | iOS | 休息视频 | 福利 | 前端 | App
//count 最大 50
//page  是页数
    //这里我们使用占位符占位Page
public interface GnakApi1 {
    @GET("api/data/Android/10/{page}")
    Call<GankBean>getAndroidInfo1(@Path("page")int page);//登记回调函数
}
