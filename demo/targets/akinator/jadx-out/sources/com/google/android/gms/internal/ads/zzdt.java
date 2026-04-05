package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdt {
    private static final Object zza = new Object();

    @Pure
    public static void zza(String str, String str2) {
        synchronized (zza) {
            Log.d(str, zzg(str2, null));
        }
    }

    @Pure
    public static void zzb(String str, String str2) {
        synchronized (zza) {
            Log.i(str, zzg(str2, null));
        }
    }

    @Pure
    public static void zzc(String str, String str2) {
        synchronized (zza) {
            Log.w(str, zzg(str2, null));
        }
    }

    @Pure
    public static void zzd(String str, String str2, Throwable th2) {
        synchronized (zza) {
            Log.w(str, zzg(str2, th2));
        }
    }

    @Pure
    public static void zze(String str, String str2) {
        synchronized (zza) {
            Log.e(str, zzg(str2, null));
        }
    }

    @Pure
    public static void zzf(String str, String str2, Throwable th2) {
        synchronized (zza) {
            Log.e(str, zzg(str2, th2));
        }
    }

    @Pure
    public static String zzg(String str, Throwable th2) {
        String strReplace;
        if (th2 != null) {
            synchronized (zza) {
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        String strReplace2 = strReplace.replace("\n", "\n  ");
        int length = String.valueOf(str).length();
        return o2.r(new StringBuilder(String.valueOf(strReplace2).length() + length + 3 + 1), str, "\n  ", strReplace2, "\n");
    }
}
