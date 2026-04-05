package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfvg extends zzhwo implements zzhya {
    private static final zzfvg zzn;
    private static volatile zzhyh zzo;
    private int zza;
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private String zzb = "";
    private zzhwz zzk = zzhwo.zzbE();
    private zzhwz zzl = zzhwo.zzbE();
    private zzhwz zzm = zzhwo.zzbE();

    static {
        zzfvg zzfvgVar = new zzfvg();
        zzn = zzfvgVar;
        zzhwo.zzbu(zzfvg.class, zzfvgVar);
    }

    private zzfvg() {
    }

    public static zzfvg zzp() {
        return zzn;
    }

    public final /* synthetic */ void zzA(long j10) {
        zzhwz zzhwzVar = this.zzl;
        if (!zzhwzVar.zza()) {
            this.zzl = zzhwo.zzbF(zzhwzVar);
        }
        this.zzl.zzd(j10);
    }

    public final /* synthetic */ void zzB(long j10) {
        zzhwz zzhwzVar = this.zzm;
        if (!zzhwzVar.zza()) {
            this.zzm = zzhwo.zzbF(zzhwzVar);
        }
        this.zzm.zzd(j10);
    }

    public final /* synthetic */ void zzC() {
        this.zzm = zzhwo.zzbE();
    }

    public final String zza() {
        return this.zzb;
    }

    public final long zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
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
            return zzhwo.zzbv(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iOrdinal == 3) {
            return new zzfvg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfvf(bArr);
        }
        if (iOrdinal == 5) {
            return zzn;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhyh zzhyhVar = zzo;
        if (zzhyhVar != null) {
            return zzhyhVar;
        }
        synchronized (zzfvg.class) {
            try {
                zzhwjVar = zzo;
                if (zzhwjVar == null) {
                    zzhwjVar = new zzhwj(zzn);
                    zzo = zzhwjVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhwjVar;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final long zzg() {
        return this.zzg;
    }

    public final long zzh() {
        return this.zzh;
    }

    public final long zzi() {
        return this.zzi;
    }

    public final boolean zzj() {
        return (this.zza & 64) != 0;
    }

    public final List zzk() {
        return this.zzk;
    }

    public final int zzl() {
        return this.zzk.size();
    }

    public final int zzm() {
        return this.zzl.size();
    }

    public final List zzn() {
        return this.zzm;
    }

    public final int zzo() {
        return this.zzm.size();
    }

    public final /* synthetic */ void zzq(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void zzr(long j10) {
        this.zza |= 1;
        this.zzc = j10;
    }

    public final /* synthetic */ void zzs(int i10) {
        this.zza |= 2;
        this.zzd = i10;
    }

    public final /* synthetic */ void zzt(boolean z10) {
        this.zza |= 4;
        this.zze = true;
    }

    public final /* synthetic */ void zzu(boolean z10) {
        this.zza |= 8;
        this.zzf = true;
    }

    public final /* synthetic */ void zzv(long j10) {
        this.zza |= 16;
        this.zzg = j10;
    }

    public final /* synthetic */ void zzw(long j10) {
        this.zzh = j10;
    }

    public final /* synthetic */ void zzx(long j10) {
        this.zza |= 32;
        this.zzi = j10;
    }

    public final /* synthetic */ void zzy(long j10) {
        this.zza |= 64;
        this.zzj = j10;
    }

    public final /* synthetic */ void zzz(long j10) {
        zzhwz zzhwzVar = this.zzk;
        if (!zzhwzVar.zza()) {
            this.zzk = zzhwo.zzbF(zzhwzVar);
        }
        this.zzk.zzd(j10);
    }
}
