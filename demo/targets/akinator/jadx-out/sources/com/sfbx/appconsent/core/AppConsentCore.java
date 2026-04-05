package com.sfbx.appconsent.core;

import android.content.Context;
import com.sfbx.appconsent.core.model.api.XChangeUserData;
import kotlin.jvm.internal.e0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppConsentCore extends AbstractAppConsentCore implements AppConsentCoreXchange {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppConsentCore(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
    }

    @Override // com.sfbx.appconsent.core.AbstractAppConsentCore
    public void firstLaunch(String appKey, boolean z10, a onReady) {
        e0.checkNotNullParameter(appKey, "appKey");
        e0.checkNotNullParameter(onReady, "onReady");
        super.firstLaunch(appKey, z10, onReady);
    }

    public final void sendXchangeData() {
        getMCore$appconsent_core_prodXchangeRelease().sendXchangeData();
    }

    @Override // com.sfbx.appconsent.core.AppConsentCoreXchange
    public void setXChangeUserData(XChangeUserData xChangeUserData) {
        getMCore$appconsent_core_prodXchangeRelease().setXChangeUserData(xChangeUserData);
    }
}
