package com.google.android.exoplayer2.util;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Method f28412a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f28413b;

    public static IBinder getBinder(Bundle bundle, String str) throws NoSuchMethodException, SecurityException {
        if (n1.f28506a >= 18) {
            return bundle.getBinder(str);
        }
        Method method = f28412a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f28412a = method2;
                method2.setAccessible(true);
                method = f28412a;
            } catch (NoSuchMethodException e10) {
                f0.i("BundleUtil", "Failed to retrieve getIBinder method", e10);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            f0.i("BundleUtil", "Failed to invoke getIBinder via reflection", e11);
            return null;
        }
    }

    public static void putBinder(Bundle bundle, String str, IBinder iBinder) {
        if (n1.f28506a >= 18) {
            bundle.putBinder(str, iBinder);
            return;
        }
        Method method = f28413b;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                f28413b = method2;
                method2.setAccessible(true);
                method = f28413b;
            } catch (NoSuchMethodException e10) {
                f0.i("BundleUtil", "Failed to retrieve putIBinder method", e10);
                return;
            }
        }
        try {
            method.invoke(bundle, str, iBinder);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            f0.i("BundleUtil", "Failed to invoke putIBinder via reflection", e11);
        }
    }
}
