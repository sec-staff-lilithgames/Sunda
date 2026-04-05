package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaha extends zzacf implements zzadm {
    private static final zzaha zza;
    private int zzd;
    private zzack zze = zzacf.zzah();
    private int zzf;

    static {
        zzaha zzahaVar = new zzaha();
        zza = zzahaVar;
        zzacf.zzao(zzaha.class, zzahaVar);
    }

    private zzaha() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0016\u0002င\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzaha();
        }
        zzagz zzagzVar = null;
        if (i11 == 4) {
            return new zzagy(zzagzVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
