package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzais extends zzacf implements zzadm {
    private static final zzais zza;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;

    static {
        zzais zzaisVar = new zzais();
        zza = zzaisVar;
        zzacf.zzao(zzais.class, zzaisVar);
    }

    private zzais() {
    }

    public static zzais zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzais();
        }
        zzait zzaitVar = null;
        if (i11 == 4) {
            return new zzair(zzaitVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
