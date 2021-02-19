package com.mg.webexcel.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Lx
 * @create: 2018-09-28 11:16
 **/
public class R extends HashMap<String, Object> {
    private static final long serialVersionUID = 13L;

    public static R error() {
        return error(500, "操作失败");
    }

    public static R error(String msg) {
        return error(500, msg);
    }

    public static R other(Integer code, Map<String, Object> map) {
        R r = new R();
        r.setCode(code);
        r.putAll(map);
        return r;
    }

    public static R other(Integer code, String msg) {
        R r = new R();
        r.setCode(code);
        r.put("msg", msg);
        return r;
    }


    public static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static R error(int code, String msg, String detail) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        r.put("detail", detail);
        return r;
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("code", "200");
        r.put("data", "");
        r.put("msg", msg);
        return r;
    }

    public static R ok(Object o) {
        R r = new R();
        r.put("code", "200");
        r.put("data", o);
        return r;
    }


    public static R ok() {
        R r = new R();
        r.put("code", "200");
        r.put("msg", "操作成功");
        return r;
    }

    public static R page(String s) {
        JSONObject jsonObject = JSONObject.parseObject(s);
        List<JSONObject> datas = null;
        try {
            datas = jsonObject.getJSONArray("datas").toJavaList(JSONObject.class);
        } catch (Exception e) {
            datas = new ArrayList<>();
        }
        jsonObject.put("data", datas);
        jsonObject.remove("datas");
        return R.ok(jsonObject);
    }

    public static R datas(String s) {
        if (StringUtils.isEmpty(s)) {
            return R.ok(new ArrayList<>());
        }
        JSONArray datas = JSONObject.parseObject(s).getJSONArray("datas");
        return R.ok(datas);
    }

    public static R strData(String s) {
        R r = new R();
        r.put("code", "200");
        r.put("data", s);
        return r;
    }

    public static R okSave(Object o) {
        R r = new R();
        r.put("code", "200");
        r.put("msg", "操作成功");
        r.put("data", o);
        return r;
    }

    public static R listPage(Page page) {
        R ok = R.ok();
        Map<String, Object> map = new HashMap<>();
        map.put("data", page.getContent());
        Map<String, Object> pageInfo = new HashMap<>();
        pageInfo.put("totalCount", page.getTotalElements());
        map.put("pageInfo", pageInfo);
        ok.put("data", map);
        return ok;
    }


    @Override
    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    @Override
    public Object get(Object key) {
        return super.get(key);
    }

    public Integer getCode() {
        try {
            return Integer.parseInt(super.get("code").toString());
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public Object getData() {
        try {
            return super.get("data");
        } catch (Exception e) {
            return new HashMap<>();
        }
    }

    public Object setCode(Integer i) {
        return super.put("code", i);
    }

    public String getMsg() {
        return (String) super.get("msg");
    }

    public Object setMsg(String i) {
        return super.put("msg", i);
    }

    //增加的方法
    public static R ok(Object o, Object o1) {
        R r = new R();
        r.put("code", "200");
        r.put("data", o);
        r.put("data1", o1);
        return r;
    }

}
