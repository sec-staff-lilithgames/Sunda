package com.sfbx.appconsentv3.ui.ui.consentable.stack;

import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.di.UIInjector;
import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class StackHeaderAdapter$appTheme$2 extends f0 implements a {
    public static final StackHeaderAdapter$appTheme$2 INSTANCE = new StackHeaderAdapter$appTheme$2();

    public StackHeaderAdapter$appTheme$2() {
        super(0);
    }

    @Override // kv.a
    public final AppConsentTheme invoke() {
        return UIInjector.INSTANCE.provideAppConsentTheme();
    }
}
