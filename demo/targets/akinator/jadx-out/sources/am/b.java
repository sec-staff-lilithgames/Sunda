package am;

import android.content.Context;
import io.bidmachine.AdsFormat;
import zl.l;
import zl.s;
import zl.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface b {
    t createAd(l lVar, AdsFormat adsFormat, s sVar);

    int getMinDeviceApiVersion();

    vr.a getVersion() throws Throwable;

    vr.a getVersionForWhichCompiled();

    void initialize(Context context) throws Throwable;

    boolean isGAMPresent(Context context);
}
