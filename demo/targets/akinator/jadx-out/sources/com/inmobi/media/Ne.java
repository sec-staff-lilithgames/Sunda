package com.inmobi.media;

import android.util.Base64;
import com.amazon.device.ads.DTBMetricReport;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.RootConfig;
import com.inmobi.media.Ne;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Ne {
    public static String a(Map map, String str) {
        HashMap map2;
        G5 g5A = Wb.a("getToken", "AB", false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (map != null) {
            C2942pd.a((String) map.get("tp"));
            C2942pd.b((String) map.get("tp-v"));
        }
        a();
        if (!C2925od.q()) {
            if (g5A != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("com.inmobi.media.Ne", "LOG_TAG");
                g5A.b("com.inmobi.media.Ne", "InMobi SDK is not initialised. Cannot fetch a token.");
            }
            a(90, jCurrentTimeMillis, g5A);
            return null;
        }
        LinkedHashMap linkedHashMap = Q2.f32149a;
        RootConfig rootConfig = (RootConfig) AbstractC3035v5.a("root", "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig", null);
        if (rootConfig.isMonetizationDisabled()) {
            a(2012, jCurrentTimeMillis, g5A);
            if (g5A != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("com.inmobi.media.Ne", "LOG_TAG");
                g5A.b("com.inmobi.media.Ne", "Monetization disabled. cannot provide token");
            }
            return null;
        }
        AdConfig adConfig = (AdConfig) AbstractC3035v5.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null);
        Oe oe2 = new Oe(new Te(adConfig.getIncludeIdParams()), g5A, rootConfig, adConfig);
        oe2.C = map;
        oe2.B = str;
        HashMap mapHashMapOf = uu.p1.hashMapOf(tu.e0.to("h-user-agent", C2925od.k()));
        if (mapHashMapOf != null && (map2 = oe2.f32502k) != null) {
            map2.putAll(mapHashMapOf);
        }
        oe2.f();
        if (!oe2.f32495d) {
            if (g5A != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("com.inmobi.media.Ne", "LOG_TAG");
                g5A.b("com.inmobi.media.Ne", "get Signals failed - GDPR Compliance");
            }
            a(2141, jCurrentTimeMillis, g5A);
            return null;
        }
        a(jCurrentTimeMillis, g5A);
        if (g5A != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("com.inmobi.media.Ne", "LOG_TAG");
            g5A.a("com.inmobi.media.Ne", "get signals success");
        }
        String strC = oe2.c();
        Charset charset = sv.g.f86134b;
        byte[] bytes = strC.getBytes(charset);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrEncode = Base64.encode(bytes, 8);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bArrEncode, "encode(...)");
        return new String(bArrEncode, charset);
    }

    public static final void b() {
        HashMap mapHashMapOf = uu.p1.hashMapOf(tu.e0.to("networkType", R3.x()), tu.e0.to("plType", "AB"));
        C2926oe c2926oe = C2926oe.f33217a;
        C2926oe.b("AdGetSignalsCalled", mapHashMapOf, EnumC2993se.f33373a);
    }

    public static void a(final int i10, final long j10, G5 g52) {
        if (g52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("com.inmobi.media.Ne", "LOG_TAG");
            g52.c("com.inmobi.media.Ne", "submitAdGetSignalsFailed - errorCode - " + i10 + ", startTime - " + j10);
        }
        C2925od.a(new Runnable() { // from class: zk.u
            @Override // java.lang.Runnable
            public final void run() {
                Ne.a(j10, i10);
            }
        });
        if (g52 != null) {
            g52.a();
        }
    }

    public static final void a(long j10, int i10) {
        HashMap mapHashMapOf = uu.p1.hashMapOf(tu.e0.to(DTBMetricReport.LATENCY, Long.valueOf(System.currentTimeMillis() - j10)), tu.e0.to("networkType", R3.x()), tu.e0.to(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)), tu.e0.to("plType", "AB"));
        C2926oe c2926oe = C2926oe.f33217a;
        C2926oe.b("AdGetSignalsFailed", mapHashMapOf, EnumC2993se.f33373a);
    }

    public static void a(final long j10, G5 g52) {
        if (g52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("com.inmobi.media.Ne", "LOG_TAG");
            g52.c("com.inmobi.media.Ne", "submitAdGetSignalsSucceeded - startTime - " + j10);
        }
        C2925od.a(new Runnable() { // from class: zk.t
            @Override // java.lang.Runnable
            public final void run() {
                Ne.a(j10);
            }
        });
        if (g52 != null) {
            g52.a();
        }
    }

    public static final void a(long j10) {
        HashMap mapHashMapOf = uu.p1.hashMapOf(tu.e0.to(DTBMetricReport.LATENCY, Long.valueOf(System.currentTimeMillis() - j10)), tu.e0.to("networkType", R3.x()), tu.e0.to("plType", "AB"));
        C2926oe c2926oe = C2926oe.f33217a;
        C2926oe.b("AdGetSignalsSucceeded", mapHashMapOf, EnumC2993se.f33373a);
    }

    public static void a() {
        C2925od.a(new al.b(14));
    }
}
