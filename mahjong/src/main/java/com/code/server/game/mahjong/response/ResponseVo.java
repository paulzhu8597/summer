package com.code.server.game.mahjong.response;

import com.google.gson.Gson;
import net.sf.json.JSONObject;

/**
 * Created by win7 on 2016/12/1.
 */
public class ResponseVo {
    private static Gson gson = new Gson();

    private String service;
    private String method;
    private Object params;
    private int code = 0;

    public ResponseVo(String service, String method, Object params) {
        this.service = service;
        this.method = method;
        this.params = params;
    }

    public ResponseVo(String service, String method, int code) {
        this.service = service;
        this.method = method;
        this.params = null;
        this.code = code;
    }


    public String toJson() {
        return gson.toJson(this);
    }

    public JSONObject toJsonObject() {
        JSONObject o = new JSONObject();
        o.put("service", service);
        o.put("method", method);
        o.put("params", gson.toJson(params));
        o.put("code",""+code);
        return o;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
