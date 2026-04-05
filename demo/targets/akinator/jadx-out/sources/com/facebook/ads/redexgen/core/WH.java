package com.facebook.ads.redexgen.core;

import android.app.Activity;

/* loaded from: assets/audience_network.dex */
public final class WH {
    public static final WH A04 = new WH(new PN(), new PB());
    public final WG A02;
    public final XF A03;
    public boolean A01 = true;
    public long A00 = -1;

    public WH(XF xf2, WG wg2) {
        this.A03 = xf2;
        this.A02 = wg2;
    }

    public static WH A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A5f();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        Activity lastResumedActivity = this.A02.A8E();
        boolean z10 = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (WH.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A5f() - this.A00 >= 1000) {
                z10 = false;
            }
            return z10;
        }
    }
}
