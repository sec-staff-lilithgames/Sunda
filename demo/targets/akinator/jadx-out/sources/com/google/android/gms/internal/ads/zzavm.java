package com.google.android.gms.internal.ads;

import ao.kwoC.zAQQWzBxnS;
import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzavm extends zzhwo implements zzhya {
    private static final zzavm zze;
    private static volatile zzhyh zzf;
    private int zza;
    private long zzb;
    private String zzc = zAQQWzBxnS.RYmlF;
    private zzhvi zzd = zzhvi.zzb;

    static {
        zzavm zzavmVar = new zzavm();
        zze = zzavmVar;
        zzhwo.zzbu(zzavm.class, zzavmVar);
    }

    public static zzavm zze() {
        return zze;
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final zzhvi zzd() {
        return this.zzd;
    }

    private zzavm() {
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
                                zzhyh zzhyhVar = zzf;
                                if (zzhyhVar == null) {
                                    synchronized (zzavm.class) {
                                        try {
                                            zzhwjVar = zzf;
                                            if (zzhwjVar == null) {
                                                zzhwjVar = new zzhwj(zze);
                                                zzf = zzhwjVar;
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
                        return zze;
                    }
                    return new zzavl(bArr);
                }
                return new zzavm();
            }
            return zzhwo.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zza", uQjDr.kozGvPbUNGIA, "zzc", "zzd"});
        }
        return (byte) 1;
    }
}
