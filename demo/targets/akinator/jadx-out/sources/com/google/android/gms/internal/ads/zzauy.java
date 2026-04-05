package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzauy extends zzhwo implements zzhya {
    private static final zzauy zzj;
    private static volatile zzhyh zzk;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    static {
        zzauy zzauyVar = new zzauy();
        zzj = zzauyVar;
        zzhwo.zzbu(zzauy.class, zzauyVar);
    }

    private zzauy() {
    }

    public static zzaux zza() {
        return (zzaux) zzj.zzbn();
    }

    public final /* synthetic */ void zzb(long j10) {
        this.zza |= 1;
        this.zzb = j10;
    }

    public final /* synthetic */ void zzc(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    public final /* synthetic */ void zzd(long j10) {
        this.zza |= 8;
        this.zze = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzauy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaux(bArr);
        }
        if (iOrdinal == 5) {
            return zzj;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhyh zzhyhVar = zzk;
        if (zzhyhVar != null) {
            return zzhyhVar;
        }
        synchronized (zzauy.class) {
            try {
                zzhwjVar = zzk;
                if (zzhwjVar == null) {
                    zzhwjVar = new zzhwj(zzj);
                    zzk = zzhwjVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhwjVar;
    }

    public final /* synthetic */ void zze(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    public final /* synthetic */ void zzg(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }
}
