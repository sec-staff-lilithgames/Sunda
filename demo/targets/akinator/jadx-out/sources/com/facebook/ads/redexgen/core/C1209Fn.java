package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.Fn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1209Fn {
    public final Handler A00;
    public final InterfaceC1210Fo A01;

    public C1209Fn(Handler handler, InterfaceC1210Fo interfaceC1210Fo) {
        this.A00 = interfaceC1210Fo != null ? (Handler) C3M.A01(handler) : null;
        this.A01 = interfaceC1210Fo;
    }

    public final void A00(final int i10, final long j10) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fj
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A02(i10, j10);
                }
            });
        }
    }

    public final void A01(final int i10, final long j10) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fa
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A03(i10, j10);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i10, long j10) {
        ((InterfaceC1210Fo) AbstractC09264a.A0f(this.A01)).ACr(i10, j10);
    }

    public final /* synthetic */ void A03(int i10, long j10) {
        ((InterfaceC1210Fo) AbstractC09264a.A0f(this.A01)).AD7(i10, j10);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A04(int i10, C2614or c2614or) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC1208Fm(this, i10, c2614or));
        }
    }

    public final void A05(final C2614or c2614or, final C09615j c09615j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fg
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A06(c2614or, c09615j);
                }
            });
        }
    }

    public final /* synthetic */ void A06(C2614or c2614or, C09615j c09615j) {
        ((InterfaceC1210Fo) AbstractC09264a.A0f(this.A01)).AFk(c2614or);
        ((InterfaceC1210Fo) AbstractC09264a.A0f(this.A01)).AFl(c2614or, c09615j);
    }

    public final void A07(final C2567o4 c2567o4) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fi
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A08(c2567o4);
                }
            });
        }
    }

    public final /* synthetic */ void A08(C2567o4 c2567o4) {
        ((InterfaceC1210Fo) AbstractC09264a.A0f(this.A01)).AFr(c2567o4);
    }

    public final void A09(final C09585g c09585g) {
        c09585g.A02();
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fk
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0B(c09585g);
                }
            });
        }
    }

    public final void A0A(final C09585g c09585g) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fe
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0C(c09585g);
                }
            });
        }
    }

    public final /* synthetic */ void A0B(C09585g c09585g) {
        c09585g.A02();
        ((InterfaceC1210Fo) AbstractC09264a.A0f(this.A01)).AFe(c09585g);
    }

    public final /* synthetic */ void A0C(C09585g c09585g) {
        ((InterfaceC1210Fo) AbstractC09264a.A0f(this.A01)).AFf(c09585g);
    }

    public final void A0D(final Object obj) {
        if (this.A00 != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Ff
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0E(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(Object obj, long j10) {
        ((InterfaceC1210Fo) AbstractC09264a.A0f(this.A01)).AEx(obj, j10);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A0F(final String str) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fh
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0G(final String str, final long j10, final long j11) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fd
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0H(str, j10, j11);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(String str, long j10, long j11) {
        ((InterfaceC1210Fo) AbstractC09264a.A0f(this.A01)).AFd(str, j10, j11);
    }
}
