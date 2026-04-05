package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC3368o0;
import com.ironsource.D0;
import com.ironsource.mediationsdk.logger.IronLog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.fc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3217fc extends AbstractC3368o0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3217fc(C3350n0 adTools, C3235gc adUnitData, InterfaceC3253hc listener) {
        String strM;
        int iB;
        super(adTools, adUnitData, listener, null, 8, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        C3325ld c3325ldG = g();
        IronLog.INTERNAL.verbose("placement = " + c3325ldG);
        if (c3325ldG == null || TextUtils.isEmpty(c3325ldG.c())) {
            strM = b0.e2.m("can't load native ad - %s", "format(format, *args)", 1, new Object[]{c3325ldG == null ? "placement is null" : "placement name is empty"});
            iB = C3554z0.b(adUnitData.b().a());
        } else {
            strM = null;
            iB = 510;
        }
        if (strM != null) {
            IronLog.API.error(a(strM));
            a(iB, strM);
        }
    }

    @Override // com.ironsource.AbstractC3368o0
    public C a() {
        return new ah(this, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC3553z a(C3217fc this$0, A adInstanceData, G adInstancePayload) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstanceData, "adInstanceData");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        return new Xb(new V0(this$0.f(), D0.b.PROVIDER), adInstanceData, adInstancePayload, new AbstractC3368o0.a());
    }
}
