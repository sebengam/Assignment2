package com.sebengam;


import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;


/**
 * Created by linux on 2016/03/06.
 */
public class TestMethods {

    @Test
    public void TestFloat(){
        Methods methods = new Methods();

        boolean result = methods.Range(95);

        Assert.assertEquals(true, result);
    }

    @Test
    public void TestFloat_Negetive(){
        Methods methods = new Methods();

        boolean result = methods.Range(100);

        Assert.assertEquals(false, result);

    }

    @Test
    public void TestObjectEquality(){
        Methods test = new Methods();

        Operand operand1 = new Operand("tankiso");
        Operand operand2 = new Operand("lebo");

        boolean result = test.IsEqual(operand1, operand2);

        Assert.assertEquals(false, result);
    }

    @Test
    public void TestNullness_Positive(){
        Methods test = new Methods();

        Operand operand1 = new Operand("Tankiso");

        String result = test.ReturnName(operand1);

        Assert.assertNotNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void TestNullness_Negetive(){
        Methods test = new Methods();

        Operand operand1 = null;

        String result = test.ReturnName(operand1);

        Assert.assertNotNull(result);
    }

    @Test
    public void Testve(){
        Methods test = new Methods();

        Operand operand1 = null;

        java.lang.Object result = test.GetObject(false);

        Assert.assertNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void TestList(){
        Methods test = new Methods();

        LinkedList list = null;

        int result = test.CoutItems(list);

        Assert.assertEquals(1, result);
    }

}
