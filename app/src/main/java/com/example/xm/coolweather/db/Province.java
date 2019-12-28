package com.example.xm.coolweather.db;
//存放数据库模型相关的代码，province省的名字，provincecode省的代号，id是每个实体类都必须有的字段
/**
 * Created by XM on 2019/12/28.
 */
//LitePal中的每一个实体类都是必须要继承自DataSupport类的
public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
