package com.argos.utils;

import java.util.Random;

public class Helpers {

    public int randomNumber(int boundValue){
        Random random = new Random();
        int randomNumber = random.nextInt(boundValue-1);
        return randomNumber;

    }
}
