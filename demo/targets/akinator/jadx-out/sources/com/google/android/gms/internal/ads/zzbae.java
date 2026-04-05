package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbae extends zzhwo implements zzhya {
    private static final zzbae zzd;
    private static volatile zzhyh zze;
    private int zza;
    private zzbag zzb;
    private zzhvi zzc = zzhvi.zzb;

    static {
        zzbae zzbaeVar = new zzbae();
        zzd = zzbaeVar;
        zzhwo.zzbu(zzbae.class, zzbaeVar);
    }

    private zzbae() {
    }

    public static zzbae zze() {
        return zzd;
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final zzbag zzb() {
        zzbag zzbagVar = this.zzb;
        return zzbagVar == null ? zzbag.zzc() : zzbagVar;
    }

    public final boolean zzc() {
        return (this.zza & 2) != 0;
    }

    public final zzhvi zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzbae();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbad(bArr);
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
        synchronized (zzbae.class) {
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
