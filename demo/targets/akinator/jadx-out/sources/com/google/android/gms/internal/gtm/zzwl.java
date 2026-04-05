package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzwl extends zzacf implements zzadm {
    private static final zzwl zza;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        zzwl zzwlVar = new zzwl();
        zza = zzwlVar;
        zzacf.zzao(zzwl.class, zzwlVar);
    }

    private zzwl() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzacj zzacjVar = zzwk.zza;
            return zzacf.zzal(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006", new Object[]{"zzd", "zze", zzacjVar, "zzf", zzacjVar, "zzg", zzacjVar, "zzh", zzacjVar, "zzi", zzacjVar, "zzj", zzacjVar, "zzk", zzacjVar});
        }
        if (i11 == 3) {
            return new zzwl();
        }
        zzwm zzwmVar = null;
        if (i11 == 4) {
            return new zzwj(zzwmVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
