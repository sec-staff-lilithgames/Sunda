package com.inmobi.media;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class C4 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4 f31707a = new C4();

    public C4() {
        super(0);
    }

    @Override // kv.a
    public final Object invoke() {
        int i10 = F4.f31769a;
        return new ScheduledThreadPoolExecutor(5, new Q5("ExecutorProvider.high"));
    }
}
