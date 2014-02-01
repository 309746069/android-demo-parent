package com.apiumtech.demo.test;

import android.annotation.TargetApi;
import android.os.Build;
import android.test.ActivityInstrumentationTestCase2;
import com.apiumtech.demo.HelloAndroidActivity;

@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
public class HelloAndroidActivityTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {

    public HelloAndroidActivityTest() {
        super(HelloAndroidActivity.class); 
    }

    public void testActivity() {
        HelloAndroidActivity activity = getActivity();
        assertNotNull(activity);
    }

    public void test_getLastName_getAndSaveJson() throws Exception {
        HelloAndroidActivity activity = getActivity();
        String actual = activity.getPresenter().getLastName();
        String expected = "Petrainen";
        assertEquals(expected,actual);
    }
}

