package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class I2 extends U {

    /* renamed from: s, reason: collision with root package name */
    private final String f34646s;

    /* renamed from: t, reason: collision with root package name */
    private final List<NetworkSettings> f34647t;

    /* renamed from: u, reason: collision with root package name */
    private final V2 f34648u;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public I2(String str, List<? extends NetworkSettings> list, V2 configs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(configs, "configs");
        IronSource.a aVar = IronSource.a.BANNER;
        C3387p2 c3387p2D = configs.d();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(c3387p2D, "configs.bannerAuctionSettings");
        super(aVar, str, list, c3387p2D, configs.a(), (int) (configs.b() / 1000), configs.c(), configs.f(), -1, J2.b(configs), new H0(configs.j()), configs.e(), configs.l(), configs.n(), configs.m(), false, 32768, null);
        this.f34646s = str;
        this.f34647t = list;
        this.f34648u = configs;
    }

    public final I2 a(String str, List<? extends NetworkSettings> list, V2 configs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(configs, "configs");
        return new I2(str, list, configs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I2)) {
            return false;
        }
        I2 i22 = (I2) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f34646s, i22.f34646s) && kotlin.jvm.internal.e0.areEqual(this.f34647t, i22.f34647t) && kotlin.jvm.internal.e0.areEqual(this.f34648u, i22.f34648u);
    }

    public int hashCode() {
        String str = this.f34646s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f34647t;
        return this.f34648u.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // com.ironsource.U
    public List<NetworkSettings> j() {
        return this.f34647t;
    }

    @Override // com.ironsource.U
    public String o() {
        return this.f34646s;
    }

    public final String s() {
        return this.f34646s;
    }

    public final List<NetworkSettings> t() {
        return this.f34647t;
    }

    public String toString() {
        return "BannerAdManagerData(userId=" + this.f34646s + ", providerList=" + this.f34647t + ", configs=" + this.f34648u + ")";
    }

    public final V2 u() {
        return this.f34648u;
    }

    public final V2 v() {
        return this.f34648u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ I2 a(I2 i22, String str, List list, V2 v22, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = i22.f34646s;
        }
        if ((i10 & 2) != 0) {
            list = i22.f34647t;
        }
        if ((i10 & 4) != 0) {
            v22 = i22.f34648u;
        }
        return i22.a(str, list, v22);
    }
}
