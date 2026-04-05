package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class OC extends QT {
    public static String[] A01 = {"LeWmJ2AEMrGR8tgfwsG9m8UwM76zwmUz", "6Bm", "ck2sw", "Oj1Ntvfg6dck0NxJmQASjzaKZXVqT4Sf", "CtYf7ZmPdO", "plI1JnuA", "RZR4g54lk6KTwqItkRA6ECctcTUw", "cGd5igXf7vOVCpmuGQi5cRxrBgQCM2pW"};
    public final /* synthetic */ C08310h A00;

    public OC(C08310h c08310h) {
        this.A00 = c08310h;
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public final void A0L(C09846g c09846g, int i10) {
        int iA25;
        InterfaceC1675Xu interfaceC1675Xu;
        super.A0L(c09846g, i10);
        C2117gI linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager != null && (iA25 = linearLayoutManager.A25()) >= 0) {
            C08310h c08310h = this.A00;
            int scrollPosition = A01[3].charAt(13);
            if (scrollPosition == 48) {
                throw new RuntimeException();
            }
            A01[5] = "JmqJ93Os7fwoNBdh";
            if (c08310h.getAdapter() == null || iA25 >= this.A00.getAdapter().A0B() || (interfaceC1675Xu = (InterfaceC1675Xu) c09846g.A1F(iA25)) == null) {
                return;
            }
            interfaceC1675Xu.AIV();
        }
    }
}
