package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhmn extends zzhwo implements zzhya {
    private static final zzhmn zze;
    private static volatile zzhyh zzf;
    private int zza;
    private int zzb;
    private zzhmr zzc;
    private zzhvi zzd = zzhvi.zzb;

    static {
        zzhmn zzhmnVar = new zzhmn();
        zze = zzhmnVar;
        zzhwo.zzbu(zzhmn.class, zzhmnVar);
    }

    private zzhmn() {
    }

    public static zzhmn zzd(zzhvi zzhviVar, zzhvy zzhvyVar) throws zzhxd {
        return (zzhmn) zzhwo.zzbT(zze, zzhviVar, zzhvyVar);
    }

    public static zzhmm zze() {
        return (zzhmm) zze.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhmr zzb() {
        zzhmr zzhmrVar = this.zzc;
        return zzhmrVar == null ? zzhmr.zzc() : zzhmrVar;
    }

    public final zzhvi zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhmn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhmm(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhyh zzhyhVar = zzf;
        if (zzhyhVar != null) {
            return zzhyhVar;
        }
        synchronized (zzhmn.class) {
            try {
                zzhwjVar = zzf;
                if (zzhwjVar == null) {
                    zzhwjVar = new zzhwj(zze);
                    zzf = zzhwjVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhwjVar;
    }

    public final /* synthetic */ void zzg(zzhmr zzhmrVar) {
        zzhmrVar.getClass();
        this.zzc = zzhmrVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzh(zzhvi zzhviVar) {
        this.zzd = zzhviVar;
    }
}
