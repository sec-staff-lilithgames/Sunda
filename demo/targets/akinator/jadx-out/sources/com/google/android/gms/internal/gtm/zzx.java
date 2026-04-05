package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzx extends zzacf implements zzadm {
    private static final zzx zza;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        zzx zzxVar = new zzx();
        zza = zzxVar;
        zzacf.zzao(zzx.class, zzxVar);
    }

    private zzx() {
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzx();
        }
        zzai zzaiVar = null;
        if (i11 == 4) {
            return new zzw(zzaiVar);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int zzc() {
        return this.zzf;
    }
}
