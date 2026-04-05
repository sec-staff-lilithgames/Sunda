package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhkk extends zzhwo implements zzhya {
    private static final zzhkk zze;
    private static volatile zzhyh zzf;
    private int zza;
    private int zzb;
    private zzhvi zzc = zzhvi.zzb;
    private zzhkm zzd;

    static {
        zzhkk zzhkkVar = new zzhkk();
        zze = zzhkkVar;
        zzhwo.zzbu(zzhkk.class, zzhkkVar);
    }

    private zzhkk() {
    }

    public static zzhkk zzd(zzhvi zzhviVar, zzhvy zzhvyVar) throws zzhxd {
        return (zzhkk) zzhwo.zzbT(zze, zzhviVar, zzhvyVar);
    }

    public static zzhkj zze() {
        return (zzhkj) zze.zzbn();
    }

    public static zzhyh zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhvi zzb() {
        return this.zzc;
    }

    public final zzhkm zzc() {
        zzhkm zzhkmVar = this.zzd;
        return zzhkmVar == null ? zzhkm.zze() : zzhkmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhkk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhkj(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhyh zzhyhVar = zzf;
        if (zzhyhVar != null) {
            return zzhyhVar;
        }
        synchronized (zzhkk.class) {
            try {
                zzhwjVar = zzf;
                if (zzhwjVar == null) {
                    zzhwjVar = new zzhwj(zze);
                    zzf = zzhwjVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhwjVar;
    }

    public final /* synthetic */ void zzh(zzhvi zzhviVar) {
        this.zzc = zzhviVar;
    }

    public final /* synthetic */ void zzi(zzhkm zzhkmVar) {
        zzhkmVar.getClass();
        this.zzd = zzhkmVar;
        this.zza |= 1;
    }
}
