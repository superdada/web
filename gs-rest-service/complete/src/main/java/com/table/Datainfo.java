package com.table;

/**
 * Created by dada on 17-4-12.
 */
public class Datainfo{
    private String data_type;
    private String data_name;
    private String data_desc;
    private String data_time;
    private int data_size;
    private String data_scope;

    public void setData_type(String data_type){
        this.data_type=data_type;
    }

    public String getData_type(){
        return data_type;
    }

    public void setData_name(String data_name){
        this.data_name=data_name;
    }

    public String getData_name(){
        return data_name;
    }

    public void setData_desc(String data_desc){
        this.data_desc=data_desc;
    }

    public String getData_desc(){
        return data_desc;
    }

    public void setData_time(String data_time){
        this.data_time=data_time;
    }

    public String getData_time(){
        return data_time;
    }

    public void setData_size(int data_size){
        this.data_size=data_size;
    }

    public int getData_size(){
        return data_size;
    }

    public void setData_scope(String data_scope){
        this.data_scope=data_scope;
    }

    public String getData_scope(){
        return data_scope;
    }
}