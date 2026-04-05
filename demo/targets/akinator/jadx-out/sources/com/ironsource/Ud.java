package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ud extends U {

    /* renamed from: s, reason: collision with root package name */
    private final String f35566s;

    /* renamed from: t, reason: collision with root package name */
    private final List<NetworkSettings> f35567t;

    /* renamed from: u, reason: collision with root package name */
    private final Zd f35568u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f35569v;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public Ud(String str, List<? extends NetworkSettings> list, Zd configs, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(configs, "configs");
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        C3387p2 c3387p2K = configs.k();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(c3387p2K, "configs.rewardedVideoAuctionSettings");
        super(aVar, str, list, c3387p2K, configs.g(), configs.h(), configs.j(), configs.b(), configs.c(), Vd.b(configs, z10), new H0(-1L), configs.l(), configs.f(), configs.o(), configs.n(), false, 32768, null);
        this.f35566s = str;
        this.f35567t = list;
        this.f35568u = configs;
        this.f35569v = z10;
    }

    public final Ud a(String str, List<? extends NetworkSettings> list, Zd configs, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(configs, "configs");
        return new Ud(str, list, configs, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ud)) {
            return false;
        }
        Ud ud2 = (Ud) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f35566s, ud2.f35566s) && kotlin.jvm.internal.e0.areEqual(this.f35567t, ud2.f35567t) && kotlin.jvm.internal.e0.areEqual(this.f35568u, ud2.f35568u) && this.f35569v == ud2.f35569v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f35566s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f35567t;
        int iHashCode2 = (this.f35568u.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31;
        boolean z10 = this.f35569v;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode2 + i10;
    }

    @Override // com.ironsource.U
    public List<NetworkSettings> j() {
        return this.f35567t;
    }

    @Override // com.ironsource.U
    public String o() {
        return this.f35566s;
    }

    public final String s() {
        return this.f35566s;
    }

    public final List<NetworkSettings> t() {
        return this.f35567t;
    }

    public String toString() {
        return "RewardedVideoAdDataManager(userId=" + this.f35566s + ", providerList=" + this.f35567t + ", configs=" + this.f35568u + ", isManual=" + this.f35569v + ")";
    }

    public final Zd u() {
        return this.f35568u;
    }

    public final boolean v() {
        return this.f35569v;
    }

    public final Zd w() {
        return this.f35568u;
    }

    public final boolean x() {
        return this.f35569v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Ud a(Ud ud2, String str, List list, Zd zd2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ud2.f35566s;
        }
        if ((i10 & 2) != 0) {
            list = ud2.f35567t;
        }
        if ((i10 & 4) != 0) {
            zd2 = ud2.f35568u;
        }
        if ((i10 & 8) != 0) {
            z10 = ud2.f35569v;
        }
        return ud2.a(str, list, zd2, z10);
    }
}
