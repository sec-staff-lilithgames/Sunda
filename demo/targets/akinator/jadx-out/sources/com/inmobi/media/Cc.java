package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Cc {

    /* renamed from: a, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC3093yc f31712a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31713b;

    public Cc(GestureDetectorOnGestureListenerC3093yc view, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        this.f31712a = view;
        this.f31713b = j10;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).postDelayed(new zg.h(this, 2), this.f31713b);
    }

    public static final void a(Cc this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this$0.f31712a;
        if (gestureDetectorOnGestureListenerC3093yc != null) {
            gestureDetectorOnGestureListenerC3093yc.g();
        }
        this$0.f31712a = null;
    }
}
