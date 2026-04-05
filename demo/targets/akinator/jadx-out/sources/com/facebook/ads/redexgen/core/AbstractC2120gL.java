package com.facebook.ads.redexgen.core;

import com.facebook.debug.log.BLogLevelCallback;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.gL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2120gL {
    public static volatile InterfaceC2113gE A02 = C08661q.A00();
    public static volatile boolean A03 = false;
    public static boolean A00 = false;
    public static final List<BLogLevelCallback> A01 = new ArrayList();

    static {
        A02.AIo(5);
        AbstractC2112gD.A00(A02);
    }

    public static void A00(@Nullable String str, String str2) {
        if (A02.AAP(4)) {
            A02.A9l(str, str2);
        }
    }

    public static void A01(@Nullable String str, String str2, Object obj) {
        if (A02.AAP(4)) {
            A00(str, AbstractC2115gG.A0J(str2, obj));
        }
    }

    public static void A02(@Nullable String str, String str2, Throwable th2) {
        if (A02.AAP(4)) {
            A02.A9m(str, str2, th2);
        }
    }
}
