package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lemon on 17-4-9.
 */

public class Province extends DataSupport {

    private int id;
    private String provinceName;
    private int privinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getPrivinceCode() {
        return privinceCode;
    }

    public void setPrivinceCode(int privinceCode) {
        this.privinceCode = privinceCode;
    }
}
