package com.inmobi.media;

import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.le, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2875le {

    /* renamed from: a, reason: collision with root package name */
    public static final tu.o f33059a = tu.q.lazy(C2858ke.f33023a);

    public static final void a(Runnable runnable, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        ((Handler) f33059a.getValue()).postDelayed(runnable, j10);
    }

    public static final void a(Runnable runnable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        ((Handler) f33059a.getValue()).post(runnable);
    }
}
