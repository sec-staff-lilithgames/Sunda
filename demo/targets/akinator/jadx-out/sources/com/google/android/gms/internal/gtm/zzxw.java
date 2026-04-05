package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzxw extends zzacf implements zzadm {
    private static final zzxw zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private zzye zzh;

    static {
        zzxw zzxwVar = new zzxw();
        zza = zzxwVar;
        zzacf.zzao(zzxw.class, zzxwVar);
    }

    private zzxw() {
    }

    public static zzxw zzc() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzxw();
        }
        zzxv zzxvVar = null;
        if (i11 == 4) {
            return new zzxu(zzxvVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
