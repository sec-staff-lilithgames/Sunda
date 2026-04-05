package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Nl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1413Nl {

    @Nullable
    public static HandlerC1412Nk A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static HandlerC1412Nk A00(C1911cu c1911cu) {
        if (A00 == null) {
            A00 = new HandlerC1412Nk(c1911cu);
        }
        return A00;
    }

    public static void A01(C1911cu c1911cu) {
        if (UA.A0F(c1911cu)) {
            A03(c1911cu);
        }
    }

    public static void A02(C1911cu c1911cu) {
        if (UA.A0E(c1911cu)) {
            A03(c1911cu);
        }
    }

    public static void A03(C1911cu c1911cu) {
        if (A01.compareAndSet(false, true)) {
            XJ.A01.execute(new C2147go(c1911cu));
        }
    }
}
