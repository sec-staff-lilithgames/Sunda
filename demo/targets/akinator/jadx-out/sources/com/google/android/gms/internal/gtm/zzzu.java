package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzzu extends zzacf implements zzadm {
    private static final zzzu zza;
    private int zzd;
    private boolean zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        zzzu zzzuVar = new zzzu();
        zza = zzzuVar;
        zzacf.zzao(zzzu.class, zzzuVar);
    }

    private zzzu() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new zzadv(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzzu();
        }
        zzabm zzabmVar = null;
        if (i11 == 4) {
            return new zzzt(zzabmVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
