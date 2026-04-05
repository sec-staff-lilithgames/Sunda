package com.google.android.gms.internal.gtm;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzvc {
    private static String zza = "com.google.android.gms.internal.gtm.zzvg";
    private static String zzb = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String zzc = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] zzd = {"com.google.android.gms.internal.gtm.zzvg", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int zza() {
        return zzwg.zza();
    }

    public static long zzb() {
        return zzva.zza.zzc();
    }

    public static zzum zzd(String str) {
        return zzva.zza.zze(str);
    }

    public static zzuo zzf() {
        return zzi().zza();
    }

    public static zzvb zzg() {
        return zzva.zza.zzh();
    }

    public static zzvq zzi() {
        return zzva.zza.zzj();
    }

    public static zzwc zzk() {
        return zzi().zzc();
    }

    public static String zzl() {
        return zzva.zza.zzm();
    }

    public static boolean zzn(String str, Level level, boolean z10) {
        zzi().zzd(str, level, z10);
        return false;
    }

    public long zzc() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public abstract zzum zze(String str);

    public abstract zzvb zzh();

    public zzvq zzj() {
        return zzvq.zze();
    }

    public abstract String zzm();
}
