package com.ironsource;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.qd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC3415qd {
    PER_DAY(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D),
    PER_HOUR(ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME);


    /* renamed from: a, reason: collision with root package name */
    public String f38227a;

    EnumC3415qd(String str) {
        this.f38227a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38227a;
    }
}
