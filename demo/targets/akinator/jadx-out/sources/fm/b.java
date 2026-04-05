package fm;

import android.content.Context;
import em.j0;
import em.l0;
import em.u;
import em.w;
import io.bidmachine.AdsFormat;
import io.bidmachine.protobuf.Waterfall;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface b {
    u createAd(j0 j0Var, l0 l0Var, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, w wVar);

    int getMinDeviceApiVersion();

    vr.a getVersion() throws Throwable;

    vr.a getVersionForWhichCompiled();

    void initialize(Context context) throws Throwable;

    boolean isGAMPresent(Context context);
}
