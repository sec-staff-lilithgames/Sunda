package com.moloco.sdk.publisher;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MolocoAd {
    public static final int $stable = 0;
    private final String adUnitId;
    private final String networkName;
    private final Float revenue;

    public MolocoAd(String networkName, String adUnitId, Float f10) {
        e0.checkNotNullParameter(networkName, "networkName");
        e0.checkNotNullParameter(adUnitId, "adUnitId");
        this.networkName = networkName;
        this.adUnitId = adUnitId;
        this.revenue = f10;
    }

    public static /* synthetic */ MolocoAd copy$default(MolocoAd molocoAd, String str, String str2, Float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = molocoAd.networkName;
        }
        if ((i10 & 2) != 0) {
            str2 = molocoAd.adUnitId;
        }
        if ((i10 & 4) != 0) {
            f10 = molocoAd.revenue;
        }
        return molocoAd.copy(str, str2, f10);
    }

    public final String component1() {
        return this.networkName;
    }

    public final String component2() {
        return this.adUnitId;
    }

    public final Float component3() {
        return this.revenue;
    }

    public final MolocoAd copy(String networkName, String adUnitId, Float f10) {
        e0.checkNotNullParameter(networkName, "networkName");
        e0.checkNotNullParameter(adUnitId, "adUnitId");
        return new MolocoAd(networkName, adUnitId, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MolocoAd)) {
            return false;
        }
        MolocoAd molocoAd = (MolocoAd) obj;
        return e0.areEqual(this.networkName, molocoAd.networkName) && e0.areEqual(this.adUnitId, molocoAd.adUnitId) && e0.areEqual((Object) this.revenue, (Object) molocoAd.revenue);
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getNetworkName() {
        return this.networkName;
    }

    public final Float getRevenue() {
        return this.revenue;
    }

    public int hashCode() {
        int iE = o2.e(this.networkName.hashCode() * 31, 31, this.adUnitId);
        Float f10 = this.revenue;
        return iE + (f10 == null ? 0 : f10.hashCode());
    }

    public String toString() {
        return "MolocoAd(networkName=" + this.networkName + ", adUnitId=" + this.adUnitId + ", revenue=" + this.revenue + ')';
    }

    public /* synthetic */ MolocoAd(String str, String str2, Float f10, int i10, u uVar) {
        this(str, str2, (i10 & 4) != 0 ? null : f10);
    }
}
