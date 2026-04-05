package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.k3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3297k3 implements InterfaceC3392p7 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.k3$a */
    public static final class a extends AbstractC3297k3 {

        /* renamed from: a, reason: collision with root package name */
        private final b f37056a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b firstReason) {
            super(null);
            kotlin.jvm.internal.e0.checkNotNullParameter(firstReason, "firstReason");
            this.f37056a = firstReason;
        }

        public final a a(b firstReason) {
            kotlin.jvm.internal.e0.checkNotNullParameter(firstReason, "firstReason");
            return new a(firstReason);
        }

        public final b d() {
            return this.f37056a;
        }

        public final b e() {
            return this.f37056a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.e0.areEqual(this.f37056a, ((a) obj).f37056a);
        }

        public int hashCode() {
            return this.f37056a.hashCode();
        }

        public String toString() {
            return "First(firstReason=" + this.f37056a + ")";
        }

        public static /* synthetic */ a a(a aVar, b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = aVar.f37056a;
            }
            return aVar.a(bVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.k3$b */
    public static abstract class b implements InterfaceC3392p7 {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.k3$b$a */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f37057a = new a();

            private a() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.k3$b$b, reason: collision with other inner class name */
        public static final class C0230b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0230b f37058a = new C0230b();

            private C0230b() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.k3$b$c */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f37059a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }

        @Override // com.ironsource.InterfaceC3392p7
        public String a() {
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof C0230b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof c) {
                return "ResumeAutoRefresh";
            }
            throw new tu.t();
        }

        private b() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.k3$c */
    public static final class c extends AbstractC3297k3 {

        /* renamed from: a, reason: collision with root package name */
        private final long f37060a;

        /* renamed from: b, reason: collision with root package name */
        private final d f37061b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, d recurringReason) {
            super(null);
            kotlin.jvm.internal.e0.checkNotNullParameter(recurringReason, "recurringReason");
            this.f37060a = j10;
            this.f37061b = recurringReason;
        }

        public final c a(long j10, d recurringReason) {
            kotlin.jvm.internal.e0.checkNotNullParameter(recurringReason, "recurringReason");
            return new c(j10, recurringReason);
        }

        public final long d() {
            return this.f37060a;
        }

        public final d e() {
            return this.f37061b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f37060a == cVar.f37060a && kotlin.jvm.internal.e0.areEqual(this.f37061b, cVar.f37061b);
        }

        public final d f() {
            return this.f37061b;
        }

        public final long g() {
            return this.f37060a;
        }

        public int hashCode() {
            return this.f37061b.hashCode() + (Long.hashCode(this.f37060a) * 31);
        }

        public String toString() {
            return "Recurring(reloadDuration=" + this.f37060a + ", recurringReason=" + this.f37061b + ")";
        }

        public static /* synthetic */ c a(c cVar, long j10, d dVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = cVar.f37060a;
            }
            if ((i10 & 2) != 0) {
                dVar = cVar.f37061b;
            }
            return cVar.a(j10, dVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.k3$d */
    public static abstract class d implements InterfaceC3392p7 {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.k3$d$a */
        public static final class a extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final a f37062a = new a();

            private a() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.k3$d$b */
        public static final class b extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final b f37063a = new b();

            private b() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.k3$d$c */
        public static final class c extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final c f37064a = new c();

            private c() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.k3$d$d, reason: collision with other inner class name */
        public static final class C0231d extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final C0231d f37065a = new C0231d();

            private C0231d() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.k3$d$e */
        public static final class e extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final e f37066a = new e();

            private e() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.k3$d$f */
        public static final class f extends d {

            /* renamed from: a, reason: collision with root package name */
            private final long f37067a;

            public f(long j10) {
                super(null);
                this.f37067a = j10;
            }

            public final f a(long j10) {
                return new f(j10);
            }

            public final long c() {
                return this.f37067a;
            }

            public final long d() {
                return this.f37067a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f37067a == ((f) obj).f37067a;
            }

            public int hashCode() {
                return Long.hashCode(this.f37067a);
            }

            public String toString() {
                return p0.o2.n(this.f37067a, "ResumeVisibility(notVisibleDuration=", ")");
            }

            public static /* synthetic */ f a(f fVar, long j10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    j10 = fVar.f37067a;
                }
                return fVar.a(j10);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.k3$d$g */
        public static final class g extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final g f37068a = new g();

            private g() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.k3$d$h */
        public static final class h extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final h f37069a = new h();

            private h() {
                super(null);
            }
        }

        public /* synthetic */ d(kotlin.jvm.internal.u uVar) {
            this();
        }

        @Override // com.ironsource.InterfaceC3392p7
        public String a() {
            if (this instanceof f) {
                return "ResumeVisibility";
            }
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof e) {
                return "ResumeAutoRefresh";
            }
            if (this instanceof c) {
                return "ReloadFailAfterTimer";
            }
            if (this instanceof C0231d) {
                return "ReloadSuccessAfterTimer";
            }
            if (this instanceof g) {
                return "TimerAfterReloadFail";
            }
            if (this instanceof h) {
                return "TimerAfterReloadSuccess";
            }
            throw new tu.t();
        }

        public final long b() {
            if (this instanceof f) {
                return ((f) this).d();
            }
            return 0L;
        }

        private d() {
        }
    }

    public /* synthetic */ AbstractC3297k3(kotlin.jvm.internal.u uVar) {
        this();
    }

    @Override // com.ironsource.InterfaceC3392p7
    public String a() {
        if (this instanceof a) {
            return ((a) this).e().a();
        }
        if (this instanceof c) {
            return ((c) this).f().a();
        }
        throw new tu.t();
    }

    public final long b() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).f().b();
        }
        throw new tu.t();
    }

    public final long c() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).g();
        }
        throw new tu.t();
    }

    private AbstractC3297k3() {
    }
}
