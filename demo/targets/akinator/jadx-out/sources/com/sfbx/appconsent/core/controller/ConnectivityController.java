package com.sfbx.appconsent.core.controller;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import io.sfbx.appconsent.logger.ACLogger;
import io.sfbx.appconsent.logger.ACLoggerContract;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConnectivityController {
    private static final String messageNoConnectivityAvailable = "Internet connection not activated";
    private final Context context;
    public static final Companion Companion = new Companion(null);
    private static final String tag = "ConnectivityController";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public ConnectivityController(Context context) {
        e0.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final boolean checkIfInternetIsAvailableOnOldDevice(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = false;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        boolean z12 = activeNetworkInfo != null && activeNetworkInfo.isAvailable();
        if (z11 && z12) {
            z10 = true;
        }
        if (!z10) {
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag2 = tag;
            e0.checkNotNullExpressionValue(tag2, "tag");
            ACLoggerContract.DefaultImpls.i$default(aCLogger, tag2, messageNoConnectivityAvailable, null, 4, null);
        }
        return z10;
    }

    private final boolean checkNetworkCapabilitiesByOSVersion(NetworkCapabilities networkCapabilities) {
        boolean z10 = false;
        if (networkCapabilities == null) {
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag2 = tag;
            e0.checkNotNullExpressionValue(tag2, "tag");
            ACLoggerContract.DefaultImpls.i$default(aCLogger, tag2, messageNoConnectivityAvailable, null, 4, null);
            return false;
        }
        if (Build.VERSION.SDK_INT < 28 ? !(!networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16)) : !(!networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16) || (!networkCapabilities.hasCapability(21) && !networkCapabilities.hasCapability(19)))) {
            z10 = true;
        }
        if (!z10) {
            ACLogger aCLogger2 = ACLogger.INSTANCE;
            String tag3 = tag;
            e0.checkNotNullExpressionValue(tag3, "tag");
            ACLoggerContract.DefaultImpls.i$default(aCLogger2, tag3, messageNoConnectivityAvailable, null, 4, null);
        }
        return z10;
    }

    private final boolean isDeviceOnline() {
        try {
            Object systemService = this.context.getSystemService("connectivity");
            e0.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            return checkNetworkCapabilitiesByOSVersion(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()));
        } catch (Exception unused) {
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag2 = tag;
            e0.checkNotNullExpressionValue(tag2, "tag");
            aCLogger.getClass();
            return false;
        }
    }

    public final boolean isConnectivityAvailable() {
        return isDeviceOnline();
    }
}
