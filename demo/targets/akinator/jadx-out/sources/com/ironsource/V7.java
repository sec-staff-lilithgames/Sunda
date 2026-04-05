package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class V7 implements Tf {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f35635c;

    /* renamed from: e, reason: collision with root package name */
    private static final T9 f35637e;

    /* renamed from: f, reason: collision with root package name */
    private static final T9 f35638f;

    /* renamed from: g, reason: collision with root package name */
    private static final T9 f35639g;

    /* renamed from: a, reason: collision with root package name */
    public static final V7 f35633a = new V7();

    /* renamed from: b, reason: collision with root package name */
    private static final Handler f35634b = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    private static final tu.o f35636d = tu.q.lazy(a.f35640a);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35640a = new a();

        public a() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3290je invoke() {
            return new C3290je(0, null, null, 7, null);
        }
    }

    static {
        T9 t92 = new T9("isadplayer-background");
        t92.start();
        t92.a();
        f35637e = t92;
        T9 t93 = new T9("isadplayer-publisher-callbacks");
        t93.start();
        t93.a();
        f35638f = t93;
        T9 t94 = new T9("isadplayer-release");
        t94.start();
        t94.a();
        f35639g = t94;
    }

    private V7() {
    }

    private final boolean f(Runnable runnable) {
        return f35635c && b().getQueue().contains(runnable);
    }

    public final void a(boolean z10) {
        f35635c = z10;
    }

    public final void b(Runnable action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        a(this, action, 0L, 2, (Object) null);
    }

    public final void c(Runnable action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        b(this, action, 0L, 2, null);
    }

    public final void d(Runnable action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final void e(Runnable action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        if (f(action)) {
            b().remove(action);
        } else {
            f35639g.b(action);
        }
    }

    private final C3290je b() {
        return (C3290je) f35636d.getValue();
    }

    public static /* synthetic */ void c(V7 v72, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        v72.d(runnable, j10);
    }

    @Override // com.ironsource.Tf
    public void a(Runnable action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final boolean d() {
        return f35635c;
    }

    public static /* synthetic */ void a(V7 v72, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        v72.b(runnable, j10);
    }

    public final void b(Runnable action, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        f35637e.a(action, j10);
    }

    public final void c(Runnable action, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        f35638f.a(action, j10);
    }

    public final void d(Runnable action, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        f35634b.postDelayed(action, j10);
    }

    public static /* synthetic */ void b(V7 v72, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        v72.c(runnable, j10);
    }

    @Override // com.ironsource.Tf
    public void a(Runnable action, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        if (f35635c) {
            b().schedule(action, j10, TimeUnit.MILLISECONDS);
        } else {
            f35639g.a(action, j10);
        }
    }

    public final ThreadPoolExecutor c() {
        return b();
    }

    public final Looper a() {
        return f35637e.getLooper();
    }
}
