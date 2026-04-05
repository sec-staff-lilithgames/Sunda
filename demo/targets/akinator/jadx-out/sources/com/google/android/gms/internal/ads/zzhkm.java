package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhkm extends zzhwo implements zzhya {
    private static final zzhkm zzc;
    private static volatile zzhyh zzd;
    private int zza;
    private zzhvi zzb = zzhvi.zzb;

    static {
        zzhkm zzhkmVar = new zzhkm();
        zzc = zzhkmVar;
        zzhwo.zzbu(zzhkm.class, zzhkmVar);
    }

    private zzhkm() {
    }

    public static zzhkm zzc(zzhvi zzhviVar, zzhvy zzhvyVar) throws zzhxd {
        return (zzhkm) zzhwo.zzbT(zzc, zzhviVar, zzhvyVar);
    }

    public static zzhkl zzd() {
        return (zzhkl) zzc.zzbn();
    }

    public static zzhkm zze() {
        return zzc;
    }

    public static zzhyh zzg() {
        return zzc.zzbd();
    }

    public final int zza() {
        return this.zza;
    }

    public final zzhvi zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhkm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhkl(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhyh zzhyhVar = zzd;
        if (zzhyhVar != null) {
            return zzhyhVar;
        }
        synchronized (zzhkm.class) {
            try {
                zzhwjVar = zzd;
                if (zzhwjVar == null) {
                    zzhwjVar = new zzhwj(zzc);
                    zzd = zzhwjVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhwjVar;
    }

    public final /* synthetic */ void zzh(zzhvi zzhviVar) {
        this.zzb = zzhviVar;
    }
}
