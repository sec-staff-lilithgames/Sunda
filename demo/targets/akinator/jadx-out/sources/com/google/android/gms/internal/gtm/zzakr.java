package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzakr extends zzacf implements zzadm {
    private static final zzakr zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zzakr zzakrVar = new zzakr();
        zza = zzakrVar;
        zzacf.zzao(zzakr.class, zzakrVar);
    }

    private zzakr() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", zzakq.zza, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzakr();
        }
        zzamq zzamqVar = null;
        if (i11 == 4) {
            return new zzakp(zzamqVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
