package com.sfbx.appconsent.core.proxy;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.webkit.CookieManager;
import com.sfbx.appconsent.core.proxy.WebViewProxyResult;
import io.sfbx.appconsent.logger.ACLogger;
import io.sfbx.appconsent.logger.ACLoggerContract;
import k6.v;
import kotlin.jvm.internal.e0;
import sv.n0;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class WebViewProxy {
    public static final WebViewProxy INSTANCE = new WebViewProxy();
    private static final String tag = "WebViewProxy";
    private static boolean isFirstVerification = true;

    private WebViewProxy() {
    }

    private final void forceToCheckIfWebViewComponentIsPresentOnDevice() {
        CookieManager.getInstance();
    }

    private final PackageInfo getPackageInfoCompat(PackageManager packageManager, String str, int i10) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = packageManager.getPackageInfo(str, i10);
        e0.checkNotNullExpressionValue(packageInfo, "getPackageInfo(packageName, flags)");
        return packageInfo;
    }

    public static /* synthetic */ PackageInfo getPackageInfoCompat$default(WebViewProxy webViewProxy, PackageManager packageManager, String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return webViewProxy.getPackageInfoCompat(packageManager, str, i10);
    }

    private final PackageInfo getPackageInfoFromWebviewPackageName(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            e0.checkNotNullExpressionValue(packageManager, "context.packageManager");
            return getPackageInfoCompat$default(this, packageManager, str, 0, 2, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private final PackageInfo getWebViewPackageName(Context context) {
        PackageInfo packageInfoFromWebviewPackageName;
        int lastIndex = k0.getLastIndex(WebViewProxyKt.webviewPackages);
        int i10 = 0;
        while (true) {
            packageInfoFromWebviewPackageName = getPackageInfoFromWebviewPackageName(context, WebViewProxyKt.webviewPackages[i10]);
            int i11 = i10 + 1;
            if (i10 >= lastIndex || packageInfoFromWebviewPackageName != null) {
                break;
            }
            i10 = i11;
        }
        return packageInfoFromWebviewPackageName;
    }

    private final PackageInfo getWebViewPackageNameWithCompat(Context context) {
        try {
            return v.getCurrentWebViewPackage(context);
        } catch (Throwable unused) {
            return null;
        }
    }

    private final boolean isDeviceSupportWebViewUsage(Context context) {
        return context.getPackageManager().hasSystemFeature("android.software.webview");
    }

    private final boolean isErrorMessageContainsWebViewInformation(String str) {
        return n0.contains((CharSequence) str, (CharSequence) "MissingWebViewPackageException", true) || n0.contains((CharSequence) str, (CharSequence) "No WebView installed", true) || n0.contains((CharSequence) str, (CharSequence) "Failed to load WebView provider", true) || n0.contains((CharSequence) str, (CharSequence) "WebView", true);
    }

    private final WebViewProxyResult isWebViewAvailableOnDevice(Context context) {
        if (context.getPackageManager() == null) {
            return WebViewProxyResult.ErrorPackageManagerNotAvailable.INSTANCE;
        }
        if (!isDeviceSupportWebViewUsage(context)) {
            return WebViewProxyResult.ErrorFeatureNotPresent.INSTANCE;
        }
        if ((Build.VERSION.SDK_INT >= 26 ? getWebViewPackageNameWithCompat(context) : getWebViewPackageName(context)) == null) {
            if (isFirstVerification) {
                isFirstVerification = false;
                return WebViewProxyResult.ErrorPackageNotPresent.INSTANCE;
            }
            try {
                forceToCheckIfWebViewComponentIsPresentOnDevice();
            } catch (Throwable th2) {
                try {
                    return new WebViewProxyResult.ErrorInstanceNotAvailable(th2);
                } finally {
                    isFirstVerification = true;
                }
            }
        }
        return WebViewProxyResult.Success.INSTANCE;
    }

    private final void onWebViewComponentCheckingError(Throwable th2) {
        String message = th2.getMessage();
        if (message == null || !isErrorMessageContainsWebViewInformation(message)) {
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag2 = tag;
            e0.checkNotNullExpressionValue(tag2, "tag");
            aCLogger.e(tag2, "An unknown error has been thrown when trying to check System WebView Component", th2);
            return;
        }
        ACLogger aCLogger2 = ACLogger.INSTANCE;
        String tag3 = tag;
        e0.checkNotNullExpressionValue(tag3, "tag");
        aCLogger2.e(tag3, "Your System Webview Component is not reachable / enable / up-to-date / or no provider available", th2);
    }

    public final boolean isWebViewComponentIsAvailable(Context context) {
        e0.checkNotNullParameter(context, "context");
        WebViewProxyResult webViewProxyResultIsWebViewAvailableOnDevice = isWebViewAvailableOnDevice(context);
        if (!(webViewProxyResultIsWebViewAvailableOnDevice instanceof WebViewProxyResult.Error)) {
            return true;
        }
        ACLogger aCLogger = ACLogger.INSTANCE;
        String tag2 = tag;
        e0.checkNotNullExpressionValue(tag2, "tag");
        WebViewProxyResult.Error error = (WebViewProxyResult.Error) webViewProxyResultIsWebViewAvailableOnDevice;
        ACLoggerContract.DefaultImpls.w$default(aCLogger, tag2, error.getErrorMessage(), null, 4, null);
        Throwable throwable = error.getThrowable();
        if (throwable == null) {
            return false;
        }
        INSTANCE.onWebViewComponentCheckingError(throwable);
        return false;
    }

    public final void reset$appconsent_core_prodXchangeRelease() {
        isFirstVerification = true;
    }
}
