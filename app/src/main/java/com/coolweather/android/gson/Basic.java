package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    // 使用 @SerializedName 注解的方式来让 JSON 字段和Java字段之间建立映射关系
    @SerializedName("city")
    //@SerializedName("location")
    public String cityName;

    @SerializedName("id")
    //@SerializedName("cid")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
