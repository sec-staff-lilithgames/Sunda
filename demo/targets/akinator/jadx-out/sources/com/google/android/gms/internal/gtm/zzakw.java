package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzakw extends zzacf implements zzadm {
    private static final zzakw zza;
    private int zzd;
    private boolean zzf;
    private zzacn zze = zzacf.zzai();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    static {
        zzakw zzakwVar = new zzakw();
        zza = zzakwVar;
        zzacf.zzao(zzakw.class, zzakwVar);
    }

    private zzakw() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006", new Object[]{"zzd", "zze", zzaku.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new zzakw();
        }
        zzamq zzamqVar = null;
        if (i11 == 4) {
            return new zzakv(zzamqVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
