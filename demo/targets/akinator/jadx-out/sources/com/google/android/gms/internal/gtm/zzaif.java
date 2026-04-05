package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaif extends zzacf implements zzadm {
    public static final zzace zza;
    private static final zzaif zzd;
    private int zze;
    private zzaic zzf;

    static {
        zzaif zzaifVar = new zzaif();
        zzd = zzaifVar;
        zzacf.zzao(zzaif.class, zzaifVar);
        zza = zzacf.zzac(zzaii.zze(), zzaifVar, zzaifVar, null, 525002763, zzaex.zzk, zzaif.class);
    }

    private zzaif() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zzd, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzaif();
        }
        zzaie zzaieVar = null;
        if (i11 == 4) {
            return new zzaid(zzaieVar);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }
}
