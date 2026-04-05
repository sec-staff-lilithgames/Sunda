package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhla extends zzhwo implements zzhya {
    private static final zzhla zzd;
    private static volatile zzhyh zze;
    private String zza = "";
    private zzhvi zzb = zzhvi.zzb;
    private int zzc;

    static {
        zzhla zzhlaVar = new zzhla();
        zzd = zzhlaVar;
        zzhwo.zzbu(zzhla.class, zzhlaVar);
    }

    private zzhla() {
    }

    public static zzhla zzd(byte[] bArr, zzhvy zzhvyVar) throws zzhxd {
        return (zzhla) zzhwo.zzbV(zzd, bArr, zzhvyVar);
    }

    public static zzhkz zze() {
        return (zzhkz) zzd.zzbn();
    }

    public static zzhkz zzg(zzhla zzhlaVar) {
        return (zzhkz) zzd.zzbo(zzhlaVar);
    }

    public static zzhla zzh() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzhvi zzb() {
        return this.zzb;
    }

    public final zzhlt zzc() {
        zzhlt zzhltVarZzb = zzhlt.zzb(this.zzc);
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
            return zzhwo.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhla();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhkz(bArr);
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
        synchronized (zzhla.class) {
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

    public final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzj(zzhvi zzhviVar) {
        zzhviVar.getClass();
        this.zzb = zzhviVar;
    }

    public final /* synthetic */ void zzk(zzhlt zzhltVar) {
        this.zzc = zzhltVar.zza();
    }
}
