package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzkl extends zzhk implements zzin {
    private static final zzkl zzb;

    static {
        zzkl zzklVar = new zzkl();
        zzb = zzklVar;
        zzhk.zzx(zzkl.class, zzklVar);
    }

    private zzkl() {
    }

    public static zzkl zzB() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        zzkk zzkkVar = null;
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0000", null);
        }
        if (i11 == 3) {
            return new zzkl();
        }
        if (i11 == 4) {
            return new zzkj(zzkkVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
