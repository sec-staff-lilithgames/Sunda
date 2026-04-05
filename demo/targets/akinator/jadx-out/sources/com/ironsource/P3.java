package com.ironsource;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum P3 {
    Day(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, 86400000),
    Hour(ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME, 3600000),
    Second(ApsMetricsDataMap.APSMETRICS_FIELD_SDK, 1000);


    /* renamed from: c, reason: collision with root package name */
    public static final a f35168c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f35173a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35174b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final P3 a(String str) {
            for (P3 p32 : P3.values()) {
                if (kotlin.jvm.internal.e0.areEqual(p32.f35173a, str)) {
                    return p32;
                }
            }
            return null;
        }

        private a() {
        }
    }

    P3(String str, long j10) {
        this.f35173a = str;
        this.f35174b = j10;
    }

    public final long a(Integer num) {
        return (num != null ? num.intValue() : 1) * this.f35174b;
    }

    public static /* synthetic */ long a(P3 p32, Integer num, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inMilliseconds");
        }
        if ((i10 & 1) != 0) {
            num = 1;
        }
        return p32.a(num);
    }
}
