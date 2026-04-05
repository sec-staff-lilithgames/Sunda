package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.ox, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2619ox implements InterfaceC08992z {
    public final C2583oL A00 = new C2583oL();

    @MetaExoPlayerCustomization("Should be final")
    public abstract void A0H(int i10, long j10);

    public final int A00() {
        long jA6z = A6z();
        long jA7k = A7k();
        if (jA6z == C.TIME_UNSET || jA7k == C.TIME_UNSET) {
            return 0;
        }
        if (jA7k == 0) {
            return 100;
        }
        return AbstractC09264a.A07((int) ((100 * jA6z) / jA7k), 0, 100);
    }

    public void A01() {
        AJV(false);
    }

    public final void A02() {
        A03(A7Z());
    }

    public final void A03(int i10) {
        A0H(i10, C.TIME_UNSET);
    }

    public final void A04(long j10) {
        A0H(A7Z(), j10);
    }
}
