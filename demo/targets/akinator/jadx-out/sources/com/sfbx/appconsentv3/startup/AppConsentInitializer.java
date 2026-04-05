package com.sfbx.appconsentv3.startup;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.webkit.WebView;
import c6.b;
import com.sfbx.appconsent.core.startup.ACContext;
import com.sfbx.appconsentv3.ui.AppConsentSDK;
import io.sfbx.appconsent.logger.ACLogger;
import java.util.List;
import kotlin.jvm.internal.e0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppConsentInitializer implements b {
    @Override // c6.b
    public List dependencies() {
        return p0.emptyList();
    }

    @Override // c6.b
    public AppConsentInitializer create(Context context) {
        e0.checkNotNullParameter(context, "context");
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                String processName = Application.getProcessName();
                String packageName = context.getPackageName();
                if (packageName.equals(processName)) {
                    WebView.setDataDirectorySuffix(packageName);
                } else {
                    WebView.setDataDirectorySuffix(processName);
                }
            }
        } catch (Exception e10) {
            ACLogger aCLogger = ACLogger.INSTANCE;
            e0.checkNotNullExpressionValue("AppConsentInitializer", "tag");
            aCLogger.e("AppConsentInitializer", "\nUnable to define data directory suffix to WebView component.\n***********************************************************************************************************\n* Caused by: java.lang.RuntimeException:                                                                  *\n* Using WebView from more than one process at once with the same data directory is not supported.         *\n* https://crbug.com/558377 : Current process xx.xxx.xxxx (pid aaaaa), lock owner\"yy.yyy.yyyy (pid bbbbb)\" *\n***********************************************************************************************************\nIf you encounter the above error, please define it by your own. We can't detect or manage it without impact your application.\n\nAdd this line before using your WebView: WebView.setDataDirectorySuffix(\"uniqueSuffix\").\n", e10);
        }
        ACContext.INSTANCE.injectAsACContext(context);
        AppConsentSDK.Companion.initializingByStartUpRuntime$appconsent_ui_v3_prodXchangeRelease();
        return this;
    }
}
