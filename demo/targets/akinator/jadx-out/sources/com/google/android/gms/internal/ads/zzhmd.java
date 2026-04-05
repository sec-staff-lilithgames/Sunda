package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhmd extends zzhwo implements zzhya {
    private static final zzhmd zzf;
    private static volatile zzhyh zzg;
    private int zza;
    private int zzb;
    private zzhlz zzc;
    private zzhvi zzd;
    private zzhvi zze;

    static {
        zzhmd zzhmdVar = new zzhmd();
        zzf = zzhmdVar;
        zzhwo.zzbu(zzhmd.class, zzhmdVar);
    }

    private zzhmd() {
        zzhvi zzhviVar = zzhvi.zzb;
        this.zzd = zzhviVar;
        this.zze = zzhviVar;
    }

    public static zzhmd zze(zzhvi zzhviVar, zzhvy zzhvyVar) throws zzhxd {
        return (zzhmd) zzhwo.zzbT(zzf, zzhviVar, zzhvyVar);
    }

    public static zzhmc zzg() {
        return (zzhmc) zzf.zzbn();
    }

    public static zzhmd zzh() {
        return zzf;
    }

    public static zzhyh zzi() {
        return zzf.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhlz zzb() {
        zzhlz zzhlzVar = this.zzc;
        return zzhlzVar == null ? zzhlz.zzc() : zzhlzVar;
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
            return zzhwo.zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzhmd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhmc(bArr);
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
        synchronized (zzhmd.class) {
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

    public final /* synthetic */ void zzj(zzhlz zzhlzVar) {
        zzhlzVar.getClass();
        this.zzc = zzhlzVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzk(zzhvi zzhviVar) {
        this.zzd = zzhviVar;
    }

    public final /* synthetic */ void zzl(zzhvi zzhviVar) {
        this.zze = zzhviVar;
    }
}
