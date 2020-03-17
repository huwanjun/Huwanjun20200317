package com.bw.huwanjun.net;

import android.database.Observable;

import com.bw.huwanjun.bean.GoodsBean;


import java.util.jar.Attributes;

import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * author: 斛万珺
 * data: 2020/3/17 09:9:10
 * function:
 */
public interface ApiService {

    @GET("/order?page=1&pageSize=2&type=0")
    Observable<GoodsBean>getData(@Query("name")String name,@Query("imageUrl")String imageUrl);



}
