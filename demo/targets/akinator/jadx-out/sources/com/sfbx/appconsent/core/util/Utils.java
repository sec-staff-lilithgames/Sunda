package com.sfbx.appconsent.core.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import b0.e2;
import com.sfbx.appconsent.core.BuildConfig;
import i2.hQ.aTNDubNmpwAqdU;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Utils {
    public static final Utils INSTANCE = new Utils();
    private static String userAgent = "";
    private static String clientOrigin = "";

    private Utils() {
    }

    private final void initClientOrigin(Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        clientOrigin = packageInfo.packageName + AbstractJsonLexerKt.COLON + packageInfo.versionName;
    }

    public final String getClientOrigin() {
        return clientOrigin;
    }

    public final String getUserAgent() {
        return userAgent;
    }

    public final void init(Context context) throws PackageManager.NameNotFoundException {
        e0.checkNotNullParameter(context, "context");
        initClientOrigin(context);
        initUserAgent();
    }

    private final void initUserAgent() {
        userAgent = e2.m("%s/%s (Android %s; %s %s)", aTNDubNmpwAqdU.TkvWaRCRbx, 5, new Object[]{BuildConfig.PRODUCT, getClientOrigin(), Build.VERSION.RELEASE, Build.BRAND, Build.MODEL});
    }
}
