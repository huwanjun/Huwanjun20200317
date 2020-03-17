package com.bw.huwanjun.presenter;

import com.bw.huwanjun.base.BasePresenter;
import com.bw.huwanjun.bean.GoodsBean;
import com.bw.huwanjun.contract.IGoodsContract;

/**
 * author: 斛万珺
 * data: 2020/3/17 10:10:43
 * function:
 */
public class IgoodsPresenter extends BasePresenter<IGoodsContract.IView> implements IGoodsContract.IPresenter {

    private IGoodsContract.IModel iModel;

    @Override
    protected void initModel() {
        iModel = new IGoodsContract.IModel();
    }

    @Override
    public void getGoodsData(String keyword) {

        iModel.getGoodsData(keyword, new IGoodsContract.IModel.IModelCallback() {
            @Override
            public void onGoodsSuccess(GoodsBean goodsBean) {
                view.onGoodsSuccess(goodsBean);
            }

            @Override
            public void onGoodsFailure(String msg) {
                view.onGoodsFailure(msg);

            }
        });
    }
}
