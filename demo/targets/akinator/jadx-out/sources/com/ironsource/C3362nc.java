package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.IronSourceNetwork;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.nc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3362nc implements InterfaceC3342mc {
    @Override // com.ironsource.InterfaceC3342mc
    public void a(M9 adInstance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "adInstance");
        try {
            IronSourceNetwork.destroyAd(adInstance);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.ADAPTER_API.verbose("destroy ad with identifier: " + adInstance.e() + " failed. error: " + e10.getMessage());
        }
    }
}
