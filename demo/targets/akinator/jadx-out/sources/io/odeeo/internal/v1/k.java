package io.odeeo.internal.v1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.widget.PopupWindow;
import b0.e2;
import j1.o2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f67283a = new k();

    public final float convertPixelsToDp(float f10) {
        return f10 / Resources.getSystem().getDisplayMetrics().density;
    }

    public final int densityPixelsToPixels(float f10, int i10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    public final float getDeviceDensityPixelScale(Context context) {
        e0.checkNotNullParameter(context, "context");
        return context.getResources().getDisplayMetrics().density;
    }

    public final boolean isNetworkConnected(Context context) {
        NetworkCapabilities networkCapabilities;
        e0.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasCapability(12);
    }

    public final boolean isPermissionGranted(Context context, String permission) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(permission, "permission");
        m mVar = m.f67284a;
        mVar.checkNotNull(context);
        mVar.checkNotNull(permission);
        try {
            return m3.a.checkSelfPermission(context, permission) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public final float lerp(float f10, float f11, float f12) {
        return o2.a(f11, f10, f12, f10);
    }

    public final int manipulateColor(int i10, float f10) {
        return Color.argb(Color.alpha(i10), Math.min(Math.round(Color.red(i10) * f10), 255), Math.min(Math.round(Color.green(i10) * f10), 255), Math.min(Math.round(Color.blue(i10) * f10), 255));
    }

    public final void setPopUpWindowLayoutType(PopupWindow popupWindow, int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(popupWindow, Integer.valueOf(i10));
        } catch (Exception e10) {
            io.odeeo.internal.b2.a.w(e10, e2.m("Unable to set popUpWindow window layout type: %s", "format(format, *args)", 1, new Object[]{e10.getLocalizedMessage()}), new Object[0]);
        }
    }
}
