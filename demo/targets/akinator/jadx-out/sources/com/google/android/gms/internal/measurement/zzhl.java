package com.google.android.gms.internal.measurement;

import cv.BLca.YsiBvdpw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhl extends zzmf implements zznn {
    private static final zzhl zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        zzhl zzhlVar = new zzhl();
        zzf = zzhlVar;
        zzmf.zzcp(zzhl.class, zzhlVar);
    }

    private zzhl() {
    }

    public static zzhk zza() {
        return (zzhk) zzf.zzck();
    }

    public final int zzc() {
        int iZza = zzhj.zza(this.zzd);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzd() {
        int iZza = zzhn.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final /* synthetic */ void zze(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void zzf(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzmf.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{YsiBvdpw.nkJL, "zzd", zzhi.zza, "zze", zzhm.zza});
        }
        if (i11 == 3) {
            return new zzhl();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzhk(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }
}
