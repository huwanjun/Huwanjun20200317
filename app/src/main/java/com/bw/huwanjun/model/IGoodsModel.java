package com.bw.huwanjun.model;

import android.database.Observable;

import com.bw.huwanjun.bean.GoodsBean;
import com.bw.huwanjun.contract.IGoodsContract;
import com.bw.huwanjun.net.ApiService;
import com.bw.huwanjun.net.RetrofitUtil;

import java.util.jar.Attributes;

/**
 * author: 斛万珺
 * data: 2020/3/17 10:10:18
 * function:
 */
public class IGoodsModel implements IGoodsContract.IModel {
    @Override
    public void getGoodsData(String keyword, IModelCallback iModelCallback) {
        RetrofitUtil instance = RetrofitUtil.getInstance();
        ApiService apiService = instance.ApiSercice();


    }
}
