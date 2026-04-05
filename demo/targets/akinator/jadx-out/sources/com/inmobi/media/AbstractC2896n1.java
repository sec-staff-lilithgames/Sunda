package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.n1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2896n1 {
    public static boolean a(Context context, String url, Sb redirectionValidator, String api, F5 f52) throws PackageManager.NameNotFoundException {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.e0.checkNotNullParameter(api, "api");
        if (f52 != null) {
            ((G5) f52).c("AppstoreLinkHandler", "In appStoreLinkHandled");
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        if (url.length() != 0) {
            Uri uri = Uri.parse(url);
            if (kotlin.jvm.internal.e0.areEqual(ApsAdWebViewSupportClient.MARKET_SCHEME, uri.getScheme()) || kotlin.jvm.internal.e0.areEqual("play.google.com", uri.getHost()) || kotlin.jvm.internal.e0.areEqual("market.android.com", uri.getHost())) {
                Uri uri2 = Uri.parse(url);
                if (context != null) {
                    try {
                        context.getPackageManager().getPackageInfo("com.android.vending", 0);
                        if (!redirectionValidator.d()) {
                            redirectionValidator.a("EX_" + api);
                            return false;
                        }
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW", uri2);
                            intent.setPackage("com.android.vending");
                            intent.addFlags(268435456);
                            context.startActivity(intent);
                            if (f52 != null) {
                                ((G5) f52).c("AppstoreLinkHandler", "Playstore link handled successfully");
                            }
                            return true;
                        } catch (Exception e10) {
                            if (f52 != null) {
                                ((G5) f52).c("AppstoreLinkHandler", Qf.a(e10, new StringBuilder("Error message in processing appStoreLinkHandling: ")));
                            }
                            return false;
                        }
                    } catch (PackageManager.NameNotFoundException e11) {
                        e11.printStackTrace();
                    }
                }
                int iA = E3.a(context, url, redirectionValidator, api, f52);
                if (iA != 0 && iA != 1) {
                    return false;
                }
                if (f52 != null) {
                    ((G5) f52).c("AppstoreLinkHandler", "Playstore link handled successfully");
                }
                return true;
            }
        }
        return false;
    }
}
