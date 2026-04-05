package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaai extends zzacf implements zzadm {
    private static final zzaai zza;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        zzaai zzaaiVar = new zzaai();
        zza = zzaaiVar;
        zzacf.zzao(zzaai.class, zzaaiVar);
    }

    private zzaai() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzacj zzacjVar = zzzk.zza;
            return new zzadv(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0003\u0002ဈ\u0001\u0003᠌\u0000\u0004᠌\u0002", new Object[]{"zzd", "zzh", "zzf", "zze", zzacjVar, "zzg", zzacjVar});
        }
        if (i11 == 3) {
            return new zzaai();
        }
        zzabm zzabmVar = null;
        if (i11 == 4) {
            return new zzaah(zzabmVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
