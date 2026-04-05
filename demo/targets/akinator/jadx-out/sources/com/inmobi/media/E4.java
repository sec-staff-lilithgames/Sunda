package com.inmobi.media;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class E4 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public static final E4 f31740a = new E4();

    public E4() {
        super(0);
    }

    @Override // kv.a
    public final Object invoke() {
        return new ScheduledThreadPoolExecutor(F4.f31769a, new Q5("ExecutorProvider.normal"));
    }
}
