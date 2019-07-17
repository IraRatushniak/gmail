package com.softserve.edu.tools;
import java.util.Random;

/**
 * Here we have class for creating random text
 * with given size
 */
public class RandomText {
    public static String subjectOfTheMessage(int length){
        Random random=new Random();
        StringBuffer randomText=new StringBuffer("");
        char randomChar;
        for(int i=0; i<length;i++){
            randomChar=(char)(random.nextInt(25)+97);
            randomText.append(randomChar);
        }
        return randomText.toString();
    }
}
