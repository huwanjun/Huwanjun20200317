package com.bw.huwanjun.contract;

import com.bw.huwanjun.bean.RegisterBean;

/**
 * author: 斛万珺
 * data: 2020/3/17 11:11:19
 * function:
 */
public interface ILoginContract {

   // 登录——契约类
    interface IView{

        void onLoginSuccess(RegisterBean registerBean);
        void onLoginFailure(String msg);
    }


    interface IPresenter{

        void getLoginData(String phone,String pwd);
    }

    interface IModel{

        void getLoginData(String phone,String pwd, IGoodsContract.IModel.IModelCallback iModelCallback);
        interface IModelCallback{

            void onLoginSuccess(RegisterBean registerBean);
            void onLoginFailure(String msg);
        }

    }

}
