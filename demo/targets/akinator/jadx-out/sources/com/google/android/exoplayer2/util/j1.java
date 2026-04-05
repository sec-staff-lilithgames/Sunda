package com.google.android.exoplayer2.util;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class j1 implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28471b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28472c;

    public /* synthetic */ j1(String str, int i10) {
        this.f28471b = i10;
        this.f28472c = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f28471b) {
            case 0:
                return new Thread(runnable, this.f28472c);
            case 1:
                return new Thread(runnable, this.f28472c);
            case 2:
                return io.odeeo.internal.q0.g0.a(this.f28472c, runnable);
            case 3:
                return new Thread(runnable, this.f28472c);
            case 4:
                return new Thread(runnable, this.f28472c);
            default:
                Thread thread = new Thread(runnable, this.f28472c);
                thread.setPriority(10);
                return thread;
        }
    }
}
