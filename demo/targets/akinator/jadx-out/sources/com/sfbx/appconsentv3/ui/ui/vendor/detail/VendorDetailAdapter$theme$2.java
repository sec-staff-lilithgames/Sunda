package com.sfbx.appconsentv3.ui.ui.vendor.detail;

import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.di.UIInjector;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VendorDetailAdapter$theme$2 extends f0 implements kv.a {
    public static final VendorDetailAdapter$theme$2 INSTANCE = new VendorDetailAdapter$theme$2();

    public VendorDetailAdapter$theme$2() {
        super(0);
    }

    @Override // kv.a
    public final AppConsentTheme invoke() {
        return UIInjector.INSTANCE.provideAppConsentTheme();
    }
}
