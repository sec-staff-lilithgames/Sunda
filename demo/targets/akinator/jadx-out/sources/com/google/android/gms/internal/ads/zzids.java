package com.google.android.gms.internal.ads;

import androidx.activity.result.HM.OIPXcgrVyyxoLF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzids extends zzhwo implements zzhya {
    private static final zzids zzn;
    private static volatile zzhyh zzo;
    private int zza;
    private int zzd;
    private boolean zzf;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private zzidx zzk;
    private zzidr zzm;
    private String zzb = "";
    private String zzc = "";
    private int zze = 1;
    private String zzg = "";
    private String zzl = "";

    static {
        zzids zzidsVar = new zzids();
        zzn = zzidsVar;
        zzhwo.zzbu(zzids.class, zzidsVar);
    }

    private zzids() {
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
                                zzhyh zzhyhVar = zzo;
                                if (zzhyhVar == null) {
                                    synchronized (zzids.class) {
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
                                return zzhyhVar;
                            }
                            throw null;
                        }
                        return zzn;
                    }
                    return new zzidp(bArr);
                }
                return new zzids();
            }
            return zzhwo.zzbv(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", zzieb.zza, "zze", zziea.zza, "zzf", "zzg", OIPXcgrVyyxoLF.ipIQxOmaGaDpcdb, "zzi", "zzj", zzidt.zza, "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
