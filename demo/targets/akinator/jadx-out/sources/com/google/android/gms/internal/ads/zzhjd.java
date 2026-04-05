package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhjd extends zzhwo implements zzhya {
    private static final zzhjd zzd;
    private static volatile zzhyh zze;
    private int zza;
    private zzhjf zzb;
    private int zzc;

    static {
        zzhjd zzhjdVar = new zzhjd();
        zzd = zzhjdVar;
        zzhwo.zzbu(zzhjd.class, zzhjdVar);
    }

    private zzhjd() {
    }

    public static zzhjc zzc() {
        return (zzhjc) zzd.zzbn();
    }

    public static zzhjd zzd() {
        return zzd;
    }

    public final zzhjf zza() {
        zzhjf zzhjfVar = this.zzb;
        return zzhjfVar == null ? zzhjf.zzc() : zzhjfVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhjd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhjc(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhyh zzhyhVar = zze;
        if (zzhyhVar != null) {
            return zzhyhVar;
        }
        synchronized (zzhjd.class) {
            try {
                zzhwjVar = zze;
                if (zzhwjVar == null) {
                    zzhwjVar = new zzhwj(zzd);
                    zze = zzhwjVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhwjVar;
    }

    public final /* synthetic */ void zze(zzhjf zzhjfVar) {
        zzhjfVar.getClass();
        this.zzb = zzhjfVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzg(int i10) {
        this.zzc = i10;
    }
}
