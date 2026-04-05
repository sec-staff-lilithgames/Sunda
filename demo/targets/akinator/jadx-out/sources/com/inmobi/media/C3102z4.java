package com.inmobi.media;

import android.content.Context;
import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.z4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3102z4 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3068x4 f33686a;

    /* renamed from: b, reason: collision with root package name */
    public final Fa f33687b;

    /* renamed from: c, reason: collision with root package name */
    public final Xb f33688c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33689d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f33690e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f33691f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedList f33692g;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledExecutorService f33693h;

    /* renamed from: i, reason: collision with root package name */
    public C3051w4 f33694i;

    public C3102z4(AbstractC3068x4 mEventDao, Fa mPayloadProvider, C3051w4 eventConfig, Xb xb2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mEventDao, "mEventDao");
        kotlin.jvm.internal.e0.checkNotNullParameter(mPayloadProvider, "mPayloadProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(eventConfig, "eventConfig");
        this.f33686a = mEventDao;
        this.f33687b = mPayloadProvider;
        this.f33688c = xb2;
        this.f33689d = "z4";
        this.f33690e = new AtomicBoolean(false);
        this.f33691f = new AtomicBoolean(false);
        this.f33692g = new LinkedList();
        this.f33694i = eventConfig;
    }

    public final void a(long j10, boolean z10) {
        if (this.f33692g.contains(BuildConfig.FLAVOR)) {
            return;
        }
        this.f33692g.add(BuildConfig.FLAVOR);
        if (this.f33693h == null) {
            String TAG = this.f33689d;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            this.f33693h = Executors.newSingleThreadScheduledExecutor(new Q5(TAG));
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(this.f33689d, "TAG");
        ScheduledExecutorService scheduledExecutorService = this.f33693h;
        if (scheduledExecutorService != null) {
            com.applovin.impl.k9 k9Var = new com.applovin.impl.k9(this, z10, 14);
            C3051w4 c3051w4 = this.f33694i;
            AbstractC3068x4 abstractC3068x4 = this.f33686a;
            abstractC3068x4.getClass();
            Context contextD = C2925od.d();
            long j11 = -1;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                I6 i6A = H6.a(contextD, "batch_processing_info");
                String key = abstractC3068x4.f32382a.concat("_last_batch_process");
                kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
                j11 = i6A.f31866a.getLong(key, -1L);
            }
            if (((int) j11) == -1) {
                this.f33686a.a(System.currentTimeMillis());
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            scheduledExecutorService.scheduleAtFixedRate(k9Var, Math.max(0L, (timeUnit.toSeconds(j11) + (c3051w4 != null ? c3051w4.f33523c : 0L)) - timeUnit.toSeconds(System.currentTimeMillis())), j10, TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.inmobi.media.C3102z4 r17, com.inmobi.media.Te r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3102z4.a(com.inmobi.media.z4, com.inmobi.media.Te, boolean):void");
    }

    public final void a(C3085y4 eventPayload, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventPayload, "eventPayload");
        String TAG = this.f33689d;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
        eventPayload.getClass();
        this.f33686a.a(System.currentTimeMillis());
        if (this.f33688c != null) {
            ArrayList eventIds = eventPayload.f33597a;
            kotlin.jvm.internal.e0.checkNotNullParameter(eventIds, "eventIds");
            Integer num = AbstractC3010te.f33404c;
            if (num != null && eventIds.contains(Integer.valueOf(num.intValue()))) {
                AbstractC3010te.f33404c = null;
            }
        }
        this.f33690e.set(false);
    }
}
