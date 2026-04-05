package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.tools.p0;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static volatile f f40936b;

    /* renamed from: a, reason: collision with root package name */
    private volatile com.mbridge.msdk.tracker.m f40937a;

    public static f a() {
        if (f40936b == null) {
            synchronized (f.class) {
                try {
                    if (f40936b == null) {
                        f40936b = new f();
                    }
                } finally {
                }
            }
        }
        return f40936b;
    }

    public com.mbridge.msdk.tracker.m b() {
        if (this.f40937a == null) {
            this.f40937a = com.mbridge.msdk.foundation.same.report.metrics.d.b().d();
        }
        return this.f40937a;
    }

    public void c() {
        b().a();
    }

    public void a(Context context, String str, String str2, String str3, String str4, int i10) throws JSONException {
        com.mbridge.msdk.tracker.m mVarB = a().b();
        if (mVarB == null) {
            return;
        }
        String str5 = GalEuEfxjome.JJFhLtw;
        if (!mVarB.a(str5)) {
            p0.a("MetricsReportUtil", "reportClickImpException can not track");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.isEmpty(str2)) {
                jSONObject.put("url", "");
            } else {
                jSONObject.put("url", URLEncoder.encode(str2, G5.N));
            }
            jSONObject.put("type", i10);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("rid", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("rid_n", str4);
            }
            try {
                long[] jArrE = mVarB.e();
                jSONObject.put("track_time", jArrE[0]);
                jSONObject.put("track_count", jArrE[1]);
                jSONObject.put("session_id", mVarB.d());
            } catch (Exception unused) {
            }
            jSONObject.put("reason", URLEncoder.encode(str, G5.N));
            com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(str5);
            eVar.a(jSONObject);
            eVar.a(0);
            eVar.b(0);
            eVar.a(c.d());
            mVarB.d(eVar);
        } catch (Exception e10) {
            p0.b("MetricsReportUtil", e10.getMessage());
        }
    }
}
