package com.google.android.gms.internal.gtm;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzad extends zzacf implements zzadm {
    public static final zzace zza;
    private static final zzad zzd;
    private int zze;
    private int zzi;
    private int zzk;
    private int zzl;
    private zzack zzf = zzacf.zzah();
    private zzack zzg = zzacf.zzah();
    private zzack zzh = zzacf.zzah();
    private zzack zzj = zzacf.zzah();

    static {
        zzad zzadVar = new zzad();
        zzd = zzadVar;
        zzacf.zzao(zzad.class, zzadVar);
        zza = zzacf.zzac(zzap.zzi(), zzadVar, zzadVar, null, 101, zzaex.zzk, zzad.class);
    }

    private zzad() {
    }

    public final int zza() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zzd, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001\u0016\u0002\u0016\u0003\u0016\u0004င\u0000\u0005\u0016\u0006င\u0001\u0007င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new zzad();
        }
        zzai zzaiVar = null;
        if (i11 == 4) {
            return new zzac(zzaiVar);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    public final int zzc() {
        return this.zzg.size();
    }

    public final int zzd() {
        return this.zzh.size();
    }

    public final List zzf() {
        return this.zzf;
    }

    public final List zzg() {
        return this.zzg;
    }

    public final List zzh() {
        return this.zzh;
    }

    public final List zzi() {
        return this.zzj;
    }
}
