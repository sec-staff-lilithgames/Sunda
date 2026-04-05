package com.ironsource;

import com.ironsource.InterfaceC3459t7;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.nf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3365nf implements InterfaceC3459t7, InterfaceC3459t7.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3456t4 f37992a;

    /* renamed from: b, reason: collision with root package name */
    private final T8 f37993b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, C3309kf> f37994c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.nf$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f37995a;

        /* renamed from: b, reason: collision with root package name */
        private long f37996b;

        /* renamed from: c, reason: collision with root package name */
        private Long f37997c;

        public a(int i10, long j10, Long l9) {
            this.f37995a = i10;
            this.f37996b = j10;
            this.f37997c = l9;
        }

        public final int a() {
            return this.f37995a;
        }

        public final long b() {
            return this.f37996b;
        }

        public final Long c() {
            return this.f37997c;
        }

        public final int d() {
            return this.f37995a;
        }

        public final long e() {
            return this.f37996b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f37995a == aVar.f37995a && this.f37996b == aVar.f37996b && kotlin.jvm.internal.e0.areEqual(this.f37997c, aVar.f37997c);
        }

        public final Long f() {
            return this.f37997c;
        }

        public int hashCode() {
            int iD = p0.o2.d(Integer.hashCode(this.f37995a) * 31, 31, this.f37996b);
            Long l9 = this.f37997c;
            return iD + (l9 == null ? 0 : l9.hashCode());
        }

        public String toString() {
            return "ShowCountCappingInfo(currentNumberOfShows=" + this.f37995a + ", currentTime=" + this.f37996b + ", currentTimeThreshold=" + this.f37997c + ")";
        }

        public final a a(int i10, long j10, Long l9) {
            return new a(i10, j10, l9);
        }

        public static /* synthetic */ a a(a aVar, int i10, long j10, Long l9, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = aVar.f37995a;
            }
            if ((i11 & 2) != 0) {
                j10 = aVar.f37996b;
            }
            if ((i11 & 4) != 0) {
                l9 = aVar.f37997c;
            }
            return aVar.a(i10, j10, l9);
        }

        public final void a(int i10) {
            this.f37995a = i10;
        }

        public final void a(long j10) {
            this.f37996b = j10;
        }

        public final void a(Long l9) {
            this.f37997c = l9;
        }
    }

    public C3365nf(InterfaceC3456t4 currentTimeProvider, T8 serviceDataRepository) {
        kotlin.jvm.internal.e0.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(serviceDataRepository, "serviceDataRepository");
        this.f37992a = currentTimeProvider;
        this.f37993b = serviceDataRepository;
        this.f37994c = new LinkedHashMap();
    }

    private final a c(String str) {
        return new a(this.f37993b.a(str), this.f37992a.a(), this.f37993b.b(str));
    }

    public final Map<String, C3309kf> a() {
        return this.f37994c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    @Override // com.ironsource.InterfaceC3459t7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "identifier"
            kotlin.jvm.internal.e0.checkNotNullParameter(r9, r0)
            java.util.Map<java.lang.String, com.ironsource.kf> r0 = r8.f37994c
            java.lang.Object r0 = r0.get(r9)
            com.ironsource.kf r0 = (com.ironsource.C3309kf) r0
            if (r0 != 0) goto L10
            return
        L10:
            com.ironsource.nf$a r1 = r8.c(r9)
            int r2 = r1.d()
            r3 = 1
            if (r2 == 0) goto L30
            long r4 = r1.e()
            java.lang.Long r2 = r1.f()
            if (r2 == 0) goto L2a
            long r6 = r2.longValue()
            goto L2c
        L2a:
            r6 = 0
        L2c:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L47
        L30:
            long r4 = r1.e()
            com.ironsource.P3 r0 = r0.b()
            r2 = 0
            long r6 = com.ironsource.P3.a(r0, r2, r3, r2)
            long r6 = r6 + r4
            com.ironsource.T8 r0 = r8.f37993b
            r0.a(r6, r9)
            r0 = 0
            r1.a(r0)
        L47:
            int r0 = r1.d()
            int r0 = r0 + r3
            r1.a(r0)
            com.ironsource.T8 r0 = r8.f37993b
            int r1 = r1.d()
            r0.a(r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3365nf.b(java.lang.String):void");
    }

    @Override // com.ironsource.InterfaceC3459t7
    public O3 a(String identifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        C3309kf c3309kf = this.f37994c.get(identifier);
        return c3309kf == null ? new O3(false, null, 2, null) : a(c3309kf, identifier) ? new O3(true, Q3.ShowCount) : new O3(false, null, 2, null);
    }

    private final boolean a(C3309kf c3309kf, String str) {
        a aVarC = c(str);
        Long lF = aVarC.f();
        if (lF != null) {
            long jLongValue = lF.longValue();
            if (aVarC.d() >= c3309kf.a() && this.f37992a.a() < jLongValue) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC3459t7.a
    public Object a(String identifier, Q3 cappingType, InterfaceC3425r7 cappingConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        kotlin.jvm.internal.e0.checkNotNullParameter(cappingType, "cappingType");
        kotlin.jvm.internal.e0.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object objC = cappingConfig.c();
        boolean zM7137isSuccessimpl = tu.z.m7137isSuccessimpl(objC);
        tu.x0 x0Var = tu.x0.f87415a;
        if (zM7137isSuccessimpl) {
            C3309kf c3309kf = (C3309kf) objC;
            if (c3309kf != null) {
                this.f37994c.put(identifier, c3309kf);
            }
            return tu.z.m7131constructorimpl(x0Var);
        }
        Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(objC);
        if (thM7134exceptionOrNullimpl != null) {
            return tu.z.m7131constructorimpl(tu.a0.createFailure(thM7134exceptionOrNullimpl));
        }
        return tu.z.m7131constructorimpl(x0Var);
    }
}
