package com.inmobi.media;

import java.lang.Thread;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.n3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2898n3 extends I3 implements Thread.UncaughtExceptionHandler {

    /* renamed from: b, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f33119b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2898n3(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, J3 listener) {
        super(listener);
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f33119b = uncaughtExceptionHandler;
    }

    @Override // com.inmobi.media.I3
    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // com.inmobi.media.I3
    public final void b() {
        Thread.setDefaultUncaughtExceptionHandler(this.f33119b);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t10, Throwable e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(t10, "t");
        kotlin.jvm.internal.e0.checkNotNullParameter(e10, "e");
        this.f31864a.a(new C2915o3(t10, e10));
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f33119b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t10, e10);
        }
    }
}
