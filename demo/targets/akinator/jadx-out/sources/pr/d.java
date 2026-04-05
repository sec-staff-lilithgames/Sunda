package pr;

import android.bluetooth.BluetoothAdapter;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.applovin.sdk.AppLovinEventTypes;
import com.explorestack.protobuf.adcom.ConnectionStatus;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class d {
    public static String a(Context context, String str) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr.length == 0) {
                return null;
            }
            return nm.j.toSignatureHexString(MessageDigest.getInstance(str).digest(signatureArr[0].toByteArray()));
        } catch (Throwable th2) {
            nm.a.w(th2);
            return null;
        }
    }

    public static Double getBatteryLevel(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            Intent intentRegisterReceiver = Build.VERSION.SDK_INT >= 34 ? context.registerReceiver(null, intentFilter, 4) : context.registerReceiver(null, intentFilter);
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (intExtra >= 0 && intExtra2 > 0) {
                    return Double.valueOf(Math.round((intExtra / intExtra2) * 100.0d) / 100.0d);
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String getBuildId() {
        return Build.ID;
    }

    public static ConnectionType getConnectionType(Context context) {
        NetworkInfo activeNetworkInfo = nm.j.getActiveNetworkInfo(context);
        if (activeNetworkInfo == null) {
            return ConnectionType.CONNECTION_TYPE_INVALID;
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            return type != 1 ? type != 9 ? ConnectionType.CONNECTION_TYPE_INVALID : ConnectionType.CONNECTION_TYPE_ETHERNET : ConnectionType.CONNECTION_TYPE_WIFI;
        }
        switch (activeNetworkInfo.getSubtype()) {
        }
        return ConnectionType.CONNECTION_TYPE_INVALID;
    }

    public static String getDeviceName(Context context) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            String string = Settings.Global.getString(contentResolver, "device_name");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            String string2 = Settings.Secure.getString(contentResolver, "bluetooth_name");
            if (!TextUtils.isEmpty(string2)) {
                return string2;
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (!nm.j.isPermissionGranted(context, "android.permission.BLUETOOTH_CONNECT") || defaultAdapter == null) {
                return null;
            }
            return defaultAdapter.getName();
        } catch (Exception unused) {
            return null;
        }
    }

    public static DisplayMetrics getDisplayMetrics(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    public static Set<String> getInputLanguageSet(Context context) {
        HashSet hashSet = new HashSet();
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (inputMethodManager != null) {
                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                while (it.hasNext()) {
                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                        if (inputMethodSubtype.getMode().equals("keyboard")) {
                            String languageTag = inputMethodSubtype.getLanguageTag();
                            if (TextUtils.isEmpty(languageTag)) {
                                languageTag = inputMethodSubtype.getLocale();
                            }
                            if (!TextUtils.isEmpty(languageTag)) {
                                int iIndexOf = languageTag.indexOf("_");
                                if (iIndexOf > 0) {
                                    languageTag = languageTag.substring(0, iIndexOf);
                                }
                                hashSet.add(languageTag);
                            }
                        }
                    }
                }
                String language = Locale.getDefault().getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    hashSet.add(language);
                }
            }
        } catch (Exception unused) {
        }
        return hashSet;
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static int getOrientation(Context context) {
        if (context != null) {
            return context.getResources().getConfiguration().orientation;
        }
        return 0;
    }

    public static String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    public static ConnectionStatus getProxyStatus(Context context) {
        ConnectivityManager connectivityManager = nm.j.getConnectivityManager(context);
        return connectivityManager == null ? ConnectionStatus.CONNECTION_STATUS_UNDEFINED : connectivityManager.getDefaultProxy() != null ? ConnectionStatus.CONNECTION_STATUS_ENABLED : ConnectionStatus.CONNECTION_STATUS_DISABLED;
    }

    public static Integer getScreenBrightness(Context context) {
        try {
            return Integer.valueOf(Settings.System.getInt(context.getContentResolver(), "screen_brightness"));
        } catch (Exception unused) {
            return null;
        }
    }

    public static Double getScreenBrightnessRatio(Context context) {
        if (getScreenBrightness(context) == null) {
            return null;
        }
        return Double.valueOf(Math.round((r4.intValue() / 255.0d) * 100.0d) / 100.0d);
    }

    public static int getScreenDpi(Context context) {
        return getDisplayMetrics(context).densityDpi;
    }

    public static String getSha1Signature(Context context) {
        return a(context, AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    public static String getSha256Signature(Context context) {
        return a(context, "SHA-256");
    }

    public static ConnectionStatus getVpnStatus(Context context) {
        NetworkCapabilities activeNetworkCapabilities = nm.j.getActiveNetworkCapabilities(context);
        return activeNetworkCapabilities == null ? ConnectionStatus.CONNECTION_STATUS_UNDEFINED : activeNetworkCapabilities.hasTransport(4) ? ConnectionStatus.CONNECTION_STATUS_ENABLED : ConnectionStatus.CONNECTION_STATUS_DISABLED;
    }

    public static Boolean isAirplaneModeOn(Context context) {
        try {
            return Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on") != 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Boolean isBatterySaverEnabled(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            return Boolean.valueOf(powerManager.isPowerSaveMode());
        }
        return null;
    }

    public static Boolean isCharging(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            Intent intentRegisterReceiver = Build.VERSION.SDK_INT >= 34 ? context.registerReceiver(null, intentFilter, 4) : context.registerReceiver(null, intentFilter);
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("plugged", -1);
                boolean z10 = true;
                if (intExtra != 1 && intExtra != 2 && intExtra != 4) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static boolean isDarkModeEnabled(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static Boolean isDoNotDisturbOn(Context context) {
        try {
            return Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "zen_mode") != 0);
        } catch (Exception unused) {
            return null;
        }
    }
}
