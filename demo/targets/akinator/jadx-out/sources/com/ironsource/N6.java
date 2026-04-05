package com.ironsource;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class N6 {

    /* renamed from: b, reason: collision with root package name */
    public static final String f35041b = "userId";

    /* renamed from: c, reason: collision with root package name */
    public static final String f35042c = "appKey";

    /* renamed from: d, reason: collision with root package name */
    private static N6 f35043d;

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f35044a = new JSONObject();

    private N6() {
    }

    public static synchronized N6 a() {
        try {
            if (f35043d == null) {
                f35043d = new N6();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f35043d;
    }

    public synchronized JSONObject b() throws JSONException {
        if (Mb.U().g().f()) {
            return new JSONObject(this.f35044a.toString());
        }
        return this.f35044a;
    }

    public synchronized void a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                a(str, map.get(str));
            }
        }
    }

    public synchronized void a(String str, Object obj) {
        try {
            this.f35044a.put(str, obj);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
        }
    }

    public synchronized String a(String str) {
        return this.f35044a.optString(str);
    }
}
