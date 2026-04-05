package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbac extends zzhwo implements zzhya {
    private static final zzbac zze;
    private static volatile zzhyh zzf;
    private int zza;
    private zzbai zzb;
    private zzhvi zzc;
    private zzhvi zzd;

    static {
        zzbac zzbacVar = new zzbac();
        zze = zzbacVar;
        zzhwo.zzbu(zzbac.class, zzbacVar);
    }

    private zzbac() {
        zzhvi zzhviVar = zzhvi.zzb;
        this.zzc = zzhviVar;
        this.zzd = zzhviVar;
    }

    public static zzbac zzd(zzhvi zzhviVar, zzhvy zzhvyVar) throws zzhxd {
        return (zzbac) zzhwo.zzbT(zze, zzhviVar, zzhvyVar);
    }

    public static zzbac zze(byte[] bArr, zzhvy zzhvyVar) throws zzhxd {
        return (zzbac) zzhwo.zzbV(zze, bArr, zzhvyVar);
    }

    public final zzbai zza() {
        zzbai zzbaiVar = this.zzb;
        return zzbaiVar == null ? zzbai.zzj() : zzbaiVar;
    }

    public final zzhvi zzb() {
        return this.zzc;
    }

    public final zzhvi zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzbac();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbab(bArr);
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
        synchronized (zzbac.class) {
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
}
