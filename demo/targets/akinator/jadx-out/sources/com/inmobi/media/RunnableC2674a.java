package com.inmobi.media;

import android.os.Debug;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC2674a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2691b f32610a;

    public RunnableC2674a(C2691b c2691b) {
        this.f32610a = c2691b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f32610a.f32665d.get()) {
            if (this.f32610a.f32667f.hasMessages(2023)) {
                this.f32610a.f32667f.removeMessages(2023);
                this.f32610a.getClass();
                if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && this.f32610a.f32666e.get()) {
                    StackTraceElement[] stackTraceElementArrA = C2691b.a(this.f32610a);
                    J3 j32 = this.f32610a.f31864a;
                    kotlin.jvm.internal.e0.checkNotNull(stackTraceElementArrA);
                    j32.a(new Lf(stackTraceElementArrA));
                }
            }
            this.f32610a.f32666e.getAndSet(true);
            this.f32610a.f32667f.sendEmptyMessage(2023);
        }
    }
}
