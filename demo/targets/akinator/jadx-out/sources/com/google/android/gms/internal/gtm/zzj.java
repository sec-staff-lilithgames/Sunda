package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzj extends zzacf implements zzadm {
    private static final zzj zza;
    private int zzd;
    private zzap zzk;
    private byte zzl = 2;
    private zzacn zze = zzacf.zzai();
    private zzacn zzf = zzacf.zzai();
    private zzacn zzg = zzacf.zzai();
    private zzacn zzh = zzacf.zzai();
    private zzacn zzi = zzacf.zzai();
    private zzacn zzj = zzacf.zzai();

    static {
        zzj zzjVar = new zzj();
        zza = zzjVar;
        zzacf.zzao(zzj.class, zzjVar);
    }

    private zzj() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0006\u0007\u0001Л\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0000", new Object[]{"zzd", "zze", zzf.class, "zzf", zzf.class, "zzg", zzf.class, "zzh", zzf.class, "zzi", zzf.class, "zzj", zzf.class, "zzk"});
        }
        if (i11 == 3) {
            return new zzj();
        }
        zzm zzmVar = null;
        if (i11 == 4) {
            return new zzi(zzmVar);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
