package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class YU implements InterfaceC1614Vj {
    @Override // com.facebook.ads.redexgen.core.InterfaceC1614Vj
    public final void AHp(Throwable th2, Object obj) {
        if (obj instanceof SM) {
            C1937dL adContext = ((SM) obj).A6e();
            if (adContext != null) {
                adContext.A0Q(th2);
                return;
            }
            return;
        }
        if (!(obj instanceof View)) {
            return;
        }
        Context context = ((View) obj).getContext();
        if (!(context instanceof C1937dL)) {
            return;
        }
        ((C1937dL) context).A0Q(th2);
    }
}
