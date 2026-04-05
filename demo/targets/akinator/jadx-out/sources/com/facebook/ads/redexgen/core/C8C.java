package com.facebook.ads.redexgen.core;

import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.8C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8C {
    public final Handler A00;
    public final C8D A01;

    public C8C(Handler handler, C8D c8d) {
        this.A00 = c8d != null ? (Handler) C3M.A01(handler) : null;
        this.A01 = c8d;
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A00(final int i10) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.7y
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A01(final int i10, final long j10, final long j11) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.82
                @Override // java.lang.Runnable
                public final void run() {
                    this.A03.A02(i10, j10, j11);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i10, long j10, long j11) {
        ((C8D) AbstractC09264a.A0f(this.A01)).ACY(i10, j10, j11);
    }

    public final void A03(final long j10) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.83
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A04(j10);
                }
            });
        }
    }

    public final /* synthetic */ void A04(long j10) {
        ((C8D) AbstractC09264a.A0f(this.A01)).ACU(j10);
    }

    public final void A05(final C2614or c2614or, final C09615j c09615j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.87
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A06(c2614or, c09615j);
                }
            });
        }
    }

    public final /* synthetic */ void A06(C2614or c2614or, C09615j c09615j) {
        ((C8D) AbstractC09264a.A0f(this.A01)).ACS(c2614or);
        ((C8D) AbstractC09264a.A0f(this.A01)).ACT(c2614or, c09615j);
    }

    public final void A07(final C09585g c09585g) {
        c09585g.A02();
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.85
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A09(c09585g);
                }
            });
        }
    }

    public final void A08(final C09585g c09585g) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8B
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0A(c09585g);
                }
            });
        }
    }

    public final /* synthetic */ void A09(C09585g c09585g) {
        c09585g.A02();
        ((C8D) AbstractC09264a.A0f(this.A01)).ACQ(c09585g);
    }

    public final /* synthetic */ void A0A(C09585g c09585g) {
        ((C8D) AbstractC09264a.A0f(this.A01)).ACR(c09585g);
    }

    public final void A0B(final C8F c8f) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.81
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0C(final C8F c8f) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.7x
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0D(final Exception exc) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.84
                @Override // java.lang.Runnable
                public final void run() {
                    this.A00.A0E(exc);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(Exception exc) {
        ((C8D) AbstractC09264a.A0f(this.A01)).ACV(exc);
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A0F(final String str) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.88
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0G(final String str, final long j10, final long j11) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.7w
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0H(str, j10, j11);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(String str, long j10, long j11) {
        ((C8D) AbstractC09264a.A0f(this.A01)).ACP(str, j10, j11);
    }

    public final void A0I(final boolean z10) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.80
                @Override // java.lang.Runnable
                public final void run() {
                    this.A00.A0J(z10);
                }
            });
        }
    }

    public final /* synthetic */ void A0J(boolean z10) {
        ((C8D) AbstractC09264a.A0f(this.A01)).AFF(z10);
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A0K(final byte[] bArr, final long j10) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.89
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }
}
