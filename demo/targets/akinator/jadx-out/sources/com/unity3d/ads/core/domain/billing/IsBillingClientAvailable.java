package com.unity3d.ads.core.domain.billing;

import com.android.billingclient.api.BillingClient;
import tu.a0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class IsBillingClientAvailable {
    public final boolean invoke() {
        Object objM7131constructorimpl;
        try {
            objM7131constructorimpl = z.m7131constructorimpl(BillingClient.class);
        } catch (Throwable th2) {
            int i10 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        return z.m7137isSuccessimpl(objM7131constructorimpl);
    }
}
