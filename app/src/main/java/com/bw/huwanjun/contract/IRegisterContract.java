package com.bw.huwanjun.contract;

import com.bw.huwanjun.bean.GoodsBean;
import com.bw.huwanjun.bean.RegisterBean;

/**
 * author: 斛万珺
 * data: 2020/3/17 11:11:16
 * function:
 */
public interface IRegisterContract {
  //  注册——契约类
    interface IView{

        void onRegisterSuccess(RegisterBean registerBean);
        void onRegisterFailure(String msg);
    }


    interface IPresenter{

        void getRegisterData(String phone,String pwd);
    }

    interface IModel{

        void getRegisterData(String phone,String pwd, IGoodsContract.IModel.IModelCallback iModelCallback);
        interface IModelCallback{

            void onRegisterSuccess(RegisterBean registerBean);
            void onRegisterFailure(String msg);
        }

    }

}
