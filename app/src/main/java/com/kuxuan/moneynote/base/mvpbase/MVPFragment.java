package com.kuxuan.moneynote.base.mvpbase;

import android.os.Bundle;

import com.kuxuan.moneynote.base.BaseFragment;
import com.kuxuan.moneynote.utils.CreateUtil;


/**
 * Created by xieshengqi on 2017/7/6.
 */

public abstract class MVPFragment< P extends BasePresent, M extends BaseModel> extends BaseFragment {


    protected P mPresenter;
    protected M mModel;

    @Override
    public void onBaseCreate(Bundle savedInstanceState) {
        mPresenter = CreateUtil.getT(this, 0);
        //内部获取第二个类型参数的真实类型  ，反射new出对象
        mModel = CreateUtil.getT(this, 1);
        //使得P层绑定M层和V层，持有M和V的引用
        mPresenter.attachModelView(mModel, this);
        initView();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroy() {
        mPresenter.onDettach();
        super.onDestroy();
    }

    public abstract void initView();
}
