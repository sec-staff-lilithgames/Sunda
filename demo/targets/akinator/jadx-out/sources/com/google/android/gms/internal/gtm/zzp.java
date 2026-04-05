package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzp extends zzacf implements zzadm {
    private static final zzp zza;
    private int zzd;
    private int zze = 1;
    private int zzf;
    private int zzg;

    static {
        zzp zzpVar = new zzp();
        zza = zzpVar;
        zzacf.zzao(zzp.class, zzpVar);
    }

    private zzp() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", zzo.zza, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzp();
        }
        zzai zzaiVar = null;
        if (i11 == 4) {
            return new zzn(zzaiVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
