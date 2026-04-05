package io.odeeo.internal.q0;

import android.os.Bundle;
import android.os.IBinder;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static Method f65838a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f65839b;

    public static IBinder a(Bundle bundle, String str) throws NoSuchMethodException, SecurityException {
        Method method = f65838a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f65838a = method2;
                method2.setAccessible(true);
                method = f65838a;
            } catch (NoSuchMethodException e10) {
                p.i("BundleUtil", "Failed to retrieve getIBinder method", e10);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            p.i("BundleUtil", "Failed to invoke getIBinder via reflection", e11);
            return null;
        }
    }

    public static IBinder getBinder(Bundle bundle, String str) {
        return g0.f65861a >= 18 ? bundle.getBinder(str) : a(bundle, str);
    }

    public static void putBinder(Bundle bundle, String str, IBinder iBinder) {
        if (g0.f65861a >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            a(bundle, str, iBinder);
        }
    }

    public static void a(Bundle bundle, String str, IBinder iBinder) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method = f65839b;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod(duhsDlGWdBkekB.NieBZvA, String.class, IBinder.class);
                f65839b = method2;
                method2.setAccessible(true);
                method = f65839b;
            } catch (NoSuchMethodException e10) {
                p.i("BundleUtil", "Failed to retrieve putIBinder method", e10);
                return;
            }
        }
        try {
            method.invoke(bundle, str, iBinder);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            p.i("BundleUtil", "Failed to invoke putIBinder via reflection", e11);
        }
    }
}
