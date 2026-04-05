package com.google.android.gms.internal.ads;

import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzazw extends zzhwo implements zzhya {
    private static final zzazw zzh;
    private static volatile zzhyh zzi;
    private int zza;
    private zzhvi zzb = zzhvi.zzb;
    private long zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private String zzg;

    static {
        zzazw zzazwVar = new zzazw();
        zzh = zzazwVar;
        zzhwo.zzbu(zzazw.class, zzazwVar);
    }

    public static zzazv zza() {
        return (zzazv) zzh.zzbn();
    }

    public final /* synthetic */ void zzb(zzhvi zzhviVar) {
        this.zza |= 1;
        this.zzb = zzhviVar;
    }

    public final /* synthetic */ void zzc(long j10) {
        this.zza |= 2;
        this.zzc = j10;
    }

    public final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzazw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzazv(bArr);
        }
        if (iOrdinal == 5) {
            return zzh;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhyh zzhyhVar = zzi;
        if (zzhyhVar != null) {
            return zzhyhVar;
        }
        synchronized (zzazw.class) {
            try {
                zzhwjVar = zzi;
                if (zzhwjVar == null) {
                    zzhwjVar = new zzhwj(zzh);
                    zzi = zzhwjVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhwjVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void zzg(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    public final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    private zzazw() {
        String str = uQjDr.IRgf;
        this.zzd = str;
        this.zze = str;
        this.zzg = str;
    }
}
