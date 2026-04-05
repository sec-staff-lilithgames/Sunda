package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzavd extends zzhwo implements zzhya {
    private static final zzavd zzf;
    private static volatile zzhyh zzg;
    private int zza;
    private zzhvi zzb;
    private zzhvi zzc;
    private zzhvi zzd;
    private zzhvi zze;

    static {
        zzavd zzavdVar = new zzavd();
        zzf = zzavdVar;
        zzhwo.zzbu(zzavd.class, zzavdVar);
    }

    private zzavd() {
        zzhvi zzhviVar = zzhvi.zzb;
        this.zzb = zzhviVar;
        this.zzc = zzhviVar;
        this.zzd = zzhviVar;
        this.zze = zzhviVar;
    }

    public static zzavd zze(byte[] bArr, zzhvy zzhvyVar) throws zzhxd {
        return (zzavd) zzhwo.zzbV(zzf, bArr, zzhvyVar);
    }

    public static zzavc zzg() {
        return (zzavc) zzf.zzbn();
    }

    public final zzhvi zza() {
        return this.zzb;
    }

    public final zzhvi zzb() {
        return this.zzc;
    }

    public final zzhvi zzc() {
        return this.zzd;
    }

    public final zzhvi zzd() {
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
            return zzhwo.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzavd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzavc(bArr);
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
        synchronized (zzavd.class) {
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

    public final /* synthetic */ void zzh(zzhvi zzhviVar) {
        this.zza |= 1;
        this.zzb = zzhviVar;
    }

    public final /* synthetic */ void zzi(zzhvi zzhviVar) {
        this.zza |= 2;
        this.zzc = zzhviVar;
    }

    public final /* synthetic */ void zzj(zzhvi zzhviVar) {
        this.zza |= 4;
        this.zzd = zzhviVar;
    }

    public final /* synthetic */ void zzk(zzhvi zzhviVar) {
        this.zza |= 8;
        this.zze = zzhviVar;
    }
}
