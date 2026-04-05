package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;

/* loaded from: assets/audience_network.dex */
public class XV implements SU {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ XN A01;

    public XV(XN xn2, AdvertisingId advertisingId) {
        this.A01 = xn2;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.core.SU
    public final boolean AAO() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.core.SU
    public final String getId() {
        return this.A00.getId();
    }
}
