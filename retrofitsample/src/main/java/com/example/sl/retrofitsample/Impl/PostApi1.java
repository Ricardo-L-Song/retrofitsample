package com.example.sl.retrofitsample.Impl;

import com.example.sl.retrofitsample.Gson.Result;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;

/**
 * Created by sl on 2018/5/18.
 */
//POST请求 表单提交 由于表单提交 参数是拼接在url中的 所以会出错。
public interface PostApi1 {
    @POST("v2/5afd958f3200004a00f1ad42")
    Call<Result> editUser(@Field("id") int id, @Field("name") String name);
}
