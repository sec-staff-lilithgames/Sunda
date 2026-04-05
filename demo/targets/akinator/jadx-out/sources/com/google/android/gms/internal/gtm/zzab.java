package com.google.android.gms.internal.gtm;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzab extends zzacf implements zzadm {
    private static final zzab zza;
    private zzack zzd = zzacf.zzah();
    private zzack zze = zzacf.zzah();
    private zzack zzf = zzacf.zzah();
    private zzack zzg = zzacf.zzah();
    private zzack zzh = zzacf.zzah();
    private zzack zzi = zzacf.zzah();
    private zzack zzj = zzacf.zzah();
    private zzack zzk = zzacf.zzah();
    private zzack zzl = zzacf.zzah();
    private zzack zzm = zzacf.zzah();

    static {
        zzab zzabVar = new zzab();
        zza = zzabVar;
        zzacf.zzao(zzab.class, zzabVar);
    }

    private zzab() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0004\n\u0000\u0000\u0001\n\n\u0000\n\u0000\u0001\u0016\u0002\u0016\u0003\u0016\u0004\u0016\u0005\u0016\u0006\u0016\u0007\u0016\b\u0016\t\u0016\n\u0016", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new zzab();
        }
        zzai zzaiVar = null;
        if (i11 == 4) {
            return new zzaa(zzaiVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }

    public final List zzc() {
        return this.zzj;
    }

    public final List zzd() {
        return this.zzl;
    }

    public final List zze() {
        return this.zzf;
    }

    public final List zzf() {
        return this.zzh;
    }

    public final List zzg() {
        return this.zze;
    }

    public final List zzh() {
        return this.zzd;
    }

    public final List zzi() {
        return this.zzk;
    }

    public final List zzj() {
        return this.zzm;
    }

    public final List zzk() {
        return this.zzg;
    }

    public final List zzl() {
        return this.zzi;
    }
}
