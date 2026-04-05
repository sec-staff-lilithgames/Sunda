package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhku extends zzhwo implements zzhya {
    private static final zzhku zzc;
    private static volatile zzhyh zzd;
    private int zza;
    private int zzb;

    static {
        zzhku zzhkuVar = new zzhku();
        zzc = zzhkuVar;
        zzhwo.zzbu(zzhku.class, zzhkuVar);
    }

    private zzhku() {
    }

    public static zzhkt zzc() {
        return (zzhkt) zzc.zzbn();
    }

    public static zzhku zzd() {
        return zzc;
    }

    public final zzhko zza() {
        zzhko zzhkoVarZzb = zzhko.zzb(this.zza);
        return zzhkoVarZzb == null ? zzhko.UNRECOGNIZED : zzhkoVarZzb;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhku();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhkt(bArr);
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
        synchronized (zzhku.class) {
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

    public final /* synthetic */ void zze(zzhko zzhkoVar) {
        this.zza = zzhkoVar.zza();
    }

    public final /* synthetic */ void zzg(int i10) {
        this.zzb = i10;
    }
}
