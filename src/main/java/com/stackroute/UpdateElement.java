package com.stackroute;

import java.util.List;

public class UpdateElement {
    public List<String> update(List<String> list,int index,String update){
        list.set(index,update);
        list.clear();
        return list;
    }
}
