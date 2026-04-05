package com.google.android.gms.internal.gtm;

import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzzw extends zzacc implements zzadm {
    private static final zzzw zzd;
    private int zze;
    private zzzu zzg;
    private zzaae zzi;
    private byte zzk = 2;
    private zzacn zzf = zzadu.zze();
    private zzacn zzh = zzadu.zze();
    private int zzj = 1;

    static {
        zzzw zzzwVar = new zzzw();
        zzd = zzzwVar;
        zzacf.zzao(zzzw.class, zzzwVar);
    }

    private zzzw() {
    }

    public static zzzw zze() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i11 == 2) {
            return new zzadv(zzd, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0002\u0002\u0001ဉ\u0000\u0002\u001b\u0003᠌\u00022ᐉ\u0001ϧЛ", new Object[]{"zze", QpyI.sSpdavolBnx, "zzh", zzzs.class, "zzj", zzzv.zza, "zzi", "zzf", zzabl.class});
        }
        if (i11 == 3) {
            return new zzzw();
        }
        zzabm zzabmVar = null;
        if (i11 == 4) {
            return new zzzq(zzabmVar);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
