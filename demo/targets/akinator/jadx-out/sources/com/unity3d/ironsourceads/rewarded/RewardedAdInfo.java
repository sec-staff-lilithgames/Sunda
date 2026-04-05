package com.unity3d.ironsourceads.rewarded;

import e3.g;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class RewardedAdInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f50626a;

    /* renamed from: b, reason: collision with root package name */
    private final String f50627b;

    public RewardedAdInfo(String instanceId, String adId) {
        e0.checkNotNullParameter(instanceId, "instanceId");
        e0.checkNotNullParameter(adId, "adId");
        this.f50626a = instanceId;
        this.f50627b = adId;
    }

    public final String getAdId() {
        return this.f50627b;
    }

    public final String getInstanceId() {
        return this.f50626a;
    }

    public String toString() {
        return g.l("[instanceId: '", this.f50626a, "', adId: '", this.f50627b, "']");
    }
}
