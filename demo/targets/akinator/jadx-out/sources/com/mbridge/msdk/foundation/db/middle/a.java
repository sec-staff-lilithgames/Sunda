package com.mbridge.msdk.foundation.db.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.g;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.x0;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f40479a = "FrequencyDaoMiddle";

    /* renamed from: b, reason: collision with root package name */
    private static a f40480b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f40481c = "FrequencyDaoMiddle";

    /* renamed from: d, reason: collision with root package name */
    private static JSONArray f40482d = new JSONArray();

    private a() {
        c();
    }

    public static a b() {
        if (f40480b == null) {
            synchronized (a.class) {
                try {
                    if (f40480b == null) {
                        f40480b = new a();
                    }
                } finally {
                }
            }
        }
        return f40480b;
    }

    private void c() {
        try {
            String str = (String) x0.a(c.m().d(), f40481c, f40482d.toString());
            if (TextUtils.isEmpty(str)) {
                return;
            }
            f40482d = new JSONArray(str);
        } catch (Exception e10) {
            p0.b(f40479a, e10.getMessage());
        }
    }

    private void d() {
        try {
            if (f40482d != null) {
                x0.b(c.m().d(), f40481c, f40482d.toString());
            }
        } catch (Exception e10) {
            p0.b(f40479a, e10.getMessage());
        }
    }

    public void a(g gVar) {
        JSONObject jSONObjectA;
        if (gVar == null || (jSONObjectA = a(gVar.a(), gVar.c(), gVar.d(), gVar.f(), gVar.e(), gVar.b())) == null) {
            return;
        }
        if (f40482d == null) {
            f40482d = new JSONArray();
        }
        f40482d.put(jSONObjectA);
        d();
    }

    public void a(String str) throws JSONException {
        if (f40482d != null) {
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < f40482d.length(); i10++) {
                try {
                    JSONObject jSONObject = f40482d.getJSONObject(i10);
                    if (jSONObject != null) {
                        if (jSONObject.optString("id", "").equals(str)) {
                            jSONObject.put("impression_count", jSONObject.optInt("impression_count", 0) + 1);
                            jSONArray.put(jSONObject);
                        } else {
                            jSONArray.put(jSONObject);
                        }
                    }
                } catch (JSONException e10) {
                    p0.b(f40479a, e10.getMessage());
                }
            }
            if (jSONArray.length() > 0) {
                f40482d = jSONArray;
            }
            d();
        }
    }

    public String[] a() {
        ArrayList arrayList = new ArrayList();
        if (f40482d != null) {
            for (int i10 = 0; i10 < f40482d.length(); i10++) {
                try {
                    JSONObject jSONObject = f40482d.getJSONObject(i10);
                    if (jSONObject != null && jSONObject.optInt("fc_a") < jSONObject.optInt("impression_count")) {
                        arrayList.add(jSONObject.optString("id"));
                    }
                } catch (JSONException e10) {
                    p0.b(f40479a, e10.getMessage());
                }
            }
        }
        String[] strArr = new String[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            strArr[i11] = (String) arrayList.get(i11);
        }
        return strArr;
    }

    public void a(long j10) throws JSONException {
        if (f40482d != null) {
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < f40482d.length(); i10++) {
                try {
                    JSONObject jSONObject = f40482d.getJSONObject(i10);
                    if (jSONObject != null && jSONObject.optInt("ts") >= j10) {
                        jSONArray.put(jSONObject);
                    }
                } catch (JSONException e10) {
                    p0.b(f40479a, e10.getMessage());
                }
            }
            if (jSONArray.length() > 0) {
                f40482d = jSONArray;
            }
        }
        d();
    }

    private JSONObject a(String str, int i10, int i11, long j10, int i12, int i13) throws JSONException {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e10) {
            e = e10;
            jSONObject = null;
        }
        try {
            jSONObject.put("id", str);
            jSONObject.put("fc_a", i10);
            jSONObject.put("fc_b", i11);
            jSONObject.put("ts", j10);
            jSONObject.put("impression_count", i12);
            jSONObject.put("click_count", i13);
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            p0.b(f40479a, e.getMessage());
            return jSONObject;
        }
    }
}
