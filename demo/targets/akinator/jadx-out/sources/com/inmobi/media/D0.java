package com.inmobi.media;

import android.os.SystemClock;
import com.amazon.device.ads.DTBMetricReport;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f31721a;

    /* renamed from: b, reason: collision with root package name */
    public final U0 f31722b;

    /* renamed from: c, reason: collision with root package name */
    public final C2675a0 f31723c;

    /* renamed from: d, reason: collision with root package name */
    public final String f31724d;

    /* renamed from: e, reason: collision with root package name */
    public long f31725e;

    /* renamed from: f, reason: collision with root package name */
    public F5 f31726f;

    /* renamed from: g, reason: collision with root package name */
    public final C0 f31727g;

    /* renamed from: h, reason: collision with root package name */
    public final B0 f31728h;

    public D0(U0 mAdStoreListener, U0 mTelemetryListener, C2675a0 mAdPlacement) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mAdStoreListener, "mAdStoreListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(mTelemetryListener, "mTelemetryListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(mAdPlacement, "mAdPlacement");
        this.f31721a = mAdStoreListener;
        this.f31722b = mTelemetryListener;
        this.f31723c = mAdPlacement;
        this.f31724d = "D0";
        this.f31727g = new C0(this);
        this.f31728h = new B0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.inmobi.media.A0 a(com.inmobi.media.U r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.D0.a(com.inmobi.media.U, java.lang.Integer):com.inmobi.media.A0");
    }

    public static String a() throws JSONException {
        String strB = C2925od.b();
        if (strB == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        LinkedHashMap linkedHashMap = Q2.f32149a;
        jSONObject.put("root", O2.a("root", strB, null).getLastUpdateTimeStamp());
        jSONObject.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, O2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, strB, null).getLastUpdateTimeStamp());
        jSONObject.put("telemetry", O2.a("telemetry", strB, null).getLastUpdateTimeStamp());
        jSONObject.put("crashReporting", O2.a("crashReporting", strB, null).getLastUpdateTimeStamp());
        jSONObject.put("signals", O2.a("signals", strB, null).getLastUpdateTimeStamp());
        return jSONObject.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d3 A[Catch: JSONException -> 0x02fb, TryCatch #3 {JSONException -> 0x02fb, blocks: (B:121:0x02cc, B:124:0x02d3, B:126:0x02e4, B:129:0x02fd, B:131:0x0301), top: B:202:0x02cc }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0328 A[Catch: JSONException -> 0x0335, TryCatch #0 {JSONException -> 0x0335, blocks: (B:140:0x0324, B:142:0x0328, B:145:0x0338, B:147:0x0346, B:149:0x034a, B:150:0x0356, B:152:0x035e, B:156:0x0389, B:158:0x038d, B:159:0x0399, B:160:0x03bb, B:161:0x03bc, B:163:0x03c0, B:164:0x03d6, B:166:0x0411, B:167:0x0416, B:169:0x041e, B:170:0x0423, B:171:0x0437), top: B:198:0x0324 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0346 A[Catch: JSONException -> 0x0335, TryCatch #0 {JSONException -> 0x0335, blocks: (B:140:0x0324, B:142:0x0328, B:145:0x0338, B:147:0x0346, B:149:0x034a, B:150:0x0356, B:152:0x035e, B:156:0x0389, B:158:0x038d, B:159:0x0399, B:160:0x03bb, B:161:0x03bc, B:163:0x03c0, B:164:0x03d6, B:166:0x0411, B:167:0x0416, B:169:0x041e, B:170:0x0423, B:171:0x0437), top: B:198:0x0324 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03bc A[Catch: JSONException -> 0x0335, TryCatch #0 {JSONException -> 0x0335, blocks: (B:140:0x0324, B:142:0x0328, B:145:0x0338, B:147:0x0346, B:149:0x034a, B:150:0x0356, B:152:0x035e, B:156:0x0389, B:158:0x038d, B:159:0x0399, B:160:0x03bb, B:161:0x03bc, B:163:0x03c0, B:164:0x03d6, B:166:0x0411, B:167:0x0416, B:169:0x041e, B:170:0x0423, B:171:0x0437), top: B:198:0x0324 }] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.inmobi.media.A0 a(org.json.JSONObject r28) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.D0.a(org.json.JSONObject):com.inmobi.media.A0");
    }

    public final void a(Boolean bool) {
        Map<String, Object> mapMutableMapOf = uu.p1.mutableMapOf(tu.e0.to(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - this.f31725e)), tu.e0.to("networkType", R3.x()), tu.e0.to("plId", Long.valueOf(this.f31723c.l())));
        String strM = this.f31723c.m();
        if (strM != null) {
            mapMutableMapOf.put("plType", strM);
        }
        if (bool != null) {
            mapMutableMapOf.put("isRewarded", bool);
        }
        String strB = this.f31723c.b();
        if (strB != null) {
            mapMutableMapOf.put("adType", strB);
        }
        this.f31722b.b("ServerFill", mapMutableMapOf);
    }

    public final void a(Map payload) {
        kotlin.jvm.internal.e0.checkNotNullParameter(payload, "payload");
        payload.put(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - this.f31725e));
        String strB = this.f31723c.b();
        if (strB != null) {
            payload.put("adType", strB);
        }
        payload.put("networkType", R3.x());
        payload.put("plId", Long.valueOf(this.f31723c.l()));
        String strM = this.f31723c.m();
        if (strM != null) {
            payload.put("plType", strM);
        }
        this.f31722b.b("ServerError", (Map<String, Object>) payload);
    }
}
