package com.inmobi.media;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.qf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2961qf extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2961qf f33294a = new C2961qf();

    public C2961qf() {
        super(0);
    }

    @Override // kv.a
    public final Object invoke() {
        C2977rf c2977rf = C2977rf.f33332a;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_REFRESHFLAG, "access$getTAG$p(...)");
        return Executors.newCachedThreadPool(new Q5(ApsMetricsDataMap.APSMETRICS_FIELD_REFRESHFLAG));
    }
}
