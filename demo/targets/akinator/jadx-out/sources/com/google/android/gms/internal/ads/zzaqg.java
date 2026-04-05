package com.google.android.gms.internal.ads;

import android.util.Log;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.ironsource.C3191e4;
import j1.o2;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaqg {
    public static final String zza = "Volley";
    public static final boolean zzb = Log.isLoggable("Volley", 2);
    private static final String zzc = zzaqg.class.getName();

    public static void zza(String str, Object... objArr) {
        if (zzb) {
            Log.v(zza, zze(str, objArr));
        }
    }

    public static void zzb(String str, Object... objArr) {
        Log.d(zza, zze(str, objArr));
    }

    public static void zzc(String str, Object... objArr) {
        Log.e(zza, zze(str, objArr));
    }

    public static void zzd(Throwable th2, String str, Object... objArr) {
        Log.e(zza, zze(str, objArr), th2);
    }

    private static String zze(String str, Object... objArr) {
        String strO;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i10 = 2;
        while (true) {
            if (i10 >= stackTrace.length) {
                strO = "<unknown>";
                break;
            }
            if (!stackTrace[i10].getClassName().equals(zzc)) {
                String className = stackTrace[i10].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i10].getMethodName();
                strO = a.b.o(new StringBuilder(String.valueOf(strSubstring2).length() + 1 + String.valueOf(methodName).length()), strSubstring2, ".", methodName);
                break;
            }
            i10++;
        }
        Locale locale = Locale.US;
        long id2 = Thread.currentThread().getId();
        StringBuilder sb2 = new StringBuilder(C3191e4.i.f36529d);
        sb2.append(id2);
        sb2.append(PtLatqAYjEFT.fzOqqykQKnMOR);
        sb2.append(strO);
        return o2.o(sb2, ": ", str2);
    }
}
