package com.inmobi.media;

import android.os.Debug;
import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.oa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2922oa {

    /* renamed from: a, reason: collision with root package name */
    public static final CrashConfig f33204a;

    static {
        LinkedHashMap linkedHashMap = Q2.f32149a;
        f33204a = (CrashConfig) AbstractC3035v5.a("crashReporting", "null cannot be cast to non-null type com.inmobi.commons.core.configs.CrashConfig", null);
        System.currentTimeMillis();
    }

    public static void a(JSONObject payload, boolean z10, boolean z11, long j10) {
        int i10;
        int i11;
        long[] jArr;
        kotlin.jvm.internal.e0.checkNotNullParameter(payload, "payload");
        if (f33204a.getCrashConfig().getReportOOMInfo() && z10) {
            AbstractC2982s3 crashType = z11 ? C2965r3.f33301d : C2932p3.f33246d;
            kotlin.jvm.internal.e0.checkNotNullParameter(crashType, "type");
            I6 i6A = AbstractC2698b6.a();
            if (i6A != null) {
                String key = crashType.f33354c;
                kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
                i6A.a(crashType.f33354c, i6A.f31866a.getInt(key, 0) + 1, true);
            }
            kotlin.jvm.internal.e0.checkNotNullParameter(crashType, "crashType");
            I6 i6A2 = AbstractC2698b6.a();
            if (i6A2 != null) {
                String key2 = crashType.f33352a;
                kotlin.jvm.internal.e0.checkNotNullParameter(key2, "key");
                long j11 = i6A2.f31866a.getLong(key2, 0L);
                String str = crashType.f33353b;
                if (j11 == 0) {
                    i6A2.a(str, j10, true);
                } else {
                    i6A2.a(str, j10 - j11, true);
                }
            }
            if (z11) {
                C2965r3 type = C2965r3.f33301d;
                kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
                I6 i6A3 = AbstractC2698b6.a();
                if (i6A3 != null) {
                    String key3 = type.f33354c;
                    kotlin.jvm.internal.e0.checkNotNullParameter(key3, "key");
                    i10 = i6A3.f31866a.getInt(key3, 0);
                } else {
                    i10 = 0;
                }
                C2932p3 type2 = C2932p3.f33246d;
                kotlin.jvm.internal.e0.checkNotNullParameter(type2, "type");
                I6 i6A4 = AbstractC2698b6.a();
                if (i6A4 != null) {
                    String key4 = type2.f33354c;
                    kotlin.jvm.internal.e0.checkNotNullParameter(key4, "key");
                    i11 = i6A4.f31866a.getInt(key4, 0);
                } else {
                    i11 = 0;
                }
                int i12 = i10 + i11;
                float f10 = i12 > 0 ? (i10 * 100.0f) / i12 : 0.0f;
                payload.put("inmobiOOMCount", i10);
                payload.put("appOOMCount", i11);
                payload.put(OcvDtWCQ.YZzxYvXWc, AbstractC2698b6.a(type2));
                payload.put("inmOOMCrashInterval", AbstractC2698b6.a(type));
                payload.put("oomRatioInMobiToApp", Float.valueOf(f10));
                if (R3.f32183a.R()) {
                    long jLongValue = 0;
                    long jLongValue2 = 0;
                    for (Map.Entry<String, String> entry : Debug.getRuntimeStats().entrySet()) {
                        String key5 = entry.getKey();
                        String value = entry.getValue();
                        if (kotlin.jvm.internal.e0.areEqual(key5, "art.gc.blocking-gc-count")) {
                            kotlin.jvm.internal.e0.checkNotNull(value);
                            Long longOrNull = sv.j0.toLongOrNull(value);
                            jLongValue = longOrNull != null ? longOrNull.longValue() : 0L;
                        } else if (kotlin.jvm.internal.e0.areEqual(key5, "art.gc.gc-count")) {
                            kotlin.jvm.internal.e0.checkNotNull(value);
                            Long longOrNull2 = sv.j0.toLongOrNull(value);
                            jLongValue2 = longOrNull2 != null ? longOrNull2.longValue() : 0L;
                        }
                    }
                    jArr = new long[]{jLongValue, jLongValue2};
                } else {
                    jArr = null;
                }
                if (jArr != null) {
                    payload.put("blockingGcCount", jArr[0]);
                    payload.put("gcCount", jArr[1]);
                }
            }
        }
    }
}
