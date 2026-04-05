package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Vf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1610Vf implements ViewpointAction<UE, UJ> {
    public VN A00;

    public C1610Vf(VN vn2) {
        this.A00 = vn2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.core.ViewpointAction
    public final void A6J(C2661pu<UE, UJ> c2661pu, InterfaceC2652pk interfaceC2652pk) {
        switch (interfaceC2652pk.A9M(c2661pu)) {
            case A02:
            case A04:
                this.A00.A02(c2661pu, interfaceC2652pk);
                break;
        }
    }
}
