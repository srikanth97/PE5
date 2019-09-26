package com.stackroute;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Frequency{
   public Map<String,Integer> frequency(String str){
       Map<String,Integer> map = new HashMap<>();
       String[] array = str.split("(\\W+|\\s+|___|,)");
       System.out.println(Arrays.toString(array));
       for(String temp:array){
           if(map.containsKey(temp) && temp != " "){
               int value = map.get(temp);
               map.put(temp,value+1);
           }else if(temp !=" "){
               map.put(temp,1);
           }
       }
       System.out.println(map.toString());
       return map;
   }

    public static void main(String[] args) {
        Frequency frequency = new Frequency();
        frequency.frequency("one one -one___two,,three,one @three*one?two");
    }
}
