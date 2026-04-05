package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraManager;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public static int f50499a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static int f50500b = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            x.f50500b = x.b(z.b());
            SharedPreferences sharedPreferencesA = ax.a(z.b());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt("camera_count", x.f50500b).apply();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(Context context) {
        int i10 = f50500b;
        if (i10 != -1) {
            return i10;
        }
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        if (cameraManager != null) {
            try {
                f50500b = cameraManager.getCameraIdList().length;
            } catch (Throwable unused) {
                f50500b = -1;
            }
        } else {
            f50500b = -2;
        }
        return f50500b;
    }

    public static int c(Context context) {
        TelephonyManager telephonyManager;
        if (f50499a == -1 && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            f50499a = telephonyManager.getSimState();
        }
        return f50499a;
    }

    public static int a() {
        int i10;
        int i11 = f50500b;
        if (i11 != -1) {
            return i11;
        }
        SharedPreferences sharedPreferencesA = ax.a(z.b());
        if (sharedPreferencesA == null || (i10 = sharedPreferencesA.getInt("camera_count", -1)) == -1) {
            ar.b(new a());
            return -1;
        }
        f50500b = i10;
        return i10;
    }
}
