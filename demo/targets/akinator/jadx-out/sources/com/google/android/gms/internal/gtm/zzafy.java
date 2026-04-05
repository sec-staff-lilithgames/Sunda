package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzafy extends zzacf implements zzadm {
    private static final zzafy zza;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        zzafy zzafyVar = new zzafy();
        zza = zzafyVar;
        zzacf.zzao(zzafy.class, zzafyVar);
    }

    private zzafy() {
    }

    public static zzafy zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0003\u0003ဇ\u0004\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzh", "zzi", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzafy();
        }
        zzagg zzaggVar = null;
        if (i11 == 4) {
            return new zzafx(zzaggVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
