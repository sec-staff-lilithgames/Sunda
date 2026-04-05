package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzkx extends zzhk implements zzin {
    private static final zzkx zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzkx zzkxVar = new zzkx();
        zzb = zzkxVar;
        zzhk.zzx(zzkx.class, zzkxVar);
    }

    private zzkx() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzkx();
        }
        zzkw zzkwVar = null;
        if (i11 == 4) {
            return new zzkv(zzkwVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
