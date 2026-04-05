package com.mbridge.msdk.foundation.same.net.wrapper;

import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    private static final String f40871c = "e";

    /* renamed from: d, reason: collision with root package name */
    public static String f40872d = "h";

    /* renamed from: e, reason: collision with root package name */
    public static String f40873e = "i";

    /* renamed from: f, reason: collision with root package name */
    public static String f40874f = "coppa";

    /* renamed from: g, reason: collision with root package name */
    public static String f40875g = "d";

    /* renamed from: h, reason: collision with root package name */
    public static String f40876h = "e";

    /* renamed from: i, reason: collision with root package name */
    public static String f40877i = "a";

    /* renamed from: j, reason: collision with root package name */
    public static String f40878j = "f";

    /* renamed from: k, reason: collision with root package name */
    public static String f40879k = "g";

    /* renamed from: a, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.foundation.same.net.model.a> f40880a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f40881b = new LinkedHashMap();

    public void a(String str, String str2) {
        if (str2 == null) {
            p0.b(f40871c, "add() value is null!");
        }
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        this.f40881b.put(str, str2);
    }

    public String b() {
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : this.f40881b.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append('&');
                }
                sb2.append(URLEncoder.encode(entry.getKey(), C.UTF8_NAME));
                sb2.append(C3191e4.i.f36525b);
                sb2.append(URLEncoder.encode(entry.getValue(), C.UTF8_NAME));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return sb2.toString();
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f40881b.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry.getKey(), C.UTF8_NAME), URLEncoder.encode(entry.getValue(), C.UTF8_NAME));
            }
            for (Map.Entry<String, com.mbridge.msdk.foundation.same.net.model.a> entry2 : this.f40880a.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry2.getKey(), C.UTF8_NAME), URLEncoder.encode("FILE_NAME_" + entry2.getValue().a().getName(), C.UTF8_NAME));
            }
        } catch (UnsupportedEncodingException unused) {
        } catch (JSONException e10) {
            p0.b(f40871c, e10.getMessage());
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(28);
        try {
            for (Map.Entry<String, String> entry : this.f40881b.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append('&');
                }
                sb2.append(URLEncoder.encode(entry.getKey(), C.UTF8_NAME));
                sb2.append(G5.T);
                sb2.append(URLEncoder.encode(entry.getValue(), C.UTF8_NAME));
            }
            for (Map.Entry<String, com.mbridge.msdk.foundation.same.net.model.a> entry2 : this.f40880a.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append('&');
                }
                sb2.append(URLEncoder.encode(entry2.getKey(), C.UTF8_NAME));
                sb2.append(G5.T);
                sb2.append(URLEncoder.encode("FILE_NAME_" + entry2.getValue().a().getName(), C.UTF8_NAME));
            }
        } catch (UnsupportedEncodingException e10) {
            p0.b(f40871c, e10.getMessage());
        }
        return sb2.toString();
    }

    public Map<String, String> a() {
        return this.f40881b;
    }

    public void a(String str) {
        this.f40881b.remove(str);
        this.f40880a.remove(str);
    }
}
