package com.sfbx.appconsentv3.ui;

import com.sfbx.appconsentv3.AppConsent;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppConsentSDK$Companion$initialize$1 extends f0 implements l {
    final /* synthetic */ l $onReady;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppConsentSDK$Companion$initialize$1(l lVar) {
        super(1);
        this.$onReady = lVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AppConsent) obj);
        return x0.f87415a;
    }

    public final void invoke(AppConsent it) {
        e0.checkNotNullParameter(it, "it");
        AppConsentSDK.appConsent = it;
        AppConsentSDK.initialized.set(true);
        AppConsentSDK.initializing.set(false);
        AppConsentSDK.Companion.logDebug("Initialization completed");
        this.$onReady.invoke(it);
    }
}
