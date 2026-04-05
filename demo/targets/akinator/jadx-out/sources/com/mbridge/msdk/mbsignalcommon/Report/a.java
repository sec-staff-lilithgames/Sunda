package com.mbridge.msdk.mbsignalcommon.Report;

import android.content.Context;
import android.util.Base64;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.n;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final String f41803c = "a";

    /* renamed from: a, reason: collision with root package name */
    int f41804a = 0;

    /* renamed from: b, reason: collision with root package name */
    int f41805b = 1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.mbsignalcommon.Report.a$a, reason: collision with other inner class name */
    public static final class C0296a {

        /* renamed from: a, reason: collision with root package name */
        private static a f41806a = new a();
    }

    public static a a() {
        return C0296a.f41806a;
    }

    public void a(Object obj, String str, JSONArray jSONArray, int i10) {
        int i11;
        String str2;
        String string;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4;
        JSONObject jSONObjectOptJSONObject5;
        JSONObject jSONObjectOptJSONObject6;
        JSONObject jSONObjectOptJSONObject7;
        JSONObject jSONObjectOptJSONObject8;
        JSONObject jSONObjectOptJSONObject9;
        JSONObject jSONObjectOptJSONObject10;
        JSONObject jSONObjectOptJSONObject11;
        int i12;
        try {
            if (jSONArray == null) {
                a(this.f41805b, "called reporter failed, params empty", obj);
                return;
            }
            int length = jSONArray.length();
            if (length == 0) {
                a(this.f41805b, "called reporter failed, params empty", obj);
                return;
            }
            int i13 = 0;
            if ("reportMessageR".equalsIgnoreCase(str)) {
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    i12 = length - 1;
                    if (i13 >= i12) {
                        break;
                    }
                    JSONObject jSONObjectOptJSONObject12 = jSONArray.optJSONObject(i13);
                    if (jSONObjectOptJSONObject12 != null) {
                        stringBuffer.append(jSONObjectOptJSONObject12.optString(C3191e4.h.W));
                        stringBuffer.append(C3191e4.i.f36525b);
                        stringBuffer.append(jSONObjectOptJSONObject12.opt("value"));
                        stringBuffer.append(C3191e4.i.f36527c);
                    }
                    i13++;
                }
                JSONObject jSONObjectOptJSONObject13 = jSONArray.optJSONObject(i12);
                if (jSONObjectOptJSONObject13 != null) {
                    stringBuffer.append(jSONObjectOptJSONObject13.optString(C3191e4.h.W));
                    stringBuffer.append(C3191e4.i.f36525b);
                    stringBuffer.append(jSONObjectOptJSONObject13.opt("value"));
                }
                a(stringBuffer.toString());
            } else if ("reportMessageD".equalsIgnoreCase(str)) {
                String string2 = (length <= 0 || (jSONObjectOptJSONObject11 = jSONArray.optJSONObject(0)) == null) ? "" : jSONObjectOptJSONObject11.getString("value");
                int i14 = (length <= 1 || (jSONObjectOptJSONObject10 = jSONArray.optJSONObject(1)) == null) ? -1 : jSONObjectOptJSONObject10.getInt("value");
                int i15 = (length <= 2 || (jSONObjectOptJSONObject9 = jSONArray.optJSONObject(2)) == null) ? -1 : jSONObjectOptJSONObject9.getInt("value");
                int i16 = (length <= 3 || (jSONObjectOptJSONObject8 = jSONArray.optJSONObject(3)) == null) ? -1 : jSONObjectOptJSONObject8.getInt("value");
                int i17 = (length <= 4 || (jSONObjectOptJSONObject7 = jSONArray.optJSONObject(4)) == null) ? -1 : jSONObjectOptJSONObject7.getInt("value");
                String string3 = (length <= 5 || (jSONObjectOptJSONObject6 = jSONArray.optJSONObject(5)) == null) ? "" : jSONObjectOptJSONObject6.getString("value");
                String string4 = (length <= 6 || (jSONObjectOptJSONObject5 = jSONArray.optJSONObject(6)) == null) ? "" : jSONObjectOptJSONObject5.getString("value");
                int i18 = (length <= 7 || (jSONObjectOptJSONObject4 = jSONArray.optJSONObject(7)) == null) ? -1 : jSONObjectOptJSONObject4.getInt("value");
                String string5 = (length <= 8 || (jSONObjectOptJSONObject3 = jSONArray.optJSONObject(8)) == null) ? "" : jSONObjectOptJSONObject3.getString("value");
                int i19 = (length <= 9 || (jSONObjectOptJSONObject2 = jSONArray.optJSONObject(9)) == null) ? -1 : jSONObjectOptJSONObject2.getInt("value");
                if (length <= 10 || (jSONObjectOptJSONObject = jSONArray.optJSONObject(10)) == null) {
                    i11 = i15;
                    str2 = string4;
                    string = "";
                } else {
                    i11 = i15;
                    str2 = string4;
                    string = jSONObjectOptJSONObject.getString("value");
                }
                a(string2, i14, i11, i16, i17, string3, str2, i18, string5, i19, string);
            }
            a(this.f41804a, "called reporter success", obj);
        } catch (Throwable th2) {
            p0.a(f41803c, th2.getMessage());
            a(this.f41805b, "exception: " + th2.getMessage(), obj);
        }
    }

    public void a(String str) {
        d.b().e(str);
    }

    public void a(String str, int i10, int i11, int i12, int i13, String str2, String str3, int i14, String str4, int i15, String str5) {
        try {
            Context contextD = c.m().d();
            if (contextD != null) {
                n.a(g.a(contextD)).a(new com.mbridge.msdk.foundation.entity.n(str, i10, i11, i12, i13, str2, str3, i14, str4, i15, str5));
            }
        } catch (Throwable th2) {
            p0.a(f41803c, th2.getMessage());
        }
    }

    public void a(int i10, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e10) {
            p0.a(f41803c, e10.getMessage());
        } catch (Throwable th2) {
            p0.a(f41803c, th2.getMessage());
        }
    }
}
