package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhmr extends zzhwo implements zzhya {
    private static final zzhmr zzb;
    private static volatile zzhyh zzc;
    private int zza;

    static {
        zzhmr zzhmrVar = new zzhmr();
        zzb = zzhmrVar;
        zzhwo.zzbu(zzhmr.class, zzhmrVar);
    }

    private zzhmr() {
    }

    public static zzhmq zzb() {
        return (zzhmq) zzb.zzbn();
    }

    public static zzhmr zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    public final /* synthetic */ void zzd(int i10) {
        this.zza = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhmr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhmq(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhyh zzhyhVar = zzc;
        if (zzhyhVar != null) {
            return zzhyhVar;
        }
        synchronized (zzhmr.class) {
            try {
                zzhwjVar = zzc;
                if (zzhwjVar == null) {
                    zzhwjVar = new zzhwj(zzb);
                    zzc = zzhwjVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhwjVar;
    }
}
