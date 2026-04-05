package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhq extends zzmf implements zznn {
    private static final zzhq zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static {
        zzhq zzhqVar = new zzhq();
        zzf = zzhqVar;
        zzmf.zzcp(zzhq.class, zzhqVar);
    }

    private zzhq() {
    }

    public static zzhp zze() {
        return (zzhp) zzf.zzck();
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return (this.zzb & 2) != 0;
    }

    public final long zzd() {
        return this.zze;
    }

    public final /* synthetic */ void zzf(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    public final /* synthetic */ void zzg(long j10) {
        this.zzb |= 2;
        this.zze = j10;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzmf.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzhq();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzhp(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }
}
