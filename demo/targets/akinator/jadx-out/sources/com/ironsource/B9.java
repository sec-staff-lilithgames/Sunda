package com.ironsource;

import com.ironsource.N0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class B9 extends U {

    /* renamed from: s, reason: collision with root package name */
    private final String f33891s;

    /* renamed from: t, reason: collision with root package name */
    private final List<NetworkSettings> f33892t;

    /* renamed from: u, reason: collision with root package name */
    private final F9 f33893u;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public B9(String str, List<? extends NetworkSettings> list, F9 configs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(configs, "configs");
        IronSource.a aVar = IronSource.a.f37252c;
        C3387p2 c3387p2G = configs.g();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(c3387p2G, "configs.interstitialAuctionSettings");
        super(aVar, str, list, c3387p2G, configs.c(), configs.d(), configs.f(), configs.b(), -1, new N0(N0.a.MANUAL, configs.g().j(), configs.g().b(), -1L), new H0(-1L), configs.h(), configs.k(), configs.m(), configs.l(), false, 32768, null);
        this.f33891s = str;
        this.f33892t = list;
        this.f33893u = configs;
    }

    public final B9 a(String str, List<? extends NetworkSettings> list, F9 configs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(configs, "configs");
        return new B9(str, list, configs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B9)) {
            return false;
        }
        B9 b92 = (B9) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f33891s, b92.f33891s) && kotlin.jvm.internal.e0.areEqual(this.f33892t, b92.f33892t) && kotlin.jvm.internal.e0.areEqual(this.f33893u, b92.f33893u);
    }

    public int hashCode() {
        String str = this.f33891s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f33892t;
        return this.f33893u.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // com.ironsource.U
    public List<NetworkSettings> j() {
        return this.f33892t;
    }

    @Override // com.ironsource.U
    public String o() {
        return this.f33891s;
    }

    public final String s() {
        return this.f33891s;
    }

    public final List<NetworkSettings> t() {
        return this.f33892t;
    }

    public String toString() {
        return "InterstitialAdManagerData(userId=" + this.f33891s + ", providerList=" + this.f33892t + ", configs=" + this.f33893u + ")";
    }

    public final F9 u() {
        return this.f33893u;
    }

    public final F9 v() {
        return this.f33893u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ B9 a(B9 b92, String str, List list, F9 f92, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = b92.f33891s;
        }
        if ((i10 & 2) != 0) {
            list = b92.f33892t;
        }
        if ((i10 & 4) != 0) {
            f92 = b92.f33893u;
        }
        return b92.a(str, list, f92);
    }
}
