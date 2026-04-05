package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaty extends zzhwo implements zzhya {
    private static final zzaty zzi;
    private static volatile zzhyh zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        zzaty zzatyVar = new zzaty();
        zzi = zzatyVar;
        zzhwo.zzbu(zzaty.class, zzatyVar);
    }

    private zzaty() {
    }

    public static zzatx zza() {
        return (zzatx) zzi.zzbn();
    }

    public final /* synthetic */ void zzb(long j10) {
        this.zza |= 1;
        this.zzb = j10;
    }

    public final /* synthetic */ void zzc(long j10) {
        this.zza |= 2;
        this.zzc = j10;
    }

    public final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", zzatz.zza, "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzaty();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzatx(bArr);
        }
        if (iOrdinal == 5) {
            return zzi;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhyh zzhyhVar = zzj;
        if (zzhyhVar != null) {
            return zzhyhVar;
        }
        synchronized (zzaty.class) {
            try {
                zzhwjVar = zzj;
                if (zzhwjVar == null) {
                    zzhwjVar = new zzhwj(zzi);
                    zzj = zzhwjVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhwjVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void zzg(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }

    public final /* synthetic */ void zzh(String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    public final /* synthetic */ void zzj(int i10) {
        this.zzd = i10 - 1;
        this.zza |= 4;
    }
}
