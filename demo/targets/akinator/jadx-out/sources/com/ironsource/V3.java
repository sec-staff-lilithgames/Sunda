package com.ironsource;

import bp.oM.DwaEpyvxz;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class V3 {

    /* renamed from: a, reason: collision with root package name */
    private final Zd f35615a;

    /* renamed from: b, reason: collision with root package name */
    private final F9 f35616b;

    /* renamed from: c, reason: collision with root package name */
    private final V2 f35617c;

    /* renamed from: d, reason: collision with root package name */
    private final Rb f35618d;

    /* renamed from: e, reason: collision with root package name */
    private final A1 f35619e;

    /* renamed from: f, reason: collision with root package name */
    private final Of f35620f;

    /* renamed from: g, reason: collision with root package name */
    private final com.ironsource.mediationsdk.adquality.a f35621g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Zd f35622a;

        /* renamed from: b, reason: collision with root package name */
        private F9 f35623b;

        /* renamed from: c, reason: collision with root package name */
        private V2 f35624c;

        /* renamed from: d, reason: collision with root package name */
        private Rb f35625d;

        /* renamed from: e, reason: collision with root package name */
        private A1 f35626e;

        /* renamed from: f, reason: collision with root package name */
        private Of f35627f;

        /* renamed from: g, reason: collision with root package name */
        private com.ironsource.mediationsdk.adquality.a f35628g;

        public a() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public final a a(Zd zd2, F9 f92, V2 v22, Rb rb2, A1 a12, Of of2, com.ironsource.mediationsdk.adquality.a aVar) {
            return new a(zd2, f92, v22, rb2, a12, of2, aVar);
        }

        public final Zd b() {
            return this.f35622a;
        }

        public final F9 c() {
            return this.f35623b;
        }

        public final V2 d() {
            return this.f35624c;
        }

        public final Rb e() {
            return this.f35625d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.e0.areEqual(this.f35622a, aVar.f35622a) && kotlin.jvm.internal.e0.areEqual(this.f35623b, aVar.f35623b) && kotlin.jvm.internal.e0.areEqual(this.f35624c, aVar.f35624c) && kotlin.jvm.internal.e0.areEqual(this.f35625d, aVar.f35625d) && kotlin.jvm.internal.e0.areEqual(this.f35626e, aVar.f35626e) && kotlin.jvm.internal.e0.areEqual(this.f35627f, aVar.f35627f) && kotlin.jvm.internal.e0.areEqual(this.f35628g, aVar.f35628g);
        }

        public final A1 f() {
            return this.f35626e;
        }

        public final Of g() {
            return this.f35627f;
        }

        public final com.ironsource.mediationsdk.adquality.a h() {
            return this.f35628g;
        }

        public int hashCode() {
            Zd zd2 = this.f35622a;
            int iHashCode = (zd2 == null ? 0 : zd2.hashCode()) * 31;
            F9 f92 = this.f35623b;
            int iHashCode2 = (iHashCode + (f92 == null ? 0 : f92.hashCode())) * 31;
            V2 v22 = this.f35624c;
            int iHashCode3 = (iHashCode2 + (v22 == null ? 0 : v22.hashCode())) * 31;
            Rb rb2 = this.f35625d;
            int iHashCode4 = (iHashCode3 + (rb2 == null ? 0 : rb2.hashCode())) * 31;
            A1 a12 = this.f35626e;
            int iHashCode5 = (iHashCode4 + (a12 == null ? 0 : a12.hashCode())) * 31;
            Of of2 = this.f35627f;
            int iHashCode6 = (iHashCode5 + (of2 == null ? 0 : of2.hashCode())) * 31;
            com.ironsource.mediationsdk.adquality.a aVar = this.f35628g;
            return iHashCode6 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final com.ironsource.mediationsdk.adquality.a i() {
            return this.f35628g;
        }

        public final A1 j() {
            return this.f35626e;
        }

        public final V2 k() {
            return this.f35624c;
        }

        public final F9 l() {
            return this.f35623b;
        }

        public final Rb m() {
            return this.f35625d;
        }

        public final Zd n() {
            return this.f35622a;
        }

        public final Of o() {
            return this.f35627f;
        }

        public String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.f35622a + ", interstitialConfigurations=" + this.f35623b + ", bannerConfigurations=" + this.f35624c + ", nativeAdConfigurations=" + this.f35625d + ", applicationConfigurations=" + this.f35626e + ", testSuiteSettings=" + this.f35627f + ", adQualityConfigurations=" + this.f35628g + ")";
        }

        public a(Zd zd2, F9 f92, V2 v22, Rb rb2, A1 a12, Of of2, com.ironsource.mediationsdk.adquality.a aVar) {
            this.f35622a = zd2;
            this.f35623b = f92;
            this.f35624c = v22;
            this.f35625d = rb2;
            this.f35626e = a12;
            this.f35627f = of2;
            this.f35628g = aVar;
        }

        public static /* synthetic */ a a(a aVar, Zd zd2, F9 f92, V2 v22, Rb rb2, A1 a12, Of of2, com.ironsource.mediationsdk.adquality.a aVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                zd2 = aVar.f35622a;
            }
            if ((i10 & 2) != 0) {
                f92 = aVar.f35623b;
            }
            if ((i10 & 4) != 0) {
                v22 = aVar.f35624c;
            }
            if ((i10 & 8) != 0) {
                rb2 = aVar.f35625d;
            }
            if ((i10 & 16) != 0) {
                a12 = aVar.f35626e;
            }
            if ((i10 & 32) != 0) {
                of2 = aVar.f35627f;
            }
            if ((i10 & 64) != 0) {
                aVar2 = aVar.f35628g;
            }
            Of of3 = of2;
            com.ironsource.mediationsdk.adquality.a aVar3 = aVar2;
            A1 a13 = a12;
            V2 v23 = v22;
            return aVar.a(zd2, f92, v23, rb2, a13, of3, aVar3);
        }

        public final void b(Zd zd2) {
            this.f35622a = zd2;
        }

        public final void a(Of of2) {
            this.f35627f = of2;
        }

        public final void b(F9 f92) {
            this.f35623b = f92;
        }

        public final a a(Zd zd2) {
            this.f35622a = zd2;
            return this;
        }

        public final void b(V2 v22) {
            this.f35624c = v22;
        }

        public final a a(F9 f92) {
            this.f35623b = f92;
            return this;
        }

        public final void b(Rb rb2) {
            this.f35625d = rb2;
        }

        public final a a(V2 v22) {
            this.f35624c = v22;
            return this;
        }

        public final void b(A1 a12) {
            this.f35626e = a12;
        }

        public final a a(Rb rb2) {
            this.f35625d = rb2;
            return this;
        }

        public final void b(com.ironsource.mediationsdk.adquality.a aVar) {
            this.f35628g = aVar;
        }

        public final a a(A1 a12) {
            this.f35626e = a12;
            return this;
        }

        public final a b(Of of2) {
            this.f35627f = of2;
            return this;
        }

        public final a a(com.ironsource.mediationsdk.adquality.a aVar) {
            this.f35628g = aVar;
            return this;
        }

        public /* synthetic */ a(Zd zd2, F9 f92, V2 v22, Rb rb2, A1 a12, Of of2, com.ironsource.mediationsdk.adquality.a aVar, int i10, kotlin.jvm.internal.u uVar) {
            this((i10 & 1) != 0 ? null : zd2, (i10 & 2) != 0 ? null : f92, (i10 & 4) != 0 ? null : v22, (i10 & 8) != 0 ? null : rb2, (i10 & 16) != 0 ? null : a12, (i10 & 32) != 0 ? null : of2, (i10 & 64) != 0 ? null : aVar);
        }

        public final V3 a() {
            return new V3(this.f35622a, this.f35623b, this.f35624c, this.f35625d, this.f35626e, this.f35627f, this.f35628g, null);
        }
    }

    public /* synthetic */ V3(Zd zd2, F9 f92, V2 v22, Rb rb2, A1 a12, Of of2, com.ironsource.mediationsdk.adquality.a aVar, kotlin.jvm.internal.u uVar) {
        this(zd2, f92, v22, rb2, a12, of2, aVar);
    }

    public final com.ironsource.mediationsdk.adquality.a a() {
        return this.f35621g;
    }

    public final A1 b() {
        return this.f35619e;
    }

    public final V2 c() {
        return this.f35617c;
    }

    public final F9 d() {
        return this.f35616b;
    }

    public final Rb e() {
        return this.f35618d;
    }

    public final Zd f() {
        return this.f35615a;
    }

    public final Of g() {
        return this.f35620f;
    }

    private V3(Zd zd2, F9 f92, V2 v22, Rb rb2, A1 a12, Of of2, com.ironsource.mediationsdk.adquality.a aVar) {
        this.f35615a = zd2;
        this.f35616b = f92;
        this.f35617c = v22;
        this.f35618d = rb2;
        this.f35619e = a12;
        this.f35620f = of2;
        this.f35621g = aVar;
    }

    public String toString() {
        Zd zd2 = this.f35615a;
        F9 f92 = this.f35616b;
        V2 v22 = this.f35617c;
        Rb rb2 = this.f35618d;
        StringBuilder sb2 = new StringBuilder("configurations(\n");
        sb2.append(zd2);
        String str = DwaEpyvxz.leFjsZeRAuO;
        sb2.append(str);
        sb2.append(f92);
        sb2.append(str);
        sb2.append(v22);
        sb2.append(str);
        sb2.append(rb2);
        sb2.append(")");
        return sb2.toString();
    }
}
