package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzafw extends zzacf implements zzadm {
    private static final zzafw zza;
    private int zzd;
    private zzack zze = zzacf.zzah();
    private zzafq zzf;
    private zzafq zzg;

    static {
        zzafw zzafwVar = new zzafw();
        zza = zzafwVar;
        zzacf.zzao(zzafw.class, zzafwVar);
    }

    private zzafw() {
    }

    public static zzafw zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ࠞ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", zzage.zza, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzafw();
        }
        zzagg zzaggVar = null;
        if (i11 == 4) {
            return new zzafv(zzaggVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
