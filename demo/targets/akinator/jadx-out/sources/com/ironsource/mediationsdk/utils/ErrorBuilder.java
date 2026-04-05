package com.ironsource.mediationsdk.utils;

import a.b;
import android.text.TextUtils;
import b3.h;
import com.ironsource.mediationsdk.logger.IronSourceError;
import e3.g;
import j1.o2;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class ErrorBuilder {
    private static IronSourceError a() {
        return buildGenericError("Mediation - wrong configuration");
    }

    public static IronSourceError adContainerIsNull(String str) {
        return new IronSourceError(617, o2.l(str, " banner container is null"));
    }

    public static IronSourceError buildCappedPerPlacementError(String str) {
        return new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, str);
    }

    public static IronSourceError buildCappedPerSessionError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CAPPED_PER_SESSION, o2.l(str, " Show Fail - Networks have reached their cap per session"));
    }

    public static IronSourceError buildGenericError(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "An error occurred";
        }
        return new IronSourceError(510, str);
    }

    public static IronSourceError buildInitFailedError(String str, String str2) {
        return new IronSourceError(508, TextUtils.isEmpty(str) ? o2.l(str2, " init failed due to an unknown error") : i.d(str2, " - ", str));
    }

    public static IronSourceError buildInvalidConfigurationError(String str) {
        return new IronSourceError(501, b.l("", str, " Init Fail - Configurations from the server are not valid"));
    }

    public static IronSourceError buildInvalidCredentialsError(String str, String str2, String str3) {
        StringBuilder sbB = h.b("Init Fail - ", str, " value ", str2, " is not valid");
        sbB.append(!TextUtils.isEmpty(str3) ? b.k(" - ", str3) : "");
        return new IronSourceError(506, sbB.toString());
    }

    public static IronSourceError buildInvalidKeyValueError(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return a();
        }
        StringBuilder sbO = g.o("Mediation - ", str, " value is not valid ");
        sbO.append(!TextUtils.isEmpty(str2) ? b.k(" - ", str2) : "");
        return new IronSourceError(506, sbO.toString());
    }

    public static IronSourceError buildKeyNotSetError(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return a();
        }
        return new IronSourceError(505, str3 + " Mediation - " + str + " is not set for " + str2);
    }

    public static IronSourceError buildLoadFailedError(String str, String str2, String str3) {
        String strO = o2.o(g.o("", str, " Load Fail"), TextUtils.isEmpty(str2) ? "" : b.k(" ", str2), " - ");
        if (TextUtils.isEmpty(str3)) {
            str3 = "unknown error";
        }
        return new IronSourceError(510, o2.l(strO, str3));
    }

    public static IronSourceError buildNoAdsToShowError(String str) {
        return new IronSourceError(509, o2.l(str, " Show Fail - No ads to show"));
    }

    public static IronSourceError buildNoConfigurationAvailableError(String str) {
        return new IronSourceError(501, b.l("", str, " Init Fail - Unable to retrieve configurations from the server"));
    }

    public static IronSourceError buildNoInternetConnectionInitFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, b.l("", str, " Init Fail - No Internet connection"));
    }

    public static IronSourceError buildNoInternetConnectionLoadFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, b.l("", str, " Load Fail - No Internet connection"));
    }

    public static IronSourceError buildNoInternetConnectionShowFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, b.l("", str, " Show Fail - No Internet connection"));
    }

    public static IronSourceError buildNonExistentInstanceError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, o2.l(str, " The requested instance does not exist"));
    }

    public static IronSourceError buildShowFailedError(String str, String str2) {
        return new IronSourceError(509, i.d(str, " Show Fail - ", str2));
    }

    public static IronSourceError buildUsingCachedConfigurationError(String str, String str2) {
        return new IronSourceError(502, b.m("Mediation - Unable to retrieve configurations from IronSource server, using cached configurations with appKey:", str, " and userId:", str2));
    }

    public static IronSourceError unsupportedBannerSize(String str) {
        return new IronSourceError(616, o2.l(str, " unsupported banner size"));
    }

    public static IronSourceError buildInitFailedError(String str) {
        StringBuilder sb2 = new StringBuilder("Init failed - ");
        if (TextUtils.isEmpty(str)) {
            str = "unknown error";
        }
        sb2.append(str);
        return new IronSourceError(508, sb2.toString());
    }

    public static IronSourceError buildLoadFailedError(String str) {
        return new IronSourceError(510, TextUtils.isEmpty(str) ? "Load failed due to an unknown error" : b.k("Load failed - ", str));
    }
}
