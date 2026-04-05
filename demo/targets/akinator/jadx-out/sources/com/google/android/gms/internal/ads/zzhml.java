package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhml extends zzhwo implements zzhya {
    private static final zzhml zzf;
    private static volatile zzhyh zzg;
    private int zza;
    private int zzb;
    private zzhmh zzc;
    private zzhvi zzd;
    private zzhvi zze;

    static {
        zzhml zzhmlVar = new zzhml();
        zzf = zzhmlVar;
        zzhwo.zzbu(zzhml.class, zzhmlVar);
    }

    private zzhml() {
        zzhvi zzhviVar = zzhvi.zzb;
        this.zzd = zzhviVar;
        this.zze = zzhviVar;
    }

    public static zzhml zze(zzhvi zzhviVar, zzhvy zzhvyVar) throws zzhxd {
        return (zzhml) zzhwo.zzbT(zzf, zzhviVar, zzhvyVar);
    }

    public static zzhmk zzg() {
        return (zzhmk) zzf.zzbn();
    }

    public static zzhml zzh() {
        return zzf;
    }

    public static zzhyh zzi() {
        return zzf.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhmh zzb() {
        zzhmh zzhmhVar = this.zzc;
        return zzhmhVar == null ? zzhmh.zze() : zzhmhVar;
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
            return new zzhml();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhmk(bArr);
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
        synchronized (zzhml.class) {
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

    public final /* synthetic */ void zzj(int i10) {
        this.zzb = 0;
    }

    public final /* synthetic */ void zzk(zzhmh zzhmhVar) {
        zzhmhVar.getClass();
        this.zzc = zzhmhVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzl(zzhvi zzhviVar) {
        this.zzd = zzhviVar;
    }

    public final /* synthetic */ void zzm(zzhvi zzhviVar) {
        this.zze = zzhviVar;
    }
}
