package com.william.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverster implements Converter<String, Date> {

    @Override
    public Date convert(String source) {

        if(source == null){
            throw new RuntimeException("请输入参数");
        }

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try {
            return df.parse(source);
        } catch (Exception e) {
            throw new RuntimeException("字符串转换成日期类型错误");
        }
    }
}
