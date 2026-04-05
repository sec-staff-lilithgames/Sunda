package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbai extends zzhwo implements zzhya {
    private static final zzbai zzg;
    private static volatile zzhyh zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        zzbai zzbaiVar = new zzbai();
        zzg = zzbaiVar;
        zzhwo.zzbu(zzbai.class, zzbaiVar);
    }

    private zzbai() {
    }

    public static zzbai zzg(zzhvi zzhviVar) throws zzhxd {
        return (zzbai) zzhwo.zzbS(zzg, zzhviVar);
    }

    public static zzbai zzh(zzhvi zzhviVar, zzhvy zzhvyVar) throws zzhxd {
        return (zzbai) zzhwo.zzbT(zzg, zzhviVar, zzhvyVar);
    }

    public static zzbah zzi() {
        return (zzbah) zzg.zzbn();
    }

    public static zzbai zzj() {
        return zzg;
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zzd;
    }

    public final long zzd() {
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
            return zzhwo.zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzbai();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbah(bArr);
        }
        if (iOrdinal == 5) {
            return zzg;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhyh zzhyhVar = zzh;
        if (zzhyhVar != null) {
            return zzhyhVar;
        }
        synchronized (zzbai.class) {
            try {
                zzhwjVar = zzh;
                if (zzhwjVar == null) {
                    zzhwjVar = new zzhwj(zzg);
                    zzh = zzhwjVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhwjVar;
    }

    public final long zze() {
        return this.zzf;
    }

    public final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void zzm(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    public final /* synthetic */ void zzn(long j10) {
        this.zza |= 8;
        this.zze = j10;
    }

    public final /* synthetic */ void zzo(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }
}
