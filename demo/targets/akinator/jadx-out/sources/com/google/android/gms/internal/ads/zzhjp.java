package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhjp extends zzhwo implements zzhya {
    private static final zzhjp zzc;
    private static volatile zzhyh zzd;
    private int zza;
    private int zzb;

    static {
        zzhjp zzhjpVar = new zzhjp();
        zzc = zzhjpVar;
        zzhwo.zzbu(zzhjp.class, zzhjpVar);
    }

    private zzhjp() {
    }

    public static zzhjp zzc(zzhvi zzhviVar, zzhvy zzhvyVar) throws zzhxd {
        return (zzhjp) zzhwo.zzbT(zzc, zzhviVar, zzhvyVar);
    }

    public static zzhjo zzd() {
        return (zzhjo) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
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
            return zzhwo.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhjp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhjo(bArr);
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
        synchronized (zzhjp.class) {
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

    public final /* synthetic */ void zze(int i10) {
        this.zza = i10;
    }
}
