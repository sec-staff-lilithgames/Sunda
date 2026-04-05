package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzate extends zzhwo implements zzhya {
    private static final zzate zzj;
    private static volatile zzhyh zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private zzatv zzg;
    private zzaub zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        zzate zzateVar = new zzate();
        zzj = zzateVar;
        zzhwo.zzbu(zzate.class, zzateVar);
    }

    private zzate() {
    }

    public static zzatd zze() {
        return (zzatd) zzj.zzbn();
    }

    public final String zza() {
        return this.zzd;
    }

    @Deprecated
    public final boolean zzb() {
        return this.zze;
    }

    public final zzatv zzc() {
        zzatv zzatvVar = this.zzg;
        return zzatvVar == null ? zzatv.zzg() : zzatvVar;
    }

    public final zzaub zzd() {
        zzaub zzaubVar = this.zzh;
        return zzaubVar == null ? zzaub.zza() : zzaubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", zzath.zza, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzate();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzatd(bArr);
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
        synchronized (zzate.class) {
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

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void zzh(boolean z10) {
        this.zza |= 8;
        this.zze = z10;
    }
}
