package com.vungle.ads.internal.network;

import android.os.Build;
import com.vungle.ads.BuildConfig;
import h2.rl.UeklptUrP;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VungleHeader {
    public static final VungleHeader INSTANCE;
    private static String appId;
    private static String appVersion;
    private static String headerUa;

    static {
        VungleHeader vungleHeader = new VungleHeader();
        INSTANCE = vungleHeader;
        headerUa = vungleHeader.defaultHeader();
    }

    private VungleHeader() {
    }

    public final String getAppId() {
        return appId;
    }

    public final String getAppVersion() {
        return appVersion;
    }

    public final String getHeaderUa() {
        return headerUa;
    }

    public final void reset() {
        headerUa = defaultHeader();
    }

    public final void setAppId(String str) {
        appId = str;
    }

    public final void setAppVersion(String str) {
        appVersion = str;
    }

    public final void setHeaderUa(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        headerUa = str;
    }

    private final String defaultHeader() {
        return (e0.areEqual("Amazon", Build.MANUFACTURER) ? "VungleAmazon/" : UeklptUrP.oEzvVAGcCnHsM).concat(BuildConfig.VERSION_NAME);
    }
}
