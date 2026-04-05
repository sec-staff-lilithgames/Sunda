package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class aa {

    /* renamed from: a, reason: collision with root package name */
    private static volatile DisplayManager.DisplayListener f50356a = null;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f50357b = false;

    /* renamed from: c, reason: collision with root package name */
    private static String f50358c = null;

    /* renamed from: d, reason: collision with root package name */
    private static String f50359d = null;

    /* renamed from: e, reason: collision with root package name */
    private static String f50360e = null;

    /* renamed from: f, reason: collision with root package name */
    private static volatile boolean f50361f = false;

    /* renamed from: g, reason: collision with root package name */
    private static volatile boolean f50362g = false;

    /* renamed from: h, reason: collision with root package name */
    private static DisplayManager f50363h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
            aa.b(i10, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            aa.b(i10, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
            aa.b(i10, 2);
        }
    }

    public static void b(Context context) {
        Handler handlerB;
        if (f50357b) {
            return;
        }
        if (f50356a == null) {
            f50356a = new a();
        }
        if (f50363h == null) {
            f50363h = (DisplayManager) context.getSystemService("display");
        }
        if (f50363h == null || (handlerB = ar.b()) == null) {
            return;
        }
        try {
            f50363h.registerDisplayListener(f50356a, handlerB);
            f50357b = true;
        } catch (Exception unused) {
        }
    }

    private static String a(Display display) {
        String name = display.getName();
        boolean z10 = false;
        Object objA = av.a(display, display.getClass(), "getType", new Class[0], new Object[0]);
        Object objA2 = av.a(display, display.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object objA3 = av.a(null, display.getClass(), "TYPE_VIRTUAL", null);
        if (objA != null && objA3 != null && ((Integer) objA).intValue() == ((Integer) objA3).intValue()) {
            z10 = true;
        }
        return String.format("%s#%s#%b", objA2, name, Boolean.valueOf(z10));
    }

    private static String a(int i10) {
        Display display = f50363h.getDisplay(i10);
        return display != null ? a(display) : "pd";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        try {
            String strA = a(i10);
            if (i11 == 1) {
                if (strA.equals(f50358c)) {
                    return;
                }
                f50358c = strA;
            } else {
                if (i11 != 2) {
                    if (i11 != 3 || strA.equals(f50360e)) {
                        return;
                    }
                    f50360e = strA;
                    return;
                }
                if (strA.equals(f50359d)) {
                    return;
                }
                f50359d = strA;
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a(Context context) {
        Display[] displays;
        if (f50357b && (f50358c != null || f50359d != null || f50360e != null)) {
            return true;
        }
        if (f50357b && f50361f) {
            return f50362g;
        }
        int i10 = 0;
        if (context == null) {
            return false;
        }
        if (f50363h == null) {
            f50363h = (DisplayManager) context.getSystemService("display");
        }
        DisplayManager displayManager = f50363h;
        if (displayManager != null && (displays = displayManager.getDisplays()) != null) {
            int length = displays.length;
            while (true) {
                if (i10 < length) {
                    Display display = displays[i10];
                    if (display != null && display.getDisplayId() != 0) {
                        f50362g = true;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
        }
        f50361f = true;
        return f50362g;
    }
}
