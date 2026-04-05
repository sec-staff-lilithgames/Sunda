package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbag extends zzhwo implements zzhya {
    private static final zzbag zzf;
    private static volatile zzhyh zzg;
    private int zza;
    private zzbak zzb;
    private zzhvi zzc = zzhvi.zzb;
    private long zzd;
    private long zze;

    static {
        zzbag zzbagVar = new zzbag();
        zzf = zzbagVar;
        zzhwo.zzbu(zzbag.class, zzbagVar);
    }

    private zzbag() {
    }

    public static zzbag zzc() {
        return zzf;
    }

    public final zzhvi zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzbag();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbaf(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhyh zzhyhVar = zzg;
        if (zzhyhVar != null) {
            return zzhyhVar;
        }
        synchronized (zzbag.class) {
            try {
                zzhwjVar = zzg;
                if (zzhwjVar == null) {
                    zzhwjVar = new zzhwj(zzf);
                    zzg = zzhwjVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhwjVar;
    }
}
