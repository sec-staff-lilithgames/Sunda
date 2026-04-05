package io.bidmachine.analytics.internal;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p0 {

    /* renamed from: g, reason: collision with root package name */
    public static final d f60239g = new d(null);

    /* renamed from: h, reason: collision with root package name */
    private static final p0 f60240h = new p0(a.f60247a, b.f60248a, c.f60249a);

    /* renamed from: a, reason: collision with root package name */
    private final kv.a f60241a;

    /* renamed from: b, reason: collision with root package name */
    private final kv.a f60242b;

    /* renamed from: c, reason: collision with root package name */
    private final kv.a f60243c;

    /* renamed from: d, reason: collision with root package name */
    private final tu.o f60244d = tu.q.lazy(new g());

    /* renamed from: e, reason: collision with root package name */
    private final tu.o f60245e = tu.q.lazy(new f());

    /* renamed from: f, reason: collision with root package name */
    private final tu.o f60246f = tu.q.lazy(new e());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f60247a = new a();

        public a() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return Dispatchers.getMain();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f60248a = new b();

        public b() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return Dispatchers.getIO();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f60249a = new c();

        public c() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return Dispatchers.getDefault();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {
        public /* synthetic */ d(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final p0 a() {
            return p0.f60240h;
        }

        private d() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends kotlin.jvm.internal.f0 implements kv.a {
        public e() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return (CoroutineDispatcher) p0.this.f60243c.invoke();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends kotlin.jvm.internal.f0 implements kv.a {
        public f() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return (CoroutineDispatcher) p0.this.f60242b.invoke();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends kotlin.jvm.internal.f0 implements kv.a {
        public g() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return (CoroutineDispatcher) p0.this.f60241a.invoke();
        }
    }

    public p0(kv.a aVar, kv.a aVar2, kv.a aVar3) {
        this.f60241a = aVar;
        this.f60242b = aVar2;
        this.f60243c = aVar3;
    }

    public final CoroutineDispatcher b() {
        return (CoroutineDispatcher) this.f60246f.getValue();
    }

    public final CoroutineDispatcher c() {
        return (CoroutineDispatcher) this.f60245e.getValue();
    }
}
