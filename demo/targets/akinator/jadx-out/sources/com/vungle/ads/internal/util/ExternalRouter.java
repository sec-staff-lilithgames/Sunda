package com.vungle.ads.internal.util;

import a.b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vungle.ads.LinkError;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import com.vungle.ads.internal.util.Logger;
import java.net.URISyntaxException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ExternalRouter {
    public static final ExternalRouter INSTANCE = new ExternalRouter();
    private static final String TAG = "ExternalRouter";

    private ExternalRouter() {
    }

    private final Intent getIntentFromUrl(String str, boolean z10) throws URISyntaxException {
        Intent uri = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    uri = Intent.parseUri(str, 0);
                }
            } catch (URISyntaxException e10) {
                Logger.Companion.e(TAG, "url format is not correct " + e10.getLocalizedMessage());
            }
        }
        if (uri != null && z10) {
            uri.setFlags(268435456);
            return uri;
        }
        return uri;
    }

    public static final boolean launch(String str, String str2, Context context, LogEntry logEntry, PresenterAdOpenCallback presenterAdOpenCallback) {
        e0.checkNotNullParameter(context, "context");
        if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
            boolean z10 = !(context instanceof Activity);
            try {
                ExternalRouter externalRouter = INSTANCE;
                return ActivityManager.Companion.startWhenForeground(context, externalRouter.getIntentFromUrl(str, z10), externalRouter.getIntentFromUrl(str2, z10), presenterAdOpenCallback);
            } catch (Exception e10) {
                if (str == null || str.length() == 0) {
                    new LinkError(Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED, b.k("Fail to open ", str2)).setLogEntry$vungle_ads_release(logEntry).logErrorNoReturnValue$vungle_ads_release();
                } else {
                    new LinkError(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED, b.k("Fail to open ", str)).setLogEntry$vungle_ads_release(logEntry).logErrorNoReturnValue$vungle_ads_release();
                }
                Logger.Companion companion = Logger.Companion;
                companion.e(TAG, "Error while opening url" + e10.getLocalizedMessage());
                companion.d(TAG, "Cannot open url " + str2);
            }
        }
        return false;
    }

    public static /* synthetic */ boolean launch$default(String str, String str2, Context context, LogEntry logEntry, PresenterAdOpenCallback presenterAdOpenCallback, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            logEntry = null;
        }
        if ((i10 & 16) != 0) {
            presenterAdOpenCallback = null;
        }
        return launch(str, str2, context, logEntry, presenterAdOpenCallback);
    }
}
