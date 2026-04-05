package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public final class C6 implements InterfaceC2051fD {
    @Override // com.facebook.ads.redexgen.core.InterfaceC2051fD
    public final long A5e() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2051fD
    public final void AJK(Object obj, long j10) throws InterruptedException {
        obj.wait(j10);
    }
}
