package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzahu extends zzacf implements zzadm {
    private static final zzahu zza;
    private int zzd;
    private boolean zze;

    static {
        zzahu zzahuVar = new zzahu();
        zza = zzahuVar;
        zzacf.zzao(zzahu.class, zzahuVar);
    }

    private zzahu() {
    }

    public static zzahu zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzahu();
        }
        zzahv zzahvVar = null;
        if (i11 == 4) {
            return new zzaht(zzahvVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
