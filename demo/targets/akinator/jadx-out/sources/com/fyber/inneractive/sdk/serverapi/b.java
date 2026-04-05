package com.fyber.inneractive.sdk.serverapi;

import android.app.NotificationManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.ext.SdkExtensions;
import android.provider.Settings;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.p0;
import com.fyber.inneractive.sdk.config.q0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.util.o;
import com.ironsource.C3119a4;
import com.ironsource.Hc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f26681a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final List f26682b = Arrays.asList("POWER_SAVE_MODE_OPEN", "SmartModeStatus");

    public static String a(float f10) {
        return f10 < 5.0f ? "1" : f10 <= 9.0f ? "2" : f10 <= 24.0f ? "3" : f10 <= 39.0f ? "4" : f10 <= 54.0f ? CampaignEx.CLICKMODE_ON : f10 <= 69.0f ? "6" : f10 <= 84.0f ? Hc.f34588e : f10 <= 100.0f ? "8" : "";
    }

    public static String b() {
        try {
            if (o.f26796a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null) {
                return "";
            }
            return a((r1.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / r1.getIntExtra("scale", -1));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static Long c() throws NumberFormatException {
        long j10;
        x0 x0Var = IAConfigManager.O.f23229x;
        x0Var.getClass();
        try {
            String str = "";
            String str2 = (String) x0Var.f23422c.get("SESSION_STAMP");
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            j10 = Long.parseLong(str);
        } catch (Exception unused) {
            j10 = 0;
        }
        return Long.valueOf(TimeUnit.SECONDS.convert(SystemClock.elapsedRealtime() - j10, TimeUnit.MILLISECONDS));
    }

    public static String d() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static Long e() {
        try {
            return Long.valueOf(TimeUnit.MINUTES.convert(Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()), TimeUnit.MILLISECONDS));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean f() {
        try {
            return Boolean.valueOf(Settings.System.getInt(o.f26796a.getContentResolver(), "airplane_mode_on", 0) != 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        boolean z11 = i10 >= 34 && o.a("android.permission.BLUETOOTH_CONNECT");
        if (i10 < 34 && o.a("android.permission.BLUETOOTH")) {
            z10 = true;
        }
        if (!z11 && !z10) {
            return null;
        }
        try {
            BluetoothAdapter adapter = ((BluetoothManager) o.f26796a.getSystemService(C3119a4.f35924d)).getAdapter();
            if (adapter.getProfileConnectionState(1) != 2 && adapter.getProfileConnectionState(2) != 2) {
                return null;
            }
            return Boolean.TRUE;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean h() {
        return Boolean.valueOf((o.f26796a.getResources().getConfiguration().uiMode & 48) == 32);
    }

    public static Boolean i() {
        int intExtra;
        try {
            Intent intentRegisterReceiver = o.f26796a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            boolean z10 = false;
            if (intentRegisterReceiver != null && ((intExtra = intentRegisterReceiver.getIntExtra("plugged", -1)) == 1 || intExtra == 2 || intExtra == 4)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean j() {
        try {
            AudioManager audioManager = (AudioManager) o.f26796a.getSystemService("audio");
            if (audioManager != null) {
                return Boolean.valueOf(audioManager.getStreamVolume(3) == 0);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean k() {
        try {
            int ringerMode = ((AudioManager) o.f26796a.getSystemService("audio")).getRingerMode();
            boolean z10 = true;
            if (ringerMode != 0 && ringerMode != 1) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean l() {
        try {
            int currentInterruptionFilter = ((NotificationManager) o.f26796a.getSystemService("notification")).getCurrentInterruptionFilter();
            return Boolean.valueOf(currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean m() {
        try {
            boolean z10 = false;
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) o.f26796a.getSystemService("audio")).getDevices(2)) {
                if (audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean n() {
        Integer num;
        try {
            String upperCase = Build.MANUFACTURER.toUpperCase(Locale.getDefault());
            if (TextUtils.isEmpty(upperCase) || !f26681a.containsKey(upperCase)) {
                return Boolean.valueOf(((PowerManager) o.f26796a.getSystemService("power")).isPowerSaveMode());
            }
            try {
                Iterator it = f26682b.iterator();
                while (it.hasNext()) {
                    int i10 = Settings.System.getInt(o.f26796a.getContentResolver(), (String) it.next(), -1);
                    if (i10 != -1 && (num = (Integer) f26681a.get(upperCase)) != null) {
                        return Boolean.valueOf(num.intValue() == i10);
                    }
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static UnitDisplayType a(String str) {
        r0 r0Var;
        UnitDisplayType unitDisplayType = UnitDisplayType.INTERSTITIAL;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        HashMap map = iAConfigManager.f23206a;
        q0 q0Var = (map == null || !map.containsKey(str)) ? null : (q0) iAConfigManager.f23206a.get(str);
        if (q0Var != null && q0Var.f23341a.size() > 0 && (r0Var = (r0) q0Var.f23341a.get(0)) != null) {
            t0 t0Var = r0Var.f23348f;
            l0 l0Var = r0Var.f23345c;
            p0 p0Var = r0Var.f23347e;
            if (t0Var != null) {
                return t0Var.f23408j;
            }
            if (l0Var != null) {
                return l0Var.f23330b;
            }
            if (p0Var != null) {
                return UnitDisplayType.NATIVE;
            }
        }
        return unitDisplayType;
    }

    public static Integer a() {
        Integer numValueOf = Build.VERSION.SDK_INT >= 30 ? Integer.valueOf(SdkExtensions.getExtensionVersion(1000000)) : null;
        if (numValueOf == null || numValueOf.intValue() == 0) {
            return null;
        }
        return numValueOf;
    }
}
