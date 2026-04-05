package com.sfbx.appconsentv3.ui.view;

import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.di.UIInjector;
import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GeolocationBannerView$theme$2 extends f0 implements a {
    public static final GeolocationBannerView$theme$2 INSTANCE = new GeolocationBannerView$theme$2();

    public GeolocationBannerView$theme$2() {
        super(0);
    }

    @Override // kv.a
    public final AppConsentTheme invoke() {
        return UIInjector.INSTANCE.provideAppConsentTheme();
    }
}
