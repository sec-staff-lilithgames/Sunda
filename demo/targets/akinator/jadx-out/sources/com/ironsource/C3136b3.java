package com.ironsource;

import com.ironsource.N0;
import com.ironsource.mediationsdk.logger.IronLog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.b3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3136b3 {

    /* renamed from: a, reason: collision with root package name */
    private final N0 f36019a;

    /* renamed from: b, reason: collision with root package name */
    private final H0 f36020b;

    /* renamed from: c, reason: collision with root package name */
    private final G2 f36021c;

    /* renamed from: d, reason: collision with root package name */
    private final tu.o f36022d;

    /* renamed from: e, reason: collision with root package name */
    private final tu.o f36023e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f36024f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f36025g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f36026h;

    public C3136b3(N0 loadingData, H0 interactionData, G2 mListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(loadingData, "loadingData");
        kotlin.jvm.internal.e0.checkNotNullParameter(interactionData, "interactionData");
        kotlin.jvm.internal.e0.checkNotNullParameter(mListener, "mListener");
        this.f36019a = loadingData;
        this.f36020b = interactionData;
        this.f36021c = mListener;
        this.f36022d = tu.q.lazy(new a());
        this.f36023e = tu.q.lazy(new b());
        this.f36024f = loadingData.b() > 0;
        this.f36025g = interactionData.b() > 0;
        this.f36026h = loadingData.a() == N0.a.MANUAL_WITH_LOAD_ON_SHOW;
    }

    private final C3531xb c() {
        return (C3531xb) this.f36022d.getValue();
    }

    private final C3531xb d() {
        return (C3531xb) this.f36023e.getValue();
    }

    private final void f() {
        if (this.f36026h) {
            c().b();
        }
    }

    private final void g() {
        if (this.f36026h) {
            d().b();
        }
    }

    public final void b() {
        IronLog.INTERNAL.verbose();
        g();
    }

    public final void e() {
        IronLog.INTERNAL.verbose();
        b(this.f36020b.b());
    }

    public final void h() {
        if (!this.f36024f) {
            IronLog.INTERNAL.verbose("banner reload interval is disabled");
        } else {
            IronLog.INTERNAL.verbose();
            a(this.f36019a.b());
        }
    }

    public final void a() {
        IronLog.INTERNAL.verbose();
        f();
    }

    private final void b(long j10) {
        if (this.f36026h && this.f36025g) {
            d().a(j10);
        }
    }

    private final void a(long j10) {
        if (this.f36026h && this.f36024f) {
            c().a(j10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.b3$a */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.a {
        public a() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3531xb invoke() {
            return new C3531xb(new th(C3136b3.this, 0), com.ironsource.lifecycle.b.d(), new Wf());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C3136b3 this$0) {
            kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
            this$0.f36021c.c();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.b3$b */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.a {
        public b() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3531xb invoke() {
            return new C3531xb(new th(C3136b3.this, 1), com.ironsource.lifecycle.b.d(), new Wf());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C3136b3 this$0) {
            kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
            this$0.f36021c.d();
        }
    }
}
