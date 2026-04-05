package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhkx extends zzhwo implements zzhya {
    private static final zzhkx zzd;
    private static volatile zzhyh zze;
    private String zza = "";
    private zzhvi zzb = zzhvi.zzb;
    private int zzc;

    static {
        zzhkx zzhkxVar = new zzhkx();
        zzd = zzhkxVar;
        zzhwo.zzbu(zzhkx.class, zzhkxVar);
    }

    private zzhkx() {
    }

    public static zzhkv zzd() {
        return (zzhkv) zzd.zzbn();
    }

    public static zzhkx zze() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzhvi zzb() {
        return this.zzb;
    }

    public final zzhkw zzc() {
        int i10 = this.zzc;
        zzhkw zzhkwVar = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? null : zzhkw.REMOTE : zzhkw.ASYMMETRIC_PUBLIC : zzhkw.ASYMMETRIC_PRIVATE : zzhkw.SYMMETRIC : zzhkw.UNKNOWN_KEYMATERIAL;
        return zzhkwVar == null ? zzhkw.UNRECOGNIZED : zzhkwVar;
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
            return new zzhkx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhkv(bArr);
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
        synchronized (zzhkx.class) {
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

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzh(zzhvi zzhviVar) {
        zzhviVar.getClass();
        this.zzb = zzhviVar;
    }

    public final /* synthetic */ void zzi(zzhkw zzhkwVar) {
        this.zzc = zzhkwVar.zza();
    }
}
