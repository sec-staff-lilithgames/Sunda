package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzajo extends zzacf implements zzadm {
    private static final zzajo zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private int zzh;
    private zzajm zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private zzajk zzm;

    static {
        zzajo zzajoVar = new zzajo();
        zza = zzajoVar;
        zzacf.zzao(zzajo.class, zzajoVar);
    }

    private zzajo() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0003\u0003ဉ\u0004\u0004ဈ\u0001\u0005ဈ\u0002\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007\tဉ\b", new Object[]{"zzd", "zze", "zzh", zzajf.zza, "zzi", "zzf", "zzg", "zzj", zzajg.zza, "zzk", zzajn.zza, "zzl", zzaji.zza, "zzm"});
        }
        if (i11 == 3) {
            return new zzajo();
        }
        zzamq zzamqVar = null;
        if (i11 == 4) {
            return new zzajh(zzamqVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
