package com.bw.huwanjun.contract;

import android.widget.ImageView;

import com.bw.huwanjun.bean.GoodsBean;

/**
 * author: 斛万珺
 * data: 2020/3/17 10:10:13
 * function:
 */
public interface IGoodsContract {
//订单——契约类
    interface IView{

        void onGoodsSuccess(GoodsBean goodsBean);
        void onGoodsFailure(String msg);
    }


    interface IPresenter{

        void getGoodsData(String keyword);
    }

    interface IModel{

        void getGoodsData(String keyword,IModelCallback iModelCallback);
        interface IModelCallback{

            void onGoodsSuccess(GoodsBean goodsBean);
            void onGoodsFailure(String msg);
        }

    }


}
