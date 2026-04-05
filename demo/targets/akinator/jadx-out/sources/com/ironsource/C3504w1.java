package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.w1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3504w1 extends AbstractC3236gd {

    /* renamed from: f, reason: collision with root package name */
    public static final a f39150f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final String f39151g = "AppLifecycleTrigger";

    /* renamed from: d, reason: collision with root package name */
    private final com.ironsource.lifecycle.b f39152d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3304ka f39153e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.w1$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3504w1(com.ironsource.lifecycle.b lifeCycleObserver) {
        super(false, 1, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(lifeCycleObserver, "lifeCycleObserver");
        this.f39152d = lifeCycleObserver;
        b bVar = new b();
        this.f39153e = bVar;
        lifeCycleObserver.a(bVar);
        a(lifeCycleObserver.e());
    }

    @Override // com.ironsource.AbstractC3236gd
    public String b() {
        return f39151g;
    }

    public final void e() {
        this.f39152d.b(this.f39153e);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.w1$b */
    public static final class b implements InterfaceC3304ka {
        public b() {
        }

        @Override // com.ironsource.InterfaceC3304ka
        public void c() {
            C3504w1.this.a(false);
        }

        @Override // com.ironsource.InterfaceC3304ka
        public void d() {
            C3504w1.this.a(true);
        }

        @Override // com.ironsource.InterfaceC3304ka
        public void a() {
        }

        @Override // com.ironsource.InterfaceC3304ka
        public void b() {
        }
    }
}
