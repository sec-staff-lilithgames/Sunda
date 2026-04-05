package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzzn extends zzacc implements zzadm {
    private static final zzzn zzd;
    private int zze;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private zzaae zzj;
    private byte zzl = 2;
    private String zzf = "";
    private zzacn zzk = zzadu.zze();

    static {
        zzzn zzznVar = new zzzn();
        zzd = zzznVar;
        zzacf.zzao(zzzn.class, zzznVar);
    }

    private zzzn() {
    }

    public static zzzn zze() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i11 == 2) {
            return new zzadv(zzd, "\u0001\u0006\u0000\u0001\u0001ϧ\u0006\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0006ဇ\u0003\u0007ᐉ\u0004ϧЛ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzabl.class});
        }
        if (i11 == 3) {
            return new zzzn();
        }
        zzabm zzabmVar = null;
        if (i11 == 4) {
            return new zzzm(zzabmVar);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
