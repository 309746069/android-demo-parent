package com.apiumtech.demo.presenter;


import com.apiumtech.demo.presenter.commons.BasePresenter;

public class DemoPresenter extends BasePresenter<IDemoView, IDemoModel> implements IDemoPresenter {

    public DemoPresenter(IDemoView activity, IDemoModel serviceLayer) {
        super(activity, serviceLayer);
    }



    @Override
    public String getLastName() {
        return getModel().getLastName();
    }
}
