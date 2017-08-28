package com.dzr.common.mq.util;

import com.alibaba.fastjson.JSON;

/**
 * @author tanxiongying
 */
public class Serialization {

    public static final String CHARSET = "UTF-8";

    public static <T> byte[] getBytes(T t){
        if(t == null) return null;
        try {
            return JSON.toJSONString(t).getBytes(CHARSET);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T getPOJO(byte[] bytes, Class<T> tClass){
        try {
            return JSON.parseObject(new String(bytes, CHARSET), tClass);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
