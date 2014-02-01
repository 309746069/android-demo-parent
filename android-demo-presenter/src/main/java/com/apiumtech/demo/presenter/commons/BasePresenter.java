package com.apiumtech.demo.presenter.commons;


import com.apiumtech.demo.presenter.interfaces.IActivity;
import com.apiumtech.demo.presenter.interfaces.IModel;
import com.apiumtech.demo.presenter.interfaces.IPresenter;

public class BasePresenter<T extends IActivity, M extends IModel> implements IPresenter {
    private T activity;
    private M serviceLayer;

    public T getActivity() {
        return activity;
    }

    public M getModel() {
        return serviceLayer;
    }

    protected BasePresenter(T activity, M serviceLayer)
    {
        this.activity = activity;
        this.serviceLayer = serviceLayer;
    }
}
