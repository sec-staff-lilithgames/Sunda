package io.odeeo.internal.g1;

import android.content.Context;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.advertisement.AdLoader;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface a {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.g1.a$a, reason: collision with other inner class name */
    public interface InterfaceC0616a {
        InterfaceC0616a appKey(String str);

        a build();

        InterfaceC0616a bundleId(String str);

        InterfaceC0616a context(Context context);
    }

    AdLoader getAdLoader();

    io.odeeo.internal.d1.h getOdeeoSDKParameters();

    io.odeeo.internal.a1.a getOmSdkAdSessionController();

    io.odeeo.internal.j1.i getPopUpImageController();

    io.odeeo.internal.o1.e geteventTrackingManagerImp();

    void inject(AdUnit adUnit);
}
