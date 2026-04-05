package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.j3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3279j3 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f36985c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final b f36986a;

    /* renamed from: b, reason: collision with root package name */
    private final K2 f36987b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.j3$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final AbstractC3279j3 a(C3350n0 adTools, X2 bannerContainer, b config, K2 bannerAdProperties, InterfaceC3315l3 bannerStrategyListener, O2 createBannerAdUnitFactory) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
            kotlin.jvm.internal.e0.checkNotNullParameter(bannerContainer, "bannerContainer");
            kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
            kotlin.jvm.internal.e0.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
            kotlin.jvm.internal.e0.checkNotNullParameter(bannerStrategyListener, "bannerStrategyListener");
            kotlin.jvm.internal.e0.checkNotNullParameter(createBannerAdUnitFactory, "createBannerAdUnitFactory");
            return new Uf(adTools, bannerContainer, config, bannerAdProperties, bannerStrategyListener, createBannerAdUnitFactory);
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.j3$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f36988a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f36989b;

        public b(long j10, boolean z10) {
            this.f36988a = j10;
            this.f36989b = z10;
        }

        public final long a() {
            return this.f36988a;
        }

        public final boolean b() {
            return this.f36989b;
        }

        public final long c() {
            return this.f36988a;
        }

        public final boolean d() {
            return this.f36989b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f36988a == bVar.f36988a && this.f36989b == bVar.f36989b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = Long.hashCode(this.f36988a) * 31;
            boolean z10 = this.f36989b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return iHashCode + i10;
        }

        public String toString() {
            return "Config(refreshInterval=" + this.f36988a + ", isAutoRefreshEnabled=" + this.f36989b + ")";
        }

        public final b a(long j10, boolean z10) {
            return new b(j10, z10);
        }

        public static /* synthetic */ b a(b bVar, long j10, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = bVar.f36988a;
            }
            if ((i10 & 2) != 0) {
                z10 = bVar.f36989b;
            }
            return bVar.a(j10, z10);
        }
    }

    public AbstractC3279j3(b config, K2 bannerAdProperties) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        this.f36986a = config;
        this.f36987b = bannerAdProperties;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public final long g() {
        Long lJ = this.f36987b.j();
        return lJ != null ? lJ.longValue() : this.f36986a.c();
    }

    public final boolean h() {
        Boolean boolI = this.f36987b.i();
        return boolI != null ? boolI.booleanValue() : this.f36986a.d();
    }
}
