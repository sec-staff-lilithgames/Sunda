package com.google.android.gms.internal.gtm;

import a.b;
import android.util.Log;
import com.google.android.gms.analytics.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes6.dex */
public final class zzen {
    private static volatile Logger zza = new zzct();

    public static Logger zza() {
        return zza;
    }

    public static void zzb(String str, Object obj) {
        String string;
        zzeo zzeoVarZza = zzeo.zza();
        if (zzeoVarZza != null) {
            zzeoVarZza.zzJ(str, obj);
        } else if (zzf(3)) {
            if (obj != null) {
                StringBuilder sbT = b.t(str, ":");
                sbT.append((String) obj);
                string = sbT.toString();
            } else {
                string = str;
            }
            Log.e((String) zzeh.zzb.zzb(), string);
        }
        Logger logger = zza;
        if (logger != null) {
            logger.error(str);
        }
    }

    public static void zzc(Logger logger) {
        zza = logger;
    }

    public static void zzd(String str) {
        zzeo zzeoVarZza = zzeo.zza();
        if (zzeoVarZza != null) {
            zzeoVarZza.zzN(str);
        } else if (zzf(0)) {
            Log.v((String) zzeh.zzb.zzb(), str);
        }
        Logger logger = zza;
        if (logger != null) {
            logger.verbose(str);
        }
    }

    public static void zze(String str) {
        zzeo zzeoVarZza = zzeo.zza();
        if (zzeoVarZza != null) {
            zzeoVarZza.zzQ(str);
        } else if (zzf(2)) {
            Log.w((String) zzeh.zzb.zzb(), str);
        }
        Logger logger = zza;
        if (logger != null) {
            logger.warn(str);
        }
    }

    public static boolean zzf(int i10) {
        return zza != null && zza.getLogLevel() <= i10;
    }
}
