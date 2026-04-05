package com.google.android.gms.internal.ads;

import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzavb extends zzhwo implements zzhya {
    private static final zzavb zzl;
    private static volatile zzhyh zzm;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private int zzi;
    private int zzj;
    private int zzk;
    private zzhww zze = zzhwo.zzbC();
    private zzhxa zzh = zzhwo.zzbM();

    static {
        zzavb zzavbVar = new zzavb();
        zzl = zzavbVar;
        zzhwo.zzbu(zzavb.class, zzavbVar);
    }

    private zzavb() {
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
                                zzhyh zzhyhVar = zzm;
                                if (zzhyhVar == null) {
                                    synchronized (zzavb.class) {
                                        try {
                                            zzhwjVar = zzm;
                                            if (zzhwjVar == null) {
                                                zzhwjVar = new zzhwj(zzl);
                                                zzm = zzhwjVar;
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
                        return zzl;
                    }
                    return new zzava(bArr);
                }
                return new zzavb();
            }
            return zzhwo.zzbv(zzl, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\b᠌\u0005\t᠌\u0006\n᠌\u0007", new Object[]{"zza", "zzb", "zzc", QpyI.otQlrOgUZ, "zze", "zzf", "zzg", "zzh", zzavf.class, "zzi", zzglj.zza(), "zzj", zziae.zza(), "zzk", zziac.zza()});
        }
        return (byte) 1;
    }
}
