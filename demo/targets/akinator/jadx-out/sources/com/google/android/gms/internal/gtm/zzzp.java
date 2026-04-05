package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzzp extends zzacc implements zzadm {
    private static final zzzp zzd;
    private int zze;
    private boolean zzf;
    private zzaae zzg;
    private boolean zzh;
    private zzaak zzi;
    private byte zzk = 2;
    private zzacn zzj = zzadu.zze();

    static {
        zzzp zzzpVar = new zzzp();
        zzd = zzzpVar;
        zzacf.zzao(zzzp.class, zzzpVar);
    }

    private zzzp() {
    }

    public static zzzp zze() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i11 == 2) {
            return new zzadv(zzd, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003ϧЛ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzabl.class});
        }
        if (i11 == 3) {
            return new zzzp();
        }
        zzabm zzabmVar = null;
        if (i11 == 4) {
            return new zzzo(zzabmVar);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
