package com.vungle.ads.internal.util;

import android.content.Context;
import android.os.Build;
import android.webkit.URLUtil;
import gv.p;
import gv.s;
import java.io.File;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Utils {
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    private final long getFolderSize(File file) {
        long length = 0;
        if (file.exists()) {
            for (File file2 : p.walkTopDown(file)) {
                if (file2.isFile()) {
                    length = file2.length() + length;
                }
            }
        }
        return length;
    }

    public final long getWebViewDataSize(Context context) {
        e0.checkNotNullParameter(context, "context");
        try {
            File file = new File(context.getApplicationInfo().dataDir, "app_webview");
            folderSize = file.exists() ? getFolderSize(file) : 0L;
            File cacheDir = context.getCacheDir();
            if (!cacheDir.exists()) {
                return folderSize;
            }
            e0.checkNotNullExpressionValue(cacheDir, "cacheDir");
            return folderSize + getFolderSize(s.resolve(cacheDir, "webviewCache"));
        } catch (Exception e10) {
            Logger.Companion.e("WebViewSize", "Error reading WebView data size: " + e10.getMessage());
            return folderSize;
        }
    }

    public final boolean isOSVersionInvalid() {
        return Build.VERSION.SDK_INT < 25;
    }

    public final boolean isUrlValid(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str);
    }
}
