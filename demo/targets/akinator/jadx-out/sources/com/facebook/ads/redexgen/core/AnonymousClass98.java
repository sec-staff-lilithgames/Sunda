package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.98, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass98 extends AbstractC2468mS implements InterfaceC1124Cg {
    public long A00;
    public C5H A01;
    public InterfaceC2290jM<InterfaceExecutorC1195Ez> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final C2Q A07;
    public final C2605oi A08;
    public final InterfaceC09484w A09;
    public final C9U A0A;
    public final InterfaceC1118Ca A0B;
    public final InterfaceC1173Ed A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jM != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public AnonymousClass98(C2605oi c2605oi, InterfaceC09484w interfaceC09484w, InterfaceC1118Ca interfaceC1118Ca, C9U c9u, InterfaceC1173Ed interfaceC1173Ed, int i10, InterfaceC2290jM<InterfaceExecutorC1195Ez> interfaceC2290jM) {
        this.A07 = (C2Q) C3M.A01(c2605oi.A03);
        this.A08 = c2605oi;
        this.A09 = interfaceC09484w;
        this.A0B = interfaceC1118Ca;
        this.A0A = c9u == null ? C9U.A00 : c9u;
        this.A0C = interfaceC1173Ed;
        this.A06 = i10;
        this.A04 = true;
        this.A00 = C.TIME_UNSET;
        this.A02 = interfaceC2290jM;
    }

    private void A00() {
        final Timeline anonymousClass97 = new AnonymousClass97(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C9C(anonymousClass97) { // from class: com.facebook.ads.redexgen.X.12
                @Override // com.facebook.ads.redexgen.core.C9C, com.facebook.ads.androidx.media3.common.Timeline
                public final C2585oN A0I(int i10, C2585oN c2585oN, boolean z10) {
                    super.A0I(i10, c2585oN, z10);
                    c2585oN.A05 = true;
                    return c2585oN;
                }

                @Override // com.facebook.ads.redexgen.core.C9C, com.facebook.ads.androidx.media3.common.Timeline
                public final C2583oL A0L(int i10, C2583oL c2583oL, long j10) {
                    super.A0L(i10, c2583oL, j10);
                    c2583oL.A0F = true;
                    return c2583oL;
                }
            };
            anonymousClass97 = timeline;
        }
        A05(anonymousClass97);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2468mS
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2468mS
    public final void A0A(C5H c5h) {
        this.A01 = c5h;
        this.A0A.AGK();
        this.A0A.AIu((Looper) C3M.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.CL
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC2462mM A5O(C2461mL c2461mL, EO eo2, long j10) {
        InterfaceExecutorC1195Ez interfaceExecutorC1195Ez;
        InterfaceC2549nl interfaceC2549nlA5A = this.A09.A5A();
        if (this.A01 != null) {
            interfaceC2549nlA5A.A3v(this.A01);
        }
        Uri uri = this.A07.A00;
        InterfaceC1119Cb interfaceC1119CbA5P = this.A0B.A5P(C10167m.A03);
        C9U c9u = this.A0A;
        C9P c9pA01 = A01(c2461mL);
        InterfaceC1173Ed interfaceC1173Ed = this.A0C;
        CW cwA02 = A02(c2461mL);
        String str = this.A07.A04;
        int i10 = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC1195Ez = this.A02.get();
        } else {
            interfaceExecutorC1195Ez = null;
        }
        return new C9A(uri, interfaceC2549nlA5A, interfaceC1119CbA5P, c9u, c9pA01, interfaceC1173Ed, cwA02, this, eo2, str, i10, interfaceExecutorC1195Ez);
    }

    @Override // com.facebook.ads.redexgen.core.CL
    public final void ABu() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1124Cg
    public final void AFH(long j10, boolean z10, boolean z11) {
        if (j10 == C.TIME_UNSET) {
            j10 = this.A00;
        }
        if (!this.A04 && this.A00 == j10 && this.A05 == z10 && this.A03 == z11) {
            return;
        }
        this.A00 = j10;
        this.A05 = z10;
        this.A03 = z11;
        this.A04 = false;
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.CL
    public final void AH0(InterfaceC2462mM interfaceC2462mM) {
        ((C9A) interfaceC2462mM).A0a();
    }
}
