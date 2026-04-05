package com.ironsource;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.xf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3535xf {

    /* renamed from: a, reason: collision with root package name */
    public static final C3535xf f39230a = new C3535xf();

    /* renamed from: b, reason: collision with root package name */
    private static final tu.o f39231b = tu.q.lazy(a.f39232a);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.xf$a */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f39232a = new a();

        public a() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3290je invoke() {
            return new C3290je(16, null, null, 6, null);
        }
    }

    private C3535xf() {
    }

    public final void a(Runnable action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        a(this, action, 0L, 2, null);
    }

    private final C3290je a() {
        return (C3290je) f39231b.getValue();
    }

    public static /* synthetic */ void a(C3535xf c3535xf, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c3535xf.a(runnable, j10);
    }

    public final void a(Runnable action, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        a().schedule(action, j10, TimeUnit.MILLISECONDS);
    }
}
