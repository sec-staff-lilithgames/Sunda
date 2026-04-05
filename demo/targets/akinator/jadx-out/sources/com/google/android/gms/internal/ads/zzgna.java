package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgna {
    public static final /* synthetic */ int zza = 0;
    private static final Object zzb;

    static {
        Object objZza = zza();
        zzb = objZza;
        if (objZza != null) {
            zzc("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (objZza == null) {
            return;
        }
        zzb(objZza);
    }

    private static Object zza() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method zzb(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Method methodZzc = zzc("getStackTraceDepth", Throwable.class);
            if (methodZzc == null) {
                return null;
            }
            methodZzc.invoke(obj, new Throwable());
            return methodZzc;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Method zzc(String str, Class... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }
}
