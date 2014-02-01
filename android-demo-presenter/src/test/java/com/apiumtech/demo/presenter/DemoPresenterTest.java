package com.apiumtech.demo.presenter;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;

public class DemoPresenterTest {

    private IDemoView view;
    private DemoPresenter sut;
    private IDemoModel model;


    @BeforeMethod
    public void setUp() throws Exception {

        view=mock(IDemoView.class);
        model=new DemoModel("Nicelastname");
        sut=new DemoPresenter(view, model);
    }

    @Test
    public void test_getLastName_() throws Exception {
        String actual = sut.getLastName();
        String expected = "Nicelastname";
        Assert.assertEquals(actual,expected);

    }
}
