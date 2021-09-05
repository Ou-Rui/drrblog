package cn.tongji.drrblog.common;

import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

public class ResponseData extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public ResponseData() {
        put("code", 0);
        put("message", "success");
    }

    public static ResponseData error() {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
    }

    public static ResponseData error(String msg) {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
    }

    public static ResponseData error(int code, String msg) {
        ResponseData r = new ResponseData();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static ResponseData ok(String msg) {
        ResponseData r = new ResponseData();
        r.put("msg", msg);
        return r;
    }

    public static ResponseData ok(Map<String, Object> map) {
        ResponseData r = new ResponseData();
        //r.putAll(map);
        r.put("data", map);
        return r;
    }

    public static ResponseData ok(Object object) {
        ResponseData r = new ResponseData();
        r.put("data", object);
        return r;
    }

    public static ResponseData ok() {
        return new ResponseData();
    }

    @Override
    public ResponseData put(String key, Object value) {
        super.put(key, value);
        return this;
    }

}
