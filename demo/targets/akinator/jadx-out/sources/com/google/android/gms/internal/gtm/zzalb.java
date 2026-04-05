package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzalb extends zzacf implements zzadm {
    private static final zzalb zza;
    private int zzd;
    private long zzi;
    private int zzj;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzk = "";

    static {
        zzalb zzalbVar = new zzalb();
        zza = zzalbVar;
        zzacf.zzao(zzalb.class, zzalbVar);
    }

    private zzalb() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new zzalb();
        }
        zzamq zzamqVar = null;
        if (i11 == 4) {
            return new zzala(zzamqVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
