package com.google.android.gms.internal.gtm;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzr extends zzacf implements zzadm {
    private static final zzr zza;
    private int zzd;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private byte zzj = 2;
    private zzack zze = zzacf.zzah();

    static {
        zzr zzrVar = new zzr();
        zza = zzrVar;
        zzacf.zzao(zzr.class, zzrVar);
    }

    private zzr() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0001\u0001ဇ\u0003\u0002ᔄ\u0000\u0003\u0016\u0004င\u0001\u0006ဇ\u0002", new Object[]{"zzd", "zzi", "zzf", "zze", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzr();
        }
        zzai zzaiVar = null;
        if (i11 == 4) {
            return new zzq(zzaiVar);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List zzc() {
        return this.zze;
    }
}
