package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaix extends zzacf implements zzadm {
    private static final zzaix zza;
    private int zzd;
    private long zze;
    private int zzf;

    static {
        zzaix zzaixVar = new zzaix();
        zza = zzaixVar;
        zzacf.zzao(zzaix.class, zzaixVar);
    }

    private zzaix() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzaiw.zza});
        }
        if (i11 == 3) {
            return new zzaix();
        }
        zzaiy zzaiyVar = null;
        if (i11 == 4) {
            return new zzaiv(zzaiyVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
