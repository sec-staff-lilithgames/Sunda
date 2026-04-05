package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhlj extends zzhwo implements zzhya {
    private static final zzhlj zze;
    private static volatile zzhyh zzf;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    static {
        zzhlj zzhljVar = new zzhlj();
        zze = zzhljVar;
        zzhwo.zzbu(zzhlj.class, zzhljVar);
    }

    private zzhlj() {
    }

    public static zzhli zza() {
        return (zzhli) zze.zzbn();
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzc(int i10) {
        this.zzc = i10;
    }

    public final /* synthetic */ void zzd(zzhlt zzhltVar) {
        this.zzd = zzhltVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhlj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhli(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhyh zzhyhVar = zzf;
        if (zzhyhVar != null) {
            return zzhyhVar;
        }
        synchronized (zzhlj.class) {
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

    public final /* synthetic */ void zzg(int i10) {
        this.zzb = zzhky.zza(i10);
    }
}
