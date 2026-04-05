package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaf extends zzacf implements zzadm {
    private static final zzaf zza;
    private int zzd;
    private zzap zzf;
    private zzv zzg;
    private byte zzh = 2;
    private String zze = "";

    static {
        zzaf zzafVar = new zzaf();
        zza = zzafVar;
        zzacf.zzao(zzaf.class, zzafVar);
    }

    private zzaf() {
    }

    public final zzv zza() {
        zzv zzvVar = this.zzg;
        return zzvVar == null ? zzv.zzc() : zzvVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzaf();
        }
        zzai zzaiVar = null;
        if (i11 == 4) {
            return new zzae(zzaiVar);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String zzd() {
        return this.zze;
    }

    public final boolean zze() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzf() {
        return (this.zzd & 1) != 0;
    }
}
