package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhjz extends zzhwo implements zzhya {
    private static final zzhjz zzd;
    private static volatile zzhyh zze;
    private int zza;
    private zzhkb zzb;
    private int zzc;

    static {
        zzhjz zzhjzVar = new zzhjz();
        zzd = zzhjzVar;
        zzhwo.zzbu(zzhjz.class, zzhjzVar);
    }

    private zzhjz() {
    }

    public static zzhjz zzb(zzhvi zzhviVar, zzhvy zzhvyVar) throws zzhxd {
        return (zzhjz) zzhwo.zzbT(zzd, zzhviVar, zzhvyVar);
    }

    public static zzhjy zzc() {
        return (zzhjy) zzd.zzbn();
    }

    public final zzhkb zza() {
        zzhkb zzhkbVar = this.zzb;
        return zzhkbVar == null ? zzhkb.zzc() : zzhkbVar;
    }

    public final /* synthetic */ void zzd(zzhkb zzhkbVar) {
        zzhkbVar.getClass();
        this.zzb = zzhkbVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhjz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhjy(bArr);
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
        synchronized (zzhjz.class) {
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
}
