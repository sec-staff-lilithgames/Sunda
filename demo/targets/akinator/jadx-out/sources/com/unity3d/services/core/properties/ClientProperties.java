package com.unity3d.services.core.properties;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.core.log.DeviceLog;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ClientProperties {
    private static final X500Principal DEBUG_CERT = new X500Principal("CN=Android Debug,O=Android,C=US");
    private static WeakReference<Activity> _activity;
    private static Application _application;
    private static Context _applicationContext;
    private static String _gameId;
    private static String _previousGameId;

    public static Activity getActivity() {
        return _activity.get();
    }

    public static String getAppName() {
        Context context = _applicationContext;
        return context == null ? "" : context.getPackageName();
    }

    public static String getAppVersion() {
        String packageName = getApplicationContext().getPackageName();
        PackageManager packageManager = getApplicationContext().getPackageManager();
        try {
            return packageManager.getPackageInfo(packageName, 0).versionName == null ? AndroidStaticDeviceInfoDataSource.APP_VERSION_FAKE : packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            DeviceLog.exception("Error getting package info", e10);
            return null;
        }
    }

    public static Application getApplication() {
        return _application;
    }

    public static Context getApplicationContext() {
        return _applicationContext;
    }

    public static String getGameId() {
        return _gameId;
    }

    public static String getPreviousGameId() {
        return _previousGameId;
    }

    public static boolean isAppDebuggable() throws PackageManager.NameNotFoundException {
        boolean zEquals;
        if (getApplicationContext() == null) {
            return false;
        }
        PackageManager packageManager = getApplicationContext().getPackageManager();
        String packageName = getApplicationContext().getPackageName();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            int i10 = applicationInfo.flags & 2;
            applicationInfo.flags = i10;
            zEquals = i10 != 0;
            z = false;
        } catch (PackageManager.NameNotFoundException e10) {
            DeviceLog.exception("Could not find name", e10);
            zEquals = false;
        }
        if (z) {
            try {
                for (Signature signature : packageManager.getPackageInfo(packageName, 64).signatures) {
                    zEquals = ((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signature.toByteArray()))).getSubjectX500Principal().equals(DEBUG_CERT);
                    if (zEquals) {
                        break;
                    }
                }
            } catch (PackageManager.NameNotFoundException e11) {
                DeviceLog.exception("Could not find name", e11);
            } catch (CertificateException e12) {
                DeviceLog.exception("Certificate exception", e12);
            }
        }
        return zEquals;
    }

    public static void setActivity(Activity activity) {
        _activity = new WeakReference<>(activity);
    }

    public static void setApplication(Application application) {
        _application = application;
    }

    public static void setApplicationContext(Context context) {
        _applicationContext = context;
    }

    public static void setGameId(String str) {
        _previousGameId = _gameId;
        _gameId = str;
    }
}
