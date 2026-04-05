package com.inmobi.media;

import android.net.ConnectivityManager;
import android.net.Network;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.he, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2808he extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        kotlin.jvm.internal.e0.checkNotNullParameter(network, "network");
        ConcurrentHashMap concurrentHashMap = C2825ie.f32935a;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_IMPRESSIONEVENT, "access$getTAG$p(...)");
        super.onAvailable(network);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_IMPRESSIONEVENT, "access$getTAG$p(...)");
        C2925od.f().b(new C2762f2(10, 4, "available"));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        kotlin.jvm.internal.e0.checkNotNullParameter(network, "network");
        ConcurrentHashMap concurrentHashMap = C2825ie.f32935a;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_IMPRESSIONEVENT, "access$getTAG$p(...)");
        super.onLost(network);
        C2925od.f().b(new C2762f2(10, 4, "lost"));
    }
}
