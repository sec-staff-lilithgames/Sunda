package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.net.Uri;
import com.moloco.sdk.internal.MolocoLogger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class g0 {
    public static final boolean b(Context context, String str) {
        try {
            androidx.browser.customtabs.z zVarBuild = new androidx.browser.customtabs.y().setUrlBarHidingEnabled(true).build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(zVarBuild, "build(...)");
            zVarBuild.f5302a.addFlags(268435456);
            zVarBuild.launchUrl(context, Uri.parse(str));
            return true;
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "Xenoss", "tryStartCustomTabs exception", e10, false, 8, null);
            return false;
        }
    }
}
