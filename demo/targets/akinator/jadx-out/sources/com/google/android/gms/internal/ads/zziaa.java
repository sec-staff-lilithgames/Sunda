package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zziaa extends zzhwo implements zzhya {
    private static final zziaa zzc;
    private static volatile zzhyh zzd;
    private int zza;
    private String zzb = "";

    static {
        zziaa zziaaVar = new zziaa();
        zzc = zziaaVar;
        zzhwo.zzbu(zziaa.class, zziaaVar);
    }

    private zziaa() {
    }

    public static zzhzz zzc() {
        return (zzhzz) zzc.zzbn();
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zziaa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhzz(bArr);
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
        synchronized (zziaa.class) {
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

    public final /* synthetic */ void zze(int i10) {
        this.zza = 15;
    }
}
