package com.bw.huwanjun;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bw.huwanjun.adapter.MyAdapter;
import com.bw.huwanjun.base.BaseActivity;
import com.bw.huwanjun.bean.GoodsBean;
import com.bw.huwanjun.contract.IGoodsContract;
import com.bw.huwanjun.presenter.IgoodsPresenter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends BaseActivity<IgoodsPresenter> implements IGoodsContract.IView {


    @BindView(R.id.recy)
    RecyclerView recy;

    @Override
    protected void initData() {
        mPresenter.getGoodsData("农家自产百合干");
    }

    @Override
    protected void initView() {
        Unbinder bind = ButterKnife.bind(this);
        bind.unbind();
    }

    @Override
    protected IgoodsPresenter providePresenter() {
        return new IgoodsPresenter();
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onGoodsSuccess(GoodsBean goodsBean) {

        List<GoodsBean.DataBean> data = goodsBean.getData();
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recy.setLayoutManager(manager);
        MyAdapter myAdapter = new MyAdapter(data);
        recy.setAdapter(myAdapter);

    }

    @Override
    public void onGoodsFailure(String msg) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
