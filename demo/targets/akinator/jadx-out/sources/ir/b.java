package ir;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f68353a;

    /* renamed from: b, reason: collision with root package name */
    public static String f68354b;

    public static final NetworkCapabilities getActiveNetworkCapabilities(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.getActiveNetworkCapabilities(context);
    }

    @tu.f
    public static final NetworkInfo getActiveNetworkInfo(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.getActiveNetworkInfo(context);
    }

    public static final Double getBatteryLevel(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.getBatteryLevel(context);
    }

    public static final BluetoothAdapter getBluetoothAdapter(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.getBluetoothAdapter(context);
    }

    public static final String getBuildId() {
        String ID = Build.ID;
        e0.checkNotNullExpressionValue(ID, "ID");
        return ID;
    }

    public static final Configuration getConfiguration(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.getConfiguration(context);
    }

    public static final String getDeviceName(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.getDeviceName(context);
    }

    public static final DisplayMetrics getDisplayMetrics(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.getDisplayMetrics(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054 A[PHI: r0 r1
      0x0054: PHI (r0v8 java.lang.String) = (r0v1 java.lang.String), (r0v13 java.lang.String) binds: [B:44:0x0084, B:25:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0054: PHI (r1v11 java.lang.Process) = (r1v10 java.lang.Process), (r1v13 java.lang.Process) binds: [B:44:0x0084, B:25:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.BufferedReader, java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String getHWV() throws java.lang.Throwable {
        /*
            java.lang.String r0 = ir.b.f68354b
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            java.lang.String r2 = "/proc/version"
            java.lang.String r3 = "r"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L24
            ir.s.closeSafely(r1)
            goto L28
        L17:
            r0 = move-exception
            goto L20
        L19:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L20
        L1e:
            r1 = r0
            goto L24
        L20:
            ir.s.closeSafely(r1)
            throw r0
        L24:
            ir.s.closeSafely(r1)
            r2 = r0
        L28:
            if (r2 == 0) goto L32
            int r1 = r2.length()
            if (r1 <= 0) goto L32
            goto L88
        L32:
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6f
            java.lang.String r2 = "uname -a"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6f
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L66
            java.io.InputStream r3 = r1.getInputStream()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L66
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L66
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L7e
            ir.s.closeSafely(r3)
            ir.s.closeSafely(r2)
        L54:
            r1.destroy()
            goto L87
        L58:
            r0 = move-exception
            goto L72
        L5a:
            r3 = move-exception
            r4 = r3
            r3 = r0
            r0 = r4
            goto L72
        L5f:
            r3 = r0
            goto L7e
        L61:
            r2 = move-exception
            r3 = r0
            r0 = r2
            r2 = r3
            goto L72
        L66:
            r2 = r0
        L67:
            r3 = r2
            goto L7e
        L69:
            r1 = move-exception
            r2 = r0
            r3 = r2
            r0 = r1
            r1 = r3
            goto L72
        L6f:
            r1 = r0
            r2 = r1
            goto L67
        L72:
            ir.s.closeSafely(r3)
            ir.s.closeSafely(r2)
            if (r1 == 0) goto L7d
            r1.destroy()
        L7d:
            throw r0
        L7e:
            ir.s.closeSafely(r3)
            ir.s.closeSafely(r2)
            if (r1 == 0) goto L87
            goto L54
        L87:
            r2 = r0
        L88:
            ir.b.f68354b = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.b.getHWV():java.lang.String");
    }

    public static final String getManufacturer() {
        String MANUFACTURER = Build.MANUFACTURER;
        e0.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        return MANUFACTURER;
    }

    public static final String getModel() {
        String MODEL = Build.MODEL;
        e0.checkNotNullExpressionValue(MODEL, "MODEL");
        return MODEL;
    }

    public static final int getOrientation(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.getOrientation(context);
    }

    public static final String getOsVersion() {
        String RELEASE = Build.VERSION.RELEASE;
        e0.checkNotNullExpressionValue(RELEASE, "RELEASE");
        return RELEASE;
    }

    public static final String getPhoneMCCMNC(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.getPhoneMCCMNC(context);
    }

    public static final String getPhoneOperatorName(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.getPhoneOperatorName(context);
    }

    public static final Integer getScreenBrightness(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.getScreenBrightness(context);
    }

    public static final Double getScreenBrightnessRatio(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.getScreenBrightnessRatio(context);
    }

    public static final float getScreenDensity(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.getScreenDensity(context);
    }

    public static final int getScreenOrientation(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.getScreenOrientation(context);
    }

    public static final Point getScreenSize(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.getScreenSize(context);
    }

    public static final Boolean isAirplaneModeOn(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.isAirplaneModeOn(context);
    }

    public static final Boolean isBatterySaverEnabled(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.isBatterySaverEnabled(context);
    }

    public static final Boolean isCharging(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.isCharging(context);
    }

    public static final boolean isDarkModeEnabled(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.isDarkModeEnabled(context);
    }

    public static final boolean isDeviceRooted() {
        Boolean bool = f68353a;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = true;
        try {
            String[] strArr = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
            for (int i10 = 0; i10 < 8; i10++) {
                if (kr.c.existsSafely(new File(strArr[i10]))) {
                    f68353a = Boolean.TRUE;
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() == null) {
                z10 = false;
            }
            f68353a = Boolean.valueOf(z10);
            processExec.destroy();
            return z10;
        } catch (Exception unused2) {
            if (processExec != null) {
                processExec.destroy();
            }
            f68353a = Boolean.FALSE;
            return false;
        } catch (Throwable th2) {
            if (processExec != null) {
                processExec.destroy();
            }
            throw th2;
        }
    }

    public static final Boolean isDoNotDisturbOn(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.isDoNotDisturbOn(context);
    }

    public static final boolean isLandscapeOrientation(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.isLandscapeOrientation(context);
    }

    public static final boolean isNetworkAvailable(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.isNetworkAvailable(context);
    }

    public static final Boolean isRingMuted(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.isRingMuted(context);
    }

    public static final boolean isTablet(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.getConfiguration(context).smallestScreenWidthDp >= 600;
    }
}
