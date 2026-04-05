package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhkb extends zzhwo implements zzhya {
    private static final zzhkb zzd;
    private static volatile zzhyh zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhkb zzhkbVar = new zzhkb();
        zzd = zzhkbVar;
        zzhwo.zzbu(zzhkb.class, zzhkbVar);
    }

    private zzhkb() {
    }

    public static zzhka zzb() {
        return (zzhka) zzd.zzbn();
    }

    public static zzhkb zzc() {
        return zzd;
    }

    public final zzhko zza() {
        zzhko zzhkoVarZzb = zzhko.zzb(this.zza);
        return zzhkoVarZzb == null ? zzhko.UNRECOGNIZED : zzhkoVarZzb;
    }

    public final /* synthetic */ void zzd(zzhko zzhkoVar) {
        this.zza = zzhkoVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhkb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhka(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhyh zzhyhVar = zze;
        if (zzhyhVar != null) {
            return zzhyhVar;
        }
        synchronized (zzhkb.class) {
            try {
                zzhwjVar = zze;
                if (zzhwjVar == null) {
                    zzhwjVar = new zzhwj(zzd);
                    zze = zzhwjVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhwjVar;
    }

    public final int zzg() {
        int i10 = this.zzb;
        int i11 = i10 != 0 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int zzh() {
        int i10 = this.zzc;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? 0 : 4 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final /* synthetic */ void zzi(int i10) {
        this.zzb = zzhkn.zza(i10);
    }

    public final /* synthetic */ void zzj(int i10) {
        this.zzc = zzhkg.zza(i10);
    }
}
