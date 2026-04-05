package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzwr extends zzacf implements zzadm {
    private static final zzwr zza;
    private Object zze;
    private Object zzg;
    private int zzd = 0;
    private int zzf = 0;
    private byte zzh = 2;

    static {
        zzwr zzwrVar = new zzwr();
        zza = zzwrVar;
        zzacf.zzao(zzwr.class, zzwrVar);
    }

    private zzwr() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0001\u0005\u0002\u0000\u0001\u0005\u0005\u0000\u0000\u0003\u0001м\u0000\u0002м\u0001\u0003м\u0000\u0004;\u0000\u0005;\u0001", new Object[]{"zze", "zzd", "zzg", "zzf", zzxo.class, zzxj.class, zzxm.class});
        }
        if (i11 == 3) {
            return new zzwr();
        }
        zzws zzwsVar = null;
        if (i11 == 4) {
            return new zzwq(zzwsVar);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
