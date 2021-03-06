package com.xqdd.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 10324 on 2017/10/2.
 */

public class City extends DataSupport {
    private Integer id;
    private String name;
    private Integer provinceId;
    private Integer cityId;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
