package com.bw.huwanjun.presenter;

import com.bw.huwanjun.base.BaseActivity;
import com.bw.huwanjun.base.BasePresenter;
import com.bw.huwanjun.bean.GoodsBean;
import com.bw.huwanjun.contract.IGoodsContract;
import com.bw.huwanjun.contract.IRegisterContract;
import com.bw.huwanjun.net.RetrofitUtil;

import io.reactivex.internal.schedulers.NewThreadWorker;

/**
 * author: 斛万珺
 * data: 2020/3/17 11:11:27
 * function:
 */
public class IRegisterPresenter extends BasePresenter<IRegisterContract.IView> implements IRegisterContract.IPresenter {


    private IRegisterContract.IModel iModel;

    @Override
    protected void initModel() {
        iModel = new IRegisterContract.IModel();
    }

    @Override
    public void getRegisterData(String phone, String pwd) {

        iModel.getRegisterData(phone, pwd, new IGoodsContract.IModel.IModelCallback() {
            @Override
            public void onGoodsSuccess(GoodsBean goodsBean) {
                view.onRegisterSuccess(goodsBean);
            }

            @Override
            public void onGoodsFailure(String msg) {
                view.onRegisterFailure(msg);
            }
        });
    }
}
