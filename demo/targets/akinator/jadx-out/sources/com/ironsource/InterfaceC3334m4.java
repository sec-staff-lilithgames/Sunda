package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.m4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC3334m4 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.m4$a */
    public static final class a implements InterfaceC3334m4 {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f37208a;

        public a(boolean z10) {
            this.f37208a = z10;
        }

        @Override // com.ironsource.InterfaceC3334m4
        public void a() {
            A8.a(C3219fe.f36721x, new C3494v8().a(G5.f34451y, Boolean.valueOf(this.f37208a)).a());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.m4$b */
    public static final class b implements InterfaceC3334m4 {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f37209a;

        /* renamed from: b, reason: collision with root package name */
        private final long f37210b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3456t4 f37211c;

        public b(boolean z10, long j10, InterfaceC3456t4 currentTimeProvider) {
            kotlin.jvm.internal.e0.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            this.f37209a = z10;
            this.f37210b = j10;
            this.f37211c = currentTimeProvider;
        }

        @Override // com.ironsource.InterfaceC3334m4
        public void a() {
            C3494v8 c3494v8A = new C3494v8().a(G5.f34451y, Boolean.valueOf(this.f37209a));
            if (this.f37210b > 0) {
                c3494v8A.a(G5.B, Long.valueOf(this.f37211c.a() - this.f37210b));
            }
            A8.a(C3219fe.f36720w, c3494v8A.a());
        }

        public final InterfaceC3456t4 b() {
            return this.f37211c;
        }
    }

    void a();
}
