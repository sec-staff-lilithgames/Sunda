package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.CrashConfig;
import com.ironsource.C3191e4;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Y5 implements P2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Y5 f32563a;

    /* renamed from: b, reason: collision with root package name */
    public static final CrashConfig f32564b;

    /* renamed from: c, reason: collision with root package name */
    public static final J3 f32565c;

    /* renamed from: d, reason: collision with root package name */
    public static final K6 f32566d;

    static {
        Y5 y52 = new Y5();
        f32563a = y52;
        LinkedHashMap linkedHashMap = Q2.f32149a;
        Config configA = O2.a("crashReporting", C2925od.b(), y52);
        kotlin.jvm.internal.e0.checkNotNull(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.CrashConfig");
        CrashConfig crashConfig = (CrashConfig) configA;
        f32564b = crashConfig;
        long jCurrentTimeMillis = System.currentTimeMillis();
        f32566d = new K6(crashConfig);
        Context contextD = C2925od.d();
        if (contextD != null) {
            f32565c = new J3(contextD, crashConfig, C2925od.f());
        }
        if (crashConfig.getCrashConfig().getReportSessionInfo()) {
            C2949q3 type = C2949q3.f33279d;
            kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
            I6 i6A = AbstractC2698b6.a();
            if (i6A != null) {
                i6A.a(type.f33352a, jCurrentTimeMillis, true);
            }
            I6 i6A2 = AbstractC2698b6.a();
            if (i6A2 != null) {
                I6.a(i6A2, "s-cnt", 0, false, 4, (Object) null);
            }
        }
        if (AbstractC2922oa.f33204a.getCrashConfig().getReportOOMInfo()) {
            for (AbstractC2982s3 type2 : uu.p0.listOf((Object[]) new AbstractC2982s3[]{C2965r3.f33301d, C2932p3.f33246d})) {
                kotlin.jvm.internal.e0.checkNotNullParameter(type2, "type");
                I6 i6A3 = AbstractC2698b6.a();
                if (i6A3 != null) {
                    i6A3.a(type2.f33352a, jCurrentTimeMillis, true);
                }
            }
        }
    }

    public static void a(JSONObject payload, boolean z10, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(payload, "payload");
        if (f32564b.getCrashConfig().getReportSessionInfo() && z10) {
            C2949q3 crashType = C2949q3.f33279d;
            kotlin.jvm.internal.e0.checkNotNullParameter(crashType, "crashType");
            I6 i6A = AbstractC2698b6.a();
            if (i6A != null) {
                String key = crashType.f33352a;
                kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
                long j11 = i6A.f31866a.getLong(key, 0L);
                String str = crashType.f33353b;
                if (j11 == 0) {
                    i6A.a(str, j10, true);
                } else {
                    i6A.a(str, j10 - j11, true);
                }
            }
            payload.put("crashFreeSessionLength", AbstractC2698b6.a(crashType));
            I6 i6A2 = AbstractC2698b6.a();
            int i10 = 0;
            if (i6A2 != null) {
                kotlin.jvm.internal.e0.checkNotNullParameter("s-cnt", C3191e4.h.W);
                i10 = i6A2.f31866a.getInt("s-cnt", 0);
            }
            payload.put("crashFreeSessionCount", i10);
        }
    }

    public final void a() {
        I6 i6A;
        if (f32564b.getCrashConfig().getReportSessionInfo() && (i6A = AbstractC2698b6.a()) != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter("s-cnt", C3191e4.h.W);
            I6.a(i6A, "s-cnt", i6A.f31866a.getInt("s-cnt", 0) + 1, false, 4, (Object) null);
        }
        J3 j32 = f32565c;
        if (j32 != null) {
            Iterator it = j32.f31901c.iterator();
            while (it.hasNext()) {
                ((I3) it.next()).a();
            }
        }
        f32566d.c();
    }

    @Override // com.inmobi.media.P2
    public final void a(Config config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        if (config instanceof CrashConfig) {
            K6 k62 = f32566d;
            CrashConfig crashConfig = (CrashConfig) config;
            k62.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(crashConfig, "crashConfig");
            k62.f31944a = crashConfig;
            C2681a6 c2681a6 = k62.f31946c;
            c2681a6.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(crashConfig, "config");
            c2681a6.f32643a.f32981a = crashConfig.getCrashConfig().getSamplingPercent();
            c2681a6.f32644b.f32981a = crashConfig.getCatchConfig().getSamplingPercent();
            c2681a6.f32645c.f32981a = crashConfig.getANRConfig().getWatchdog().getSamplingPercent();
            c2681a6.f32646d.f32981a = crashConfig.getANRConfig().getAppExitReason().getSamplingPercent();
            C3102z4 c3102z4 = k62.f31945b;
            if (c3102z4 != null) {
                C3051w4 eventConfig = crashConfig.getEventConfig();
                kotlin.jvm.internal.e0.checkNotNullParameter(eventConfig, "eventConfig");
                c3102z4.f33694i = eventConfig;
            }
            J3 j32 = f32565c;
            if (j32 != null) {
                kotlin.jvm.internal.e0.checkNotNullParameter(crashConfig, "crashConfig");
                j32.f31899a = crashConfig;
            }
        }
    }
}
