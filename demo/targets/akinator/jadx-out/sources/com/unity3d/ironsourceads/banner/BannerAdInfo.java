package com.unity3d.ironsourceads.banner;

import e3.g;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class BannerAdInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f50594a;

    /* renamed from: b, reason: collision with root package name */
    private final String f50595b;

    public BannerAdInfo(String instanceId, String adId) {
        e0.checkNotNullParameter(instanceId, "instanceId");
        e0.checkNotNullParameter(adId, "adId");
        this.f50594a = instanceId;
        this.f50595b = adId;
    }

    public static /* synthetic */ BannerAdInfo copy$default(BannerAdInfo bannerAdInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bannerAdInfo.f50594a;
        }
        if ((i10 & 2) != 0) {
            str2 = bannerAdInfo.f50595b;
        }
        return bannerAdInfo.copy(str, str2);
    }

    public final String component1() {
        return this.f50594a;
    }

    public final String component2() {
        return this.f50595b;
    }

    public final BannerAdInfo copy(String instanceId, String adId) {
        e0.checkNotNullParameter(instanceId, "instanceId");
        e0.checkNotNullParameter(adId, "adId");
        return new BannerAdInfo(instanceId, adId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAdInfo)) {
            return false;
        }
        BannerAdInfo bannerAdInfo = (BannerAdInfo) obj;
        return e0.areEqual(this.f50594a, bannerAdInfo.f50594a) && e0.areEqual(this.f50595b, bannerAdInfo.f50595b);
    }

    public final String getAdId() {
        return this.f50595b;
    }

    public final String getInstanceId() {
        return this.f50594a;
    }

    public int hashCode() {
        return this.f50595b.hashCode() + (this.f50594a.hashCode() * 31);
    }

    public String toString() {
        return g.l("[instanceId: '", this.f50594a, "', adId: '", this.f50595b, "']");
    }
}
