package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzsq extends zzacf implements zzadm {
    private static final zzsq zza;
    private zzacn zzd = zzacf.zzai();

    static {
        zzsq zzsqVar = new zzsq();
        zza = zzsqVar;
        zzacf.zzao(zzsq.class, zzsqVar);
    }

    private zzsq() {
    }

    public static zzsq zzc() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzsp.class});
        }
        if (i11 == 3) {
            return new zzsq();
        }
        zzsv zzsvVar = null;
        if (i11 == 4) {
            return new zzsn(zzsvVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
