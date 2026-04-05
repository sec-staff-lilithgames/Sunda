package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes6.dex */
public final class zzhlv extends zzhwo implements zzhya {
    public static final /* synthetic */ int zza = 0;
    private static final zzhlv zzd;
    private static volatile zzhyh zze;
    private String zzb = "";
    private zzhxa zzc = zzhwo.zzbM();

    static {
        zzhlv zzhlvVar = new zzhlv();
        zzd = zzhlvVar;
        zzhwo.zzbu(zzhlv.class, zzhlvVar);
    }

    private zzhlv() {
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", zzhlc.class});
        }
        if (iOrdinal == 3) {
            return new zzhlv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhlu(bArr);
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
        synchronized (zzhlv.class) {
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
}
