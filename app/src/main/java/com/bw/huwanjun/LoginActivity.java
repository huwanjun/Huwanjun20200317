package com.bw.huwanjun;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.bw.huwanjun.base.BaseActivity;
import com.bw.huwanjun.bean.RegisterBean;
import com.bw.huwanjun.contract.ILoginContract;
import com.bw.huwanjun.presenter.ILoginPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class LoginActivity extends BaseActivity<ILoginPresenter> implements ILoginContract.IView {


    @BindView(R.id.edit_phone)
    EditText editPhone;
    @BindView(R.id.edit_pwd)
    EditText editPwd;
    @BindView(R.id.btn_zhu)
    Button btnZhu;
    @BindView(R.id.btn_deng)
    Button btnDeng;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

        Unbinder bind = ButterKnife.bind(this);
        bind.unbind();
    }

    @Override
    protected ILoginPresenter providePresenter() {
        return null;
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void onLoginSuccess(RegisterBean registerBean) {

    }

    @Override
    public void onLoginFailure(String msg) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
