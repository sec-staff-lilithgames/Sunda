package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzafe extends zzacf implements zzadm {
    private static final zzafe zza;
    private zzacn zzd = zzacf.zzai();
    private zzack zze = zzacf.zzah();
    private zzack zzf = zzacf.zzah();

    static {
        zzafe zzafeVar = new zzafe();
        zza = zzafeVar;
        zzacf.zzao(zzafe.class, zzafeVar);
    }

    private zzafe() {
    }

    public static zzafe zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0001\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0003\u0000\u0001\u001a\u0002ࠞ\u0005ࠬ", new Object[]{"zzd", "zze", zzafj.zza, "zzf", zzafk.zza});
        }
        if (i11 == 3) {
            return new zzafe();
        }
        zzafh zzafhVar = null;
        if (i11 == 4) {
            return new zzafd(zzafhVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
