package com.sfbx.appconsentv3.ui.domain;

import bv.b;
import com.sfbx.appconsent.core.AppConsentCore;
import kotlin.jvm.internal.e0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class IsNeedToCallHelloWsUseCaseImpl implements IsNeedToCallHelloWsUseCase {
    private final AppConsentCore appConsentCore;

    public IsNeedToCallHelloWsUseCaseImpl(AppConsentCore appConsentCore) {
        e0.checkNotNullParameter(appConsentCore, "appConsentCore");
        this.appConsentCore = appConsentCore;
    }

    @Override // com.sfbx.appconsentv3.ui.domain.SimpleUseCase
    public Object invoke(d<? super Boolean> dVar) {
        return b.boxBoolean(this.appConsentCore.isNeedToCallHelloWs());
    }
}
