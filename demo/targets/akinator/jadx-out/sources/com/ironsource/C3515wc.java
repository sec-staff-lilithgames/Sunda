package com.ironsource;

import com.ironsource.sdk.IronSourceNetwork;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.wc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3515wc implements InterfaceC3498vc {
    @Override // com.ironsource.InterfaceC3498vc
    public void a(M9 adInstance, C3532xc loadParams) throws Exception {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.e0.checkNotNullParameter(loadParams, "loadParams");
        IronSourceNetwork.loadAd(adInstance, loadParams.a());
    }

    @Override // com.ironsource.InterfaceC3498vc
    public String a() {
        String version = IronSourceNetwork.getVersion();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(version, "getVersion()");
        return version;
    }
}
