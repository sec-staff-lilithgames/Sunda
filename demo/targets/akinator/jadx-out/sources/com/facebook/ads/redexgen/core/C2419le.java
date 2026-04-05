package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.le, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2419le implements InterfaceC1173Ed {
    public final int A00;

    public C2419le() {
        this(-1);
    }

    public C2419le(int i10) {
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1173Ed
    public final int A8R(int i10) {
        if (this.A00 == -1) {
            if (i10 == 7) {
                return 6;
            }
            return 3;
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1173Ed
    public final long A8m(C1172Ec c1172Ec) {
        IOException iOException = c1172Ec.A03;
        if ((iOException instanceof C08822i) || (iOException instanceof FileNotFoundException) || (iOException instanceof C10509h) || (iOException instanceof C1183En) || C09514z.A00(iOException)) {
            return C.TIME_UNSET;
        }
        return Math.min((c1172Ec.A00 - 1) * 1000, 5000);
    }
}
