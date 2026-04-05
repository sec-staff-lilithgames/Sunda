package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzagj extends zzacf implements zzadm {
    private static final zzagj zza;
    private int zzd;
    private zzacn zze = zzacf.zzai();
    private String zzf = "";

    static {
        zzagj zzagjVar = new zzagj();
        zza = zzagjVar;
        zzacf.zzao(zzagj.class, zzagjVar);
    }

    private zzagj() {
    }

    public static zzagj zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzagj();
        }
        zzagk zzagkVar = null;
        if (i11 == 4) {
            return new zzagi(zzagkVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
