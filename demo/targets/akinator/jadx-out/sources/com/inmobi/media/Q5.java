package com.inmobi.media;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Q5 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32160a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32161b;

    public Q5(String name, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        this.f32160a = z10;
        this.f32161b = AbstractC2811i0.a("TIM-", name);
    }

    public final boolean a() {
        return this.f32160a;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable r10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(r10, "r");
        try {
            Thread thread = new Thread(r10, this.f32161b);
            thread.setDaemon(this.f32160a);
            return thread;
        } catch (InternalError e10) {
            e10.toString();
            return null;
        }
    }

    public /* synthetic */ Q5(String str, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(str, (i10 & 2) != 0 ? false : z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Q5(String name) {
        this(name, false);
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
    }
}
