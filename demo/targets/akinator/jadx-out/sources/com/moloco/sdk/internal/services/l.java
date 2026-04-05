package com.moloco.sdk.internal.services;

import androidx.lifecycle.b1;
import com.moloco.sdk.internal.MolocoLogger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class l implements androidx.lifecycle.r {

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.analytics.a f47158b;

    /* renamed from: c, reason: collision with root package name */
    public final i f47159c;

    /* renamed from: e, reason: collision with root package name */
    public Long f47160e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f47161f;

    public l(com.moloco.sdk.internal.services.analytics.a analyticsService, i timeProviderService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(analyticsService, "analyticsService");
        kotlin.jvm.internal.e0.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f47158b = analyticsService;
        this.f47159c = timeProviderService;
    }

    public final void a() {
        this.f47161f = true;
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onCreate(b1 b1Var) {
        super.onCreate(b1Var);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onDestroy(b1 b1Var) {
        super.onDestroy(b1Var);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onPause(b1 b1Var) {
        super.onPause(b1Var);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onResume(b1 b1Var) {
        super.onResume(b1Var);
    }

    @Override // androidx.lifecycle.r
    public void onStart(b1 owner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Application onStart", false, 4, null);
        Long l9 = this.f47160e;
        if (l9 != null) {
            MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Background event has been recorded, recording foreground", false, 4, null);
            this.f47158b.a(this.f47159c.invoke(), l9.longValue());
            this.f47160e = null;
            this.f47161f = false;
        }
    }

    @Override // androidx.lifecycle.r
    public void onStop(b1 owner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Application onStop", false, 4, null);
        if (this.f47161f) {
            MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Tracking of event is true. Recording background", false, 4, null);
            long jInvoke = this.f47159c.invoke();
            this.f47160e = Long.valueOf(jInvoke);
            this.f47158b.a(jInvoke);
        }
    }
}
