package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class S implements InterfaceC3348mg {

    /* renamed from: a, reason: collision with root package name */
    private final String f35429a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3321l9 f35430b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35431c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35432a = new a();

        public a() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3559z5.f39348a.r();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f35433a = new b();

        public b() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3559z5.f39348a.o();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f35434a = new c();

        public c() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3559z5.f39348a.n();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f35435a = new d();

        public d() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3559z5.f39348a.q();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f35436a = new e();

        public e() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3559z5.f39348a.o();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f35437a = new f();

        public f() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3559z5.f39348a.g();
        }
    }

    public S(String adm, InterfaceC3321l9 interfaceC3321l9, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adm, "adm");
        this.f35429a = adm;
        this.f35430b = interfaceC3321l9;
        this.f35431c = z10;
    }

    @Override // com.ironsource.InterfaceC3348mg
    public void a() throws C3399pe {
        a(this.f35431c, a.f35432a);
        a(this.f35430b != null, b.f35433a);
        InterfaceC3321l9 interfaceC3321l9 = this.f35430b;
        if (interfaceC3321l9 != null) {
            if (interfaceC3321l9.f() == EnumC3359n9.NonBidder) {
                a(this.f35429a.length() == 0, c.f35434a);
            }
            if (interfaceC3321l9.f() == EnumC3359n9.Bidder) {
                a(this.f35429a.length() > 0, d.f35435a);
            }
            a(interfaceC3321l9.f() != EnumC3359n9.NotSupported, e.f35436a);
            a(interfaceC3321l9.e().length() > 0, f.f35437a);
        }
    }
}
