package com.facebook.ads.redexgen.core;

import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.71, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass71 {
    public int A00;
    public int A01;
    public Looper A03;
    public Object A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Timeline A0A;
    public final C3T A0B;
    public final InterfaceC10036z A0C;
    public final AnonymousClass70 A0D;
    public long A02 = C.TIME_UNSET;
    public boolean A05 = true;

    public AnonymousClass71(InterfaceC10036z interfaceC10036z, AnonymousClass70 anonymousClass70, Timeline timeline, int i10, C3T c3t, Looper looper) {
        this.A0C = interfaceC10036z;
        this.A0D = anonymousClass70;
        this.A0A = timeline;
        this.A03 = looper;
        this.A0B = c3t;
        this.A00 = i10;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final Looper A03() {
        return this.A03;
    }

    public final Timeline A04() {
        return this.A0A;
    }

    public final AnonymousClass70 A05() {
        return this.A0D;
    }

    public final AnonymousClass71 A06() {
        C3M.A08(!this.A09);
        if (this.A02 == C.TIME_UNSET) {
            C3M.A07(this.A05);
        }
        this.A09 = true;
        this.A0C.AIS(this);
        return this;
    }

    public final AnonymousClass71 A07(int i10) {
        C3M.A08(!this.A09);
        this.A01 = i10;
        return this;
    }

    public final AnonymousClass71 A08(Object obj) {
        C3M.A08(!this.A09);
        this.A04 = obj;
        return this;
    }

    public final Object A09() {
        return this.A04;
    }

    public final synchronized void A0A(boolean z10) {
        this.A07 |= z10;
        this.A08 = true;
        notifyAll();
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final synchronized boolean A0C() throws InterruptedException {
        C3M.A08(this.A09);
        C3M.A08(this.A03.getThread() != Thread.currentThread());
        while (!this.A08) {
            wait();
        }
        return this.A07;
    }

    public final synchronized boolean A0D() {
        return this.A06;
    }
}
