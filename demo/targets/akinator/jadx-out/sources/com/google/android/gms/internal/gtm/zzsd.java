package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzsd extends zzacf implements zzadm {
    private static final zzsd zza;
    private zzacn zzd = zzacf.zzai();

    static {
        zzsd zzsdVar = new zzsd();
        zza = zzsdVar;
        zzacf.zzao(zzsd.class, zzsdVar);
    }

    private zzsd() {
    }

    public static zzsd zzc() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new zzsd();
        }
        zzsc zzscVar = null;
        if (i11 == 4) {
            return new zzsb(zzscVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
