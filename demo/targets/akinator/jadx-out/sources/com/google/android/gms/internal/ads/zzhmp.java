package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhmp extends zzhwo implements zzhya {
    private static final zzhmp zzd;
    private static volatile zzhyh zze;
    private int zza;
    private int zzb;
    private zzhmr zzc;

    static {
        zzhmp zzhmpVar = new zzhmp();
        zzd = zzhmpVar;
        zzhwo.zzbu(zzhmp.class, zzhmpVar);
    }

    private zzhmp() {
    }

    public static zzhmp zzc(zzhvi zzhviVar, zzhvy zzhvyVar) throws zzhxd {
        return (zzhmp) zzhwo.zzbT(zzd, zzhviVar, zzhvyVar);
    }

    public static zzhmo zzd() {
        return (zzhmo) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhmr zzb() {
        zzhmr zzhmrVar = this.zzc;
        return zzhmrVar == null ? zzhmr.zzc() : zzhmrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhmp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhmo(bArr);
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
        synchronized (zzhmp.class) {
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

    public final /* synthetic */ void zze(zzhmr zzhmrVar) {
        zzhmrVar.getClass();
        this.zzc = zzhmrVar;
        this.zza |= 1;
    }
}
