package com.bw.huwanjun.base;

/**
 * author: 斛万珺
 * data: 2020/3/17 09:9:00
 * function:
 */
public abstract class BasePresenter<V> {
//basepresenter的封装
    protected V view;

    public void attach(V view){
        this.view=view;
    }

    public void detach(){
       view=null;
    }

    public BasePresenter() {

        initModel();
    }

    protected abstract void initModel();
}
