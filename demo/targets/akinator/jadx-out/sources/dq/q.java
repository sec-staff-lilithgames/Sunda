package dq;

import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q {

    /* renamed from: i, reason: collision with root package name */
    public static final a f52511i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final q f52512j = new q(m.f52502e, n.f52503e, o.f52505e, p.f52508e);

    /* renamed from: a, reason: collision with root package name */
    public final kv.a f52513a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.a f52514b;

    /* renamed from: c, reason: collision with root package name */
    public final kv.a f52515c;

    /* renamed from: d, reason: collision with root package name */
    public final kv.a f52516d;

    /* renamed from: e, reason: collision with root package name */
    public final tu.o f52517e;

    /* renamed from: f, reason: collision with root package name */
    public final tu.o f52518f;

    /* renamed from: g, reason: collision with root package name */
    public final tu.o f52519g;

    /* renamed from: h, reason: collision with root package name */
    public final tu.o f52520h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final q a() {
            return q.f52512j;
        }
    }

    public q(kv.a mainProvider, kv.a mainImmediateProvider, kv.a ioProvider, kv.a defaultProvider) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mainProvider, "mainProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(mainImmediateProvider, "mainImmediateProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(ioProvider, "ioProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultProvider, "defaultProvider");
        this.f52513a = mainProvider;
        this.f52514b = mainImmediateProvider;
        this.f52515c = ioProvider;
        this.f52516d = defaultProvider;
        this.f52517e = tu.q.lazy(new t(this));
        this.f52518f = tu.q.lazy(new u(this));
        this.f52519g = tu.q.lazy(new s(this));
        this.f52520h = tu.q.lazy(new r(this));
    }

    public static final q f() {
        return f52511i.a();
    }

    public final CoroutineDispatcher e() {
        return (CoroutineDispatcher) this.f52518f.getValue();
    }

    public final CoroutineDispatcher b() {
        return (CoroutineDispatcher) this.f52520h.getValue();
    }

    public final CoroutineDispatcher c() {
        return (CoroutineDispatcher) this.f52519g.getValue();
    }

    public final CoroutineDispatcher d() {
        return (CoroutineDispatcher) this.f52517e.getValue();
    }
}
