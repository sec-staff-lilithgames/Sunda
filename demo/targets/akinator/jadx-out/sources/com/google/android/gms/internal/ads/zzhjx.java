package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhjx extends zzhwo implements zzhya {
    private static final zzhjx zza;
    private static volatile zzhyh zzb;

    static {
        zzhjx zzhjxVar = new zzhjx();
        zza = zzhjxVar;
        zzhwo.zzbu(zzhjx.class, zzhjxVar);
    }

    private zzhjx() {
    }

    public static zzhjx zza(zzhvi zzhviVar, zzhvy zzhvyVar) throws zzhxd {
        return (zzhjx) zzhwo.zzbT(zza, zzhviVar, zzhvyVar);
    }

    public static zzhjx zzb() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zza, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new zzhjx();
        }
        if (iOrdinal == 4) {
            return new zzhjw(bArr);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhyh zzhyhVar = zzb;
        if (zzhyhVar != null) {
            return zzhyhVar;
        }
        synchronized (zzhjx.class) {
            try {
                zzhwjVar = zzb;
                if (zzhwjVar == null) {
                    zzhwjVar = new zzhwj(zza);
                    zzb = zzhwjVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhwjVar;
    }
}
