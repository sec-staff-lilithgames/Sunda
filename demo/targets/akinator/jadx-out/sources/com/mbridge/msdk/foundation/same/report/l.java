package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.tools.p0;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f40942a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40943b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, String> f40944a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final String f40945b;

        public b(String str) {
            this.f40945b = str;
        }

        public l a() {
            return new l(this);
        }
    }

    private void a(Map<String, String> map, JSONObject jSONObject) throws JSONException {
        if (map == null || map.isEmpty() || jSONObject == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, a(map.get(str)));
            }
        } catch (Exception e10) {
            p0.b("SameCommonReporter", e10.getMessage());
        }
    }

    public void b(String str) {
        if (TextUtils.isEmpty(this.f40943b)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3191e4.h.W, this.f40943b);
            a(this.f40942a, jSONObject);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            p0.b("SameCommonReporter", th2.getMessage());
        }
    }

    private l(b bVar) {
        this.f40943b = bVar.f40945b;
        this.f40942a = bVar.f40944a;
    }

    private String a(String str) {
        try {
            return URLEncoder.encode(str, G5.N);
        } catch (Exception unused) {
            return str;
        }
    }
}
