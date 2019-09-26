package com.stackroute;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyBoolean{
    public Map<String,Boolean> frequency(String[] str){
        Map<String,Boolean> map = new HashMap<>();
        for(String temp:str){
            if(map.containsKey(temp)){
                map.put(temp,true);
            }else if(temp !=" "){
                map.put(temp,false);
            }
        }
        System.out.println(map.toString());
        return map;
    }

    public static void main(String[] args) {
        FrequencyBoolean frequency = new FrequencyBoolean();
        String[] arr = {"a","b","c","d","a","c","c"};
        frequency.frequency(arr);
    }
}
