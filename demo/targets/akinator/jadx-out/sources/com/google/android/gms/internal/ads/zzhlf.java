package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhlf extends zzhwo implements zzhya {
    private static final zzhlf zzf;
    private static volatile zzhyh zzg;
    private int zza;
    private zzhkx zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        zzhlf zzhlfVar = new zzhlf();
        zzf = zzhlfVar;
        zzhwo.zzbu(zzhlf.class, zzhlfVar);
    }

    private zzhlf() {
    }

    public static zzhle zze() {
        return (zzhle) zzf.zzbn();
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final zzhkx zzb() {
        zzhkx zzhkxVar = this.zzb;
        return zzhkxVar == null ? zzhkx.zze() : zzhkxVar;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzhlt zzd() {
        zzhlt zzhltVarZzb = zzhlt.zzb(this.zze);
        return zzhltVarZzb == null ? zzhlt.UNRECOGNIZED : zzhltVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzhlf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhle(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhyh zzhyhVar = zzg;
        if (zzhyhVar != null) {
            return zzhyhVar;
        }
        synchronized (zzhlf.class) {
            try {
                zzhwjVar = zzg;
                if (zzhwjVar == null) {
                    zzhwjVar = new zzhwj(zzf);
                    zzg = zzhwjVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhwjVar;
    }

    public final /* synthetic */ void zzg(zzhkx zzhkxVar) {
        zzhkxVar.getClass();
        this.zzb = zzhkxVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzh(int i10) {
        this.zzd = i10;
    }

    public final /* synthetic */ void zzi(zzhlt zzhltVar) {
        this.zze = zzhltVar.zza();
    }

    public final int zzk() {
        int i10 = this.zzc;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final /* synthetic */ void zzl(int i10) {
        this.zzc = zzhky.zza(i10);
    }
}
