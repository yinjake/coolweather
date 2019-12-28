package com.example.xm.coolweather.db;
//countyname记录县的名字 weatherID记录县所对应的天气ID，cityID记录当前县所属市的ID
/**
 * Created by XM on 2019/12/28.
 */

public class County extends DataSupport{
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName = countyName;
    }
    public String getWeatherId(){
        return WeatherId;
    }
    public void setWeatherId(string weatherId){
        this.weatherId = weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}
