package com.facebook.ads.redexgen.core;

import android.os.Looper;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.ms, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2494ms implements C9U {
    @Override // com.facebook.ads.redexgen.core.C9U
    public final /* synthetic */ C9T AGJ(C9P c9p, C2614or c2614or) {
        return C9R.A00(this, c9p, c2614or);
    }

    @Override // com.facebook.ads.redexgen.core.C9U
    public final /* synthetic */ void AGK() {
    }

    @Override // com.facebook.ads.redexgen.core.C9U
    public final C9G A34(C9P c9p, C2614or c2614or) {
        if (c2614or.A0O == null) {
            return null;
        }
        final int i10 = 1;
        return new C2492mq(new C9E(new Exception(i10) { // from class: com.facebook.ads.redexgen.X.9z
            public final int A00;

            {
                this.A00 = i10;
            }
        }, AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }

    @Override // com.facebook.ads.redexgen.core.C9U
    public final int A7O(C2614or c2614or) {
        return c2614or.A0O != null ? 1 : 0;
    }

    @Override // com.facebook.ads.redexgen.core.C9U
    public final void AIu(Looper looper, C10167m c10167m) {
    }
}
