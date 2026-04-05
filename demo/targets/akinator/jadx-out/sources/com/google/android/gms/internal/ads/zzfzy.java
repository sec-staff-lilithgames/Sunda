package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfzy extends zzhwo implements zzhya {
    private static final zzfzy zzf;
    private static volatile zzhyh zzg;
    private int zza;
    private zzgaa zzb;
    private zzhvi zzc;
    private zzhvi zzd;
    private int zze;

    static {
        zzfzy zzfzyVar = new zzfzy();
        zzf = zzfzyVar;
        zzhwo.zzbu(zzfzy.class, zzfzyVar);
    }

    private zzfzy() {
        zzhvi zzhviVar = zzhvi.zzb;
        this.zzc = zzhviVar;
        this.zzd = zzhviVar;
    }

    public static zzfzx zzd() {
        return (zzfzx) zzf.zzbn();
    }

    public final zzgaa zza() {
        zzgaa zzgaaVar = this.zzb;
        return zzgaaVar == null ? zzgaa.zze() : zzgaaVar;
    }

    public final zzhvi zzb() {
        return this.zzc;
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
            return zzhwo.zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", zzgao.zza});
        }
        if (iOrdinal == 3) {
            return new zzfzy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfzx(bArr);
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
        synchronized (zzfzy.class) {
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

    public final /* synthetic */ void zze(zzgaa zzgaaVar) {
        zzgaaVar.getClass();
        this.zzb = zzgaaVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzg(zzhvi zzhviVar) {
        zzhviVar.getClass();
        this.zza |= 2;
        this.zzc = zzhviVar;
    }

    public final /* synthetic */ void zzh(zzhvi zzhviVar) {
        zzhviVar.getClass();
        this.zza |= 4;
        this.zzd = zzhviVar;
    }

    public final int zzj() {
        int iZza = zzgap.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final /* synthetic */ void zzk(int i10) {
        this.zze = i10 - 1;
        this.zza |= 8;
    }
}
