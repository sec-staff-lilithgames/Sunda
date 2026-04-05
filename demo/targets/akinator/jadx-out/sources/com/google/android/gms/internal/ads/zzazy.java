package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzazy extends zzhwo implements zzhya {
    private static final zzazy zzc;
    private static volatile zzhyh zzd;
    private int zza;
    private zzbae zzb;

    static {
        zzazy zzazyVar = new zzazy();
        zzc = zzazyVar;
        zzhwo.zzbu(zzazy.class, zzazyVar);
    }

    private zzazy() {
    }

    public static zzazy zzb(byte[] bArr, zzhvy zzhvyVar) throws zzhxd {
        return (zzazy) zzhwo.zzbV(zzc, bArr, zzhvyVar);
    }

    public final zzbae zza() {
        zzbae zzbaeVar = this.zzb;
        return zzbaeVar == null ? zzbae.zze() : zzbaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzc, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzazy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzazx(bArr);
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
        synchronized (zzazy.class) {
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
}
