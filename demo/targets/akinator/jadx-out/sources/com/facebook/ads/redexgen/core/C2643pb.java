package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.pb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2643pb {
    public static C2643pb A03 = null;
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C2654pm A02;

    public C2643pb(ViewpointQeConfig viewpointQeConfig, AbstractC2659ps abstractC2659ps, C2654pm c2654pm, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c2654pm;
        abstractC2659ps.A03(new A4(c2654pm));
    }

    public static C2643pb A00(ViewpointQeConfig viewpointQeConfig, AbstractC2659ps abstractC2659ps, InterfaceC2664px interfaceC2664px, A6 a62) {
        C2643pb localsTestInstance = A03;
        if (localsTestInstance != null) {
            return localsTestInstance;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        return new C2643pb(viewpointQeConfig, abstractC2659ps, new C2654pm(viewpointQeConfig, interfaceC2664px, C1100Bg.A00, a62, viewpointRegistry, new Handler(Looper.getMainLooper())), viewpointRegistry);
    }

    public final void A01(InterfaceC2658pr interfaceC2658pr) {
        this.A02.A0E(interfaceC2658pr);
    }

    public final void A02(InterfaceC2656pp interfaceC2656pp) {
        this.A02.A0F(interfaceC2656pp);
    }

    public final void A03(DspViewableNode dspViewableNode) {
        A04(dspViewableNode, null);
    }

    public final void A04(DspViewableNode dspViewableNode, C2665q0 c2665q0) {
        if (this.A00.A00 && c2665q0 != null) {
            this.A01.A06(dspViewableNode, c2665q0);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A05(DspViewableNode dspViewableNode, C2665q0 c2665q0, C2661pu c2661pu) {
        if (this.A00.A00 && c2665q0 != null) {
            this.A01.A07(dspViewableNode, c2665q0, c2661pu);
        } else {
            this.A01.A08(dspViewableNode, c2661pu);
        }
    }

    public final void A06(DspViewableNode dspViewableNode, C2661pu c2661pu) {
        A05(dspViewableNode, null, c2661pu);
    }
}
