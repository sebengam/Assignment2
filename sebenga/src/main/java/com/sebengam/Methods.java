package com.sebengam;

import java.util.LinkedList;

/**
 * Created by linux on 2016/03/06.
 */
public class Methods {

    /*
    * Test float if is within range
    * */
    public boolean Range(float randomNumber){
        float min = 0.1f;
        float max = 99.9f;

        return (randomNumber >= min && randomNumber<= max);
    }

    /*
    * Test if two objects of the same type are equal
    * */

    public boolean IsEqual(Operand obj1, Operand obj2){
        if(obj1 == null && obj2== null){
            return true;
        }
        else if((obj1 != null) && (obj2 != null)){
            if(obj1.GetName() == obj2.GetName()){
                return true;
            }

            return false;
        }

        return false;


    }

    /*
    * Test object reference nullness
    * */

    public String ReturnName(Operand operand){
        return operand.GetName();
    }


    /*
    * Test object reference nullness
    * */

    public Object GetObject(boolean bool){
        if(bool)
            return new Object();

        return null;
    }

    /*
    * Test List
    * */


    public int CoutItems(LinkedList list){
        return list.size();
    }

}

class Operand{
    private String name;

    public Operand(String name){
        SetName(name);
    }

    public void SetName(String name){
        this.name = name;
    }

    public  String GetName(){
        return name;
    }
}


