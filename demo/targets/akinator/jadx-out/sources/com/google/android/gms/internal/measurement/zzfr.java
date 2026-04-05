package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfr extends zzmf implements zznn {
    private static final zzfr zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private zzmo zzg = zzmf.zzcv();

    static {
        zzfr zzfrVar = new zzfr();
        zzh = zzfrVar;
        zzmf.zzcp(zzfr.class, zzfrVar);
    }

    private zzfr() {
    }

    public static zzfr zzh() {
        return zzh;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final boolean zzb() {
        return (this.zzb & 2) != 0;
    }

    public final String zzc() {
        return this.zze;
    }

    public final boolean zzd() {
        return (this.zzb & 4) != 0;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final List zzf() {
        return this.zzg;
    }

    public final int zzg() {
        return this.zzg.size();
    }

    public final int zzj() {
        int iZza = zzfq.zza(this.zzd);
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
            return zzmf.zzcq(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", zzfp.zza, "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzfr();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzfo(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }
}
