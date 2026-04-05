package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzamc extends zzacf implements zzadm {
    private static final zzamc zza;
    private int zzd;
    private int zze;

    static {
        zzamc zzamcVar = new zzamc();
        zza = zzamcVar;
        zzacf.zzao(zzamc.class, zzamcVar);
    }

    private zzamc() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzamb.zza});
        }
        if (i11 == 3) {
            return new zzamc();
        }
        zzamq zzamqVar = null;
        if (i11 == 4) {
            return new zzama(zzamqVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
