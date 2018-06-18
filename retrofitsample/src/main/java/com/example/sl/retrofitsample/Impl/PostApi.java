package com.example.sl.retrofitsample.Impl;

import com.example.sl.retrofitsample.Gson.Result;
import com.example.sl.retrofitsample.Gson.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by sl on 2018/5/17.
 */
//POST请求
    //我们上传一个User对象 然后返回result结果对象
public interface PostApi {
    @POST("v2/5b27a2392e000010009e4497")
    Call<Result> postUser(@Body User user);//这里我们返回的Result必定是yes 但是上传的User对象 并没有后台处理
}
