package com.facebook.ads.redexgen.core;

import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;

/* loaded from: assets/audience_network.dex */
public class U2 implements InterfaceC1592Um {
    public final /* synthetic */ MediaViewVideoRendererApi A00;
    public final /* synthetic */ TD A01;

    public U2(TD td2, MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = td2;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1592Um
    public final void AIk() {
        this.A00.setVolume(0.0f);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1592Um
    public final void AIp(NativeAd nativeAd) {
        this.A01.A0I(C1480Qc.A0L(nativeAd.getInternalNativeAd()), null);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1592Um
    public final void AJn() {
        this.A01.A0D();
    }
}
