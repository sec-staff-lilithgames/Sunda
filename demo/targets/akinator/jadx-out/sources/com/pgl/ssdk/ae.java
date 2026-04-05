package com.pgl.ssdk;

import android.content.Context;
import android.content.res.Configuration;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ae {

    /* renamed from: a, reason: collision with root package name */
    public static int f50368a;

    /* renamed from: b, reason: collision with root package name */
    public static int f50369b;

    /* renamed from: c, reason: collision with root package name */
    public static int f50370c;

    /* renamed from: d, reason: collision with root package name */
    public static int f50371d;

    /* renamed from: e, reason: collision with root package name */
    public static int f50372e;

    /* renamed from: f, reason: collision with root package name */
    private static int f50373f;

    /* renamed from: g, reason: collision with root package name */
    private static int f50374g;

    /* renamed from: h, reason: collision with root package name */
    private static int f50375h;

    public static int a(Context context) {
        try {
            Configuration configuration = context.getResources().getConfiguration();
            if (configuration != null) {
                return configuration.touchscreen;
            }
            return 666666;
        } catch (Throwable unused) {
            return 666666;
        }
    }

    private static void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f50373f = (int) displayMetrics.density;
            f50372e = displayMetrics.densityDpi;
        } catch (Throwable unused) {
        }
    }

    private static void c(Context context) {
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f50374g = (int) displayMetrics.xdpi;
            f50375h = (int) displayMetrics.ydpi;
        } catch (Throwable unused) {
        }
    }

    private static void d(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            f50368a = displayMetrics.widthPixels;
            f50369b = displayMetrics.heightPixels;
            Display.Mode mode = defaultDisplay.getMode();
            f50370c = mode.getPhysicalWidth();
            f50371d = mode.getPhysicalHeight();
        } catch (Throwable unused) {
        }
    }

    public static String e(Context context) {
        int i10 = -1;
        if (context != null) {
            try {
                i10 = Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
            } catch (Throwable unused) {
            }
        }
        return String.valueOf(i10);
    }

    public static String f(Context context) {
        try {
            d(context);
            b(context);
            c(context);
        } catch (Throwable unused) {
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f50372e);
        sb2.append("[<!>]");
        sb2.append(f50368a);
        sb2.append(",");
        sb2.append(f50369b);
        sb2.append("[<!>]");
        sb2.append(f50370c);
        sb2.append("x");
        return a.b.f(f50371d, "[<!>]", sb2);
    }
}
