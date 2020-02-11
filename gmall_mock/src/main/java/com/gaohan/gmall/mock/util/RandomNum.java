package com.gaohan.gmall.mock.util;

import java.util.Random;

/**
 * @author shkstart
 * @create 2020-02-06 21:55
 */
public class RandomNum {
    public static final  int getRandInt(int fromNum,int toNum){
        return   fromNum+ new Random().nextInt(toNum-fromNum+1);
    }
}

