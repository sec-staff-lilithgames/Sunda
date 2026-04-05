package ir;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Point;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.applovin.sdk.AppLovinEventTypes;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class c {
    public static final NetworkCapabilities getActiveNetworkCapabilities(Context context) {
        ConnectivityManager connectivityManager;
        e0.checkNotNullParameter(context, "<this>");
        if (!s.isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = s.getConnectivityManager(context)) == null) {
            return null;
        }
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                return null;
            }
            e0.checkNotNullExpressionValue(activeNetwork, "it.activeNetwork ?: return null");
            return connectivityManager.getNetworkCapabilities(activeNetwork);
        } catch (Throwable unused) {
            return null;
        }
    }

    @tu.f
    public static final NetworkInfo getActiveNetworkInfo(Context context) {
        ConnectivityManager connectivityManager;
        e0.checkNotNullParameter(context, "<this>");
        if (!s.isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = s.getConnectivityManager(context)) == null) {
            return null;
        }
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Double getBatteryLevel(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        try {
            Intent intentRegisterSystemReceiver = s.registerSystemReceiver(context, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterSystemReceiver == null) {
                return null;
            }
            int intExtra = intentRegisterSystemReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            int intExtra2 = intentRegisterSystemReceiver.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 <= 0) {
                return null;
            }
            return Double.valueOf(s.toRatio(Integer.valueOf(intExtra), intExtra2));
        } catch (Exception unused) {
            return null;
        }
    }

    public static final BluetoothAdapter getBluetoothAdapter(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        if (!s.isPermissionGranted(context, "android.permission.BLUETOOTH_CONNECT")) {
            return null;
        }
        try {
            if (Build.VERSION.SDK_INT < 31) {
                return BluetoothAdapter.getDefaultAdapter();
            }
            BluetoothManager bluetoothManager = s.getBluetoothManager(context);
            if (bluetoothManager != null) {
                return bluetoothManager.getAdapter();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Configuration getConfiguration(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        Configuration configuration = context.getResources().getConfiguration();
        e0.checkNotNullExpressionValue(configuration, "resources.configuration");
        return configuration;
    }

    public static final String getDeviceName(Context context) {
        String string;
        e0.checkNotNullParameter(context, "<this>");
        try {
            string = Settings.Global.getString(context.getContentResolver(), "device_name");
        } catch (Exception unused) {
        }
        if (string != null && string.length() > 0) {
            return string;
        }
        String string2 = Settings.Secure.getString(context.getContentResolver(), "bluetooth_name");
        if (string2 != null && string2.length() > 0) {
            return string2;
        }
        BluetoothAdapter bluetoothAdapter = getBluetoothAdapter(context);
        String name = bluetoothAdapter != null ? bluetoothAdapter.getName() : null;
        if (name != null) {
            if (name.length() > 0) {
                return name;
            }
        }
        return null;
    }

    public static final DisplayMetrics getDisplayMetrics(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        e0.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
        return displayMetrics;
    }

    public static final int getOrientation(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        return getConfiguration(context).orientation;
    }

    public static final String getPhoneMCCMNC(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        try {
            TelephonyManager telephonyManager = s.getTelephonyManager(context);
            String networkOperator = telephonyManager != null ? telephonyManager.getNetworkOperator() : null;
            if (networkOperator != null && networkOperator.length() >= 3) {
                StringBuilder sb2 = new StringBuilder();
                String strSubstring = networkOperator.substring(0, 3);
                e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(strSubstring);
                sb2.append('-');
                String strSubstring2 = networkOperator.substring(3);
                e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring2);
                return sb2.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final String getPhoneOperatorName(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        TelephonyManager telephonyManager = s.getTelephonyManager(context);
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperatorName();
        }
        return null;
    }

    public static final Integer getScreenBrightness(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        try {
            return Integer.valueOf(Settings.System.getInt(context.getContentResolver(), "screen_brightness"));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Double getScreenBrightnessRatio(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        Integer screenBrightness = getScreenBrightness(context);
        if (screenBrightness != null) {
            return Double.valueOf(s.toRatio(screenBrightness, 255.0d));
        }
        return null;
    }

    public static final float getScreenDensity(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        return getDisplayMetrics(context).density;
    }

    public static final int getScreenOrientation(Context context) {
        Display defaultDisplay;
        e0.checkNotNullParameter(context, "<this>");
        WindowManager windowManager = s.getWindowManager(context);
        Integer numValueOf = (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? null : Integer.valueOf(defaultDisplay.getRotation());
        int orientation = getOrientation(context);
        if (orientation == 1) {
            return ((numValueOf != null && numValueOf.intValue() == 2) || (numValueOf != null && numValueOf.intValue() == 3)) ? 9 : 1;
        }
        if (orientation != 2) {
            return 9;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return 8;
        }
        return (numValueOf != null && numValueOf.intValue() == 3) ? 8 : 0;
    }

    public static final Point getScreenSize(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = getDisplayMetrics(context);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static final Boolean isAirplaneModeOn(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        try {
            return Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on") != 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Boolean isBatterySaverEnabled(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        PowerManager powerManager = s.getPowerManager(context);
        if (powerManager != null) {
            return Boolean.valueOf(powerManager.isPowerSaveMode());
        }
        return null;
    }

    public static final Boolean isCharging(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        try {
            Intent intentRegisterSystemReceiver = s.registerSystemReceiver(context, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterSystemReceiver == null) {
                return null;
            }
            int intExtra = intentRegisterSystemReceiver.getIntExtra("plugged", -1);
            boolean z10 = true;
            if (intExtra != 1 && intExtra != 2 && intExtra != 4) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final boolean isDarkModeEnabled(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        return (getConfiguration(context).uiMode & 48) == 32;
    }

    public static final Boolean isDoNotDisturbOn(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        try {
            return Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "zen_mode") != 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean isLandscapeOrientation(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        int screenOrientation = getScreenOrientation(context);
        return screenOrientation == 0 || screenOrientation == 8 || screenOrientation == 6 || screenOrientation == 11;
    }

    public static final boolean isNetworkAvailable(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        int i10 = Build.VERSION.SDK_INT;
        NetworkCapabilities activeNetworkCapabilities = getActiveNetworkCapabilities(context);
        if (activeNetworkCapabilities == null) {
            return false;
        }
        boolean z10 = activeNetworkCapabilities.hasCapability(12) && activeNetworkCapabilities.hasCapability(16);
        return i10 >= 28 ? z10 && activeNetworkCapabilities.hasCapability(21) && activeNetworkCapabilities.hasCapability(19) : z10;
    }

    public static final Boolean isRingMuted(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        AudioManager audioManager = s.getAudioManager(context);
        if (audioManager == null) {
            return null;
        }
        int ringerMode = audioManager.getRingerMode();
        boolean z10 = true;
        if (ringerMode != 0 && ringerMode != 1) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public static final boolean isTablet(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        return b.isTablet(context);
    }
}
