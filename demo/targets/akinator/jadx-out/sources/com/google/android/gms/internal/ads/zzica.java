package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzica extends zzhwo implements zzhya {
    private static final zzica zzd;
    private static volatile zzhyh zze;
    private int zza;
    private String zzb = "";
    private long zzc;

    static {
        zzica zzicaVar = new zzica();
        zzd = zzicaVar;
        zzhwo.zzbu(zzica.class, zzicaVar);
    }

    private zzica() {
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    byte[] bArr = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                zzhyh zzhyhVar = zze;
                                if (zzhyhVar == null) {
                                    synchronized (zzica.class) {
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
                                return zzhyhVar;
                            }
                            throw null;
                        }
                        return zzd;
                    }
                    return new zzibz(bArr);
                }
                return new zzica();
            }
            return zzhwo.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zza", "zzb", PtLatqAYjEFT.oCeggSgNjg});
        }
        return (byte) 1;
    }
}
