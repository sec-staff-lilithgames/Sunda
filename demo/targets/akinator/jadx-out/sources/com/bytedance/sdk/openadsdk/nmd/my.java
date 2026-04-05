package com.bytedance.sdk.openadsdk.nmd;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my {

    /* renamed from: cm, reason: collision with root package name */
    protected static int f21343cm = 30;

    /* renamed from: if, reason: not valid java name */
    public static int f158if = 32;

    /* renamed from: jd, reason: collision with root package name */
    protected static String f21344jd = null;

    /* renamed from: jj, reason: collision with root package name */
    public static int f21345jj = 0;
    protected static String jpo = "images";

    /* renamed from: ju, reason: collision with root package name */
    public static int f21346ju = 16;
    protected static long my = 15360;

    /* renamed from: qk, reason: collision with root package name */
    public static int f21347qk = 1;
    protected static int wqx = 1;
    public static int xyk = 2;

    /* renamed from: yd, reason: collision with root package name */
    public static int f21348yd = 8;
    public static int zz = 4;

    public static boolean jd(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    public static boolean jpo(Context context, String str) {
        return false;
    }

    public static float jd(Context context) {
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static Bitmap jpo(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static boolean jpo(Context context, int i10) {
        boolean zJpo;
        boolean zJpo2;
        if (f21345jj == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                zJpo = jpo(context, "android.permission.READ_MEDIA_IMAGES");
                zJpo2 = true;
            } else {
                zJpo = jpo(context, "android.permission.READ_EXTERNAL_STORAGE");
                zJpo2 = jpo(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean zJpo3 = jpo(context, "android.permission.CAMERA");
            boolean zJpo4 = jpo(context, "android.permission.RECORD_AUDIO");
            PackageManager packageManager = context.getPackageManager();
            if (zJpo && zJpo2) {
                f21345jj |= f21347qk;
            }
            if (zJpo3 && packageManager.hasSystemFeature("android.hardware.camera")) {
                f21345jj |= xyk;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                f21345jj |= zz;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                f21345jj |= f21348yd;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                f21345jj |= f21346ju;
            }
            if (zJpo4 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                f21345jj |= f158if;
            }
        }
        return (f21345jj & i10) != 0;
    }

    public static boolean jpo(Context context) {
        boolean z10;
        boolean z11;
        if (Build.VERSION.SDK_INT >= 33) {
            z10 = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z10 = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z11 = false;
            }
            return !z11 && z10;
        }
        z11 = true;
        if (z11) {
        }
    }
}
