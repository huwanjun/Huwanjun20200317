package com.bw.huwanjun.model;

import com.bw.huwanjun.contract.IGoodsContract;
import com.bw.huwanjun.contract.ILoginContract;
import com.bw.huwanjun.net.ApiService;
import com.bw.huwanjun.net.RetrofitUtil;

/**
 * author: 斛万珺
 * data: 2020/3/17 11:11:23
 * function:
 */
public class ILoginModel implements ILoginContract.IModel {
    @Override
    public void getLoginData(String phone, String pwd, IGoodsContract.IModel.IModelCallback iModelCallback) {
        RetrofitUtil instance = RetrofitUtil.getInstance();
        ApiService apiService = instance.ApiSercice();
    }
}
