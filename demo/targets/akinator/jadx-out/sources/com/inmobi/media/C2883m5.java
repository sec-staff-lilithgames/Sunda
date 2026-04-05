package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.m5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2883m5 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f33080a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f33081b;

    /* renamed from: c, reason: collision with root package name */
    public final Kf f33082c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33083d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f33084e;

    /* renamed from: f, reason: collision with root package name */
    public final RunnableC2866l5 f33085f;

    /* renamed from: g, reason: collision with root package name */
    public final long f33086g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC2832j5 f33087h;

    public C2883m5(AdConfig.ViewabilityConfig viewabilityConfig, Kf visibilityTracker, InterfaceC2832j5 listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(viewabilityConfig, "viewabilityConfig");
        kotlin.jvm.internal.e0.checkNotNullParameter(visibilityTracker, "visibilityTracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.f33080a = weakHashMap;
        this.f33081b = weakHashMap2;
        this.f33082c = visibilityTracker;
        this.f33083d = "m5";
        this.f33086g = viewabilityConfig.getImpressionPollIntervalMillis();
        C2816i5 c2816i5 = new C2816i5(this);
        F5 f52 = visibilityTracker.f31971e;
        if (f52 != null) {
            ((G5) f52).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        visibilityTracker.f31976j = c2816i5;
        this.f33084e = handler;
        this.f33085f = new RunnableC2866l5(this);
        this.f33087h = listener;
    }

    public final void a(View view, Object token, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(token, "token");
        C2849k5 c2849k5 = (C2849k5) this.f33080a.get(view);
        if (kotlin.jvm.internal.e0.areEqual(c2849k5 != null ? c2849k5.f33007a : null, token)) {
            return;
        }
        a(view);
        this.f33080a.put(view, new C2849k5(token, i10, i11));
        this.f33082c.a(view, token, i10);
    }

    public final void a(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        this.f33080a.remove(view);
        this.f33081b.remove(view);
        this.f33082c.a(view);
    }
}
