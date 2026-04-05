package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzje extends zzmf implements zznn {
    private static final zzje zzj;
    private int zzb;
    private int zzd;
    private zzmo zze = zzmf.zzcv();
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;
    private double zzi;

    static {
        zzje zzjeVar = new zzje();
        zzj = zzjeVar;
        zzmf.zzcp(zzje.class, zzjeVar);
    }

    private zzje() {
    }

    public final List zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzf;
    }

    public final boolean zzc() {
        return (this.zzb & 4) != 0;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final boolean zze() {
        return (this.zzb & 8) != 0;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zzb & 16) != 0;
    }

    public final double zzh() {
        return this.zzi;
    }

    public final int zzj() {
        int iZza = zzjd.zza(this.zzd);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzmf.zzcq(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzd", zzjc.zza, "zze", zzje.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzje();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzjb(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }
}
