package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhiz extends zzhwo implements zzhya {
    private static final zzhiz zzd;
    private static volatile zzhyh zze;
    private int zza;
    private zzhjd zzb;
    private zzhks zzc;

    static {
        zzhiz zzhizVar = new zzhiz();
        zzd = zzhizVar;
        zzhwo.zzbu(zzhiz.class, zzhizVar);
    }

    private zzhiz() {
    }

    public static zzhiz zzc(zzhvi zzhviVar, zzhvy zzhvyVar) throws zzhxd {
        return (zzhiz) zzhwo.zzbT(zzd, zzhviVar, zzhvyVar);
    }

    public static zzhiy zzd() {
        return (zzhiy) zzd.zzbn();
    }

    public final zzhjd zza() {
        zzhjd zzhjdVar = this.zzb;
        return zzhjdVar == null ? zzhjd.zzd() : zzhjdVar;
    }

    public final zzhks zzb() {
        zzhks zzhksVar = this.zzc;
        return zzhksVar == null ? zzhks.zzg() : zzhksVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhiz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhiy(bArr);
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
        synchronized (zzhiz.class) {
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

    public final /* synthetic */ void zze(zzhjd zzhjdVar) {
        zzhjdVar.getClass();
        this.zzb = zzhjdVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzg(zzhks zzhksVar) {
        zzhksVar.getClass();
        this.zzc = zzhksVar;
        this.zza |= 2;
    }
}
