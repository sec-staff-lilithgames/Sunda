package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzt extends zzacf implements zzadm {
    private static final zzt zza;
    private int zzd;
    private long zzf;
    private boolean zzh;
    private long zzi;
    private String zze = "";
    private long zzg = 2147483647L;

    static {
        zzt zztVar = new zzt();
        zza = zztVar;
        zzacf.zzao(zzt.class, zztVar);
    }

    private zzt() {
    }

    public final long zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဂ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzt();
        }
        zzai zzaiVar = null;
        if (i11 == 4) {
            return new zzs(zzaiVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }

    public final long zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zzh;
    }

    public final boolean zzh() {
        return (this.zzd & 1) != 0;
    }
}
