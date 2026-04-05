package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaae extends zzacc implements zzadm {
    private static final zzaae zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private byte zzl = 2;

    static {
        zzaae zzaaeVar = new zzaae();
        zzd = zzaaeVar;
        zzacf.zzao(zzaae.class, zzaaeVar);
    }

    private zzaae() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i11 == 2) {
            return new zzadv(zzd, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"zze", "zzf", zzzz.zza, "zzg", zzzy.zza, "zzh", zzaac.zza, "zzi", zzaad.zza, "zzj", zzaab.zza, "zzk", zzaaa.zza});
        }
        if (i11 == 3) {
            return new zzaae();
        }
        zzabm zzabmVar = null;
        if (i11 == 4) {
            return new zzzx(zzabmVar);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
