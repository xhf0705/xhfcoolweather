package com.example.xhfcoolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/1/30.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String WeatherId;
    private int cituId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return WeatherId;
    }

    public void setWeatherId(String weatherId) {
        WeatherId = weatherId;
    }

    public int getCituId() {
        return cituId;
    }

    public void setCituId(int cituId) {
        this.cituId = cituId;
    }
}
