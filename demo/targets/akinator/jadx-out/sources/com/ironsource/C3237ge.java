package com.ironsource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ge, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3237ge {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f36813a;

    public C3237ge() {
        this.f36813a = new JSONObject();
    }

    private void f(String str) {
        try {
            this.f36813a = new JSONObject(str);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            this.f36813a = new JSONObject();
        }
    }

    public JSONObject a() {
        return this.f36813a;
    }

    public Object b(String str) {
        try {
            return a().get(str);
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            return null;
        }
    }

    public boolean c(String str) {
        return this.f36813a.optBoolean(str);
    }

    public String d(String str) {
        return this.f36813a.optString(str, null);
    }

    public boolean e(String str) {
        return a().isNull(str);
    }

    public String toString() {
        JSONObject jSONObject = this.f36813a;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public boolean a(String str) {
        return a().has(str);
    }

    public C3237ge(String str) {
        f(str);
    }

    public static Object b(Object obj) throws JSONException {
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                if (obj2 != null) {
                    jSONObject.put(obj2.toString(), b(map.get(obj2)));
                }
            }
            return jSONObject;
        }
        if (!(obj instanceof Iterable)) {
            return obj;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    public String a(String str, String str2) {
        return this.f36813a.optString(str, str2);
    }

    public int a(String str, int i10) {
        return this.f36813a.optInt(str, i10);
    }

    public static boolean a(JSONObject jSONObject) {
        return jSONObject.names() == null;
    }

    public List a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(a(jSONArray.get(i10)));
        }
        return arrayList;
    }

    public void a(String str, JSONObject jSONObject) throws JSONException {
        try {
            this.f36813a.put(str, jSONObject);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
        }
    }

    private Object a(Object obj) throws JSONException {
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return b((JSONObject) obj);
        }
        return obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    public void b(String str, String str2) throws JSONException {
        try {
            this.f36813a.put(str, str2);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
        }
    }

    private Map<String, Object> b(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, a(jSONObject.get(next)));
        }
        return map;
    }
}
