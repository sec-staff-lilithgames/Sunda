package com.pgl.ssdk;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class aj {
    public static String a() {
        ApplicationInfo applicationInfo;
        if (Build.VERSION.SDK_INT < 26) {
            return "!version_error!";
        }
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        return (currentWebViewPackage == null || (applicationInfo = currentWebViewPackage.applicationInfo) == null) ? "!error!" : applicationInfo.publicSourceDir;
    }
}
