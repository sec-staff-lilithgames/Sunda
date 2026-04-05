package com.inmobi.media;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class A2 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2754eb f31615a;

    static {
        int i10 = C2754eb.f32819a;
        Q5 threadFactory = new Q5("ClickManagerExecutor", true);
        kotlin.jvm.internal.e0.checkNotNullParameter(threadFactory, "threadFactory");
        C2754eb c2754eb = new C2754eb(TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), threadFactory);
        kotlin.jvm.internal.e0.checkNotNull(c2754eb, "null cannot be cast to non-null type com.inmobi.commons.sdk.PriorityExecutor");
        f31615a = c2754eb;
    }

    public static void a(Runnable runnable, EnumC2737db enumC2737db) {
        try {
            C2754eb c2754eb = f31615a;
            c2754eb.getClass();
            kotlin.jvm.internal.e0.checkNotNull(enumC2737db);
            c2754eb.execute(new G2(runnable, enumC2737db));
        } catch (RejectedExecutionException unused) {
        }
    }
}
