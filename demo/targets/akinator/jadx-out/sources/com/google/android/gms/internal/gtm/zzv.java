package com.google.android.gms.internal.gtm;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzv extends zzacf implements zzadm {
    private static final zzv zza;
    private byte zzg = 2;
    private zzacn zzd = zzacf.zzai();
    private zzacn zze = zzacf.zzai();
    private zzacn zzf = zzacf.zzai();

    static {
        zzv zzvVar = new zzv();
        zza = zzvVar;
        zzacf.zzao(zzv.class, zzvVar);
    }

    private zzv() {
    }

    public static zzv zzc() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0002\u0001Л\u0002Л\u0003\u001b", new Object[]{"zzd", zzap.class, "zze", zzap.class, "zzf", zzt.class});
        }
        if (i11 == 3) {
            return new zzv();
        }
        zzai zzaiVar = null;
        if (i11 == 4) {
            return new zzu(zzaiVar);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List zzd() {
        return this.zzf;
    }

    public final List zze() {
        return this.zze;
    }

    public final List zzf() {
        return this.zzd;
    }
}
