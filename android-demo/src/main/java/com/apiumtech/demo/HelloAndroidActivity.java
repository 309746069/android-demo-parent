package com.apiumtech.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import com.apiumtech.demo.presenter.DemoModel;
import com.apiumtech.demo.presenter.DemoPresenter;
import com.apiumtech.demo.presenter.IDemoPresenter;
import com.apiumtech.demo.presenter.IDemoView;

public class HelloAndroidActivity extends Activity implements IHelloAndroid, IDemoView {


    protected IDemoPresenter presenter;
    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after 
     * previously being shut down then this Bundle contains the data it most 
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DemoModel demoModel = new DemoModel("Petrainen");
        presenter = new DemoPresenter(this,demoModel);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.main, menu);
	return true;
    }

    @Override
    public IDemoPresenter getPresenter() {
        return presenter;
    }

    @Override
    public void onClickedSomeButton() {
        // I do some binding here.
        getPresenter().getLastName();
    }
}

