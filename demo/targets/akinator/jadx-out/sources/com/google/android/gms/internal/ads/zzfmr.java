package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfmr extends zzhwo implements zzhya {
    private static final zzfmr zzc;
    private static volatile zzhyh zzd;
    private boolean zza;
    private boolean zzb;

    static {
        zzfmr zzfmrVar = new zzfmr();
        zzc = zzfmrVar;
        zzhwo.zzbu(zzfmr.class, zzfmrVar);
    }

    private zzfmr() {
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfmr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfmq(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhyh zzhyhVar = zzd;
        if (zzhyhVar != null) {
            return zzhyhVar;
        }
        synchronized (zzfmr.class) {
            try {
                zzhwjVar = zzd;
                if (zzhwjVar == null) {
                    zzhwjVar = new zzhwj(zzc);
                    zzd = zzhwjVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhwjVar;
    }
}
