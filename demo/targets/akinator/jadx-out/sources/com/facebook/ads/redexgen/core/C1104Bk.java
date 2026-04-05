package com.facebook.ads.redexgen.core;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Bk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1104Bk implements InterfaceC2017ee {
    public final /* synthetic */ C08671r A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public C1104Bk(C08671r c08671r, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        this.A00 = c08671r;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = countDownLatch;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2017ee
    public final void ACo(InterfaceC2015ec interfaceC2015ec) {
        C08671r.A06(interfaceC2015ec.A6v(), this.A03, this.A02);
        this.A01.countDown();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2017ee
    public final void ADC(Exception exc) {
        this.A02.set(exc);
        this.A01.countDown();
    }
}
