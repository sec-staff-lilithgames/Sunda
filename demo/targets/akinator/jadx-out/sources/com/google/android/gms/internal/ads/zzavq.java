package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzavq extends zzhwo implements zzhya {
    private static final zzavq zzf;
    private static volatile zzhyh zzg;
    private int zza;
    private zzhxa zzb = zzhwo.zzbM();
    private zzhvi zzc = zzhvi.zzb;
    private int zzd = 1;
    private int zze = 1;

    static {
        zzavq zzavqVar = new zzavq();
        zzf = zzavqVar;
        zzhwo.zzbu(zzavq.class, zzavqVar);
    }

    private zzavq() {
    }

    public static zzavp zza() {
        return (zzavp) zzf.zzbn();
    }

    public final /* synthetic */ void zzb(zzhvi zzhviVar) {
        zzhxa zzhxaVar = this.zzb;
        if (!zzhxaVar.zza()) {
            this.zzb = zzhwo.zzbN(zzhxaVar);
        }
        this.zzb.add(zzhviVar);
    }

    public final /* synthetic */ void zzc(zzhvi zzhviVar) {
        this.zza |= 1;
        this.zzc = zzhviVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", zzavk.zza, "zze", zzavg.zza});
        }
        if (iOrdinal == 3) {
            return new zzavq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzavp(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhyh zzhyhVar = zzg;
        if (zzhyhVar != null) {
            return zzhyhVar;
        }
        synchronized (zzavq.class) {
            try {
                zzhwjVar = zzg;
                if (zzhwjVar == null) {
                    zzhwjVar = new zzhwj(zzf);
                    zzg = zzhwjVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhwjVar;
    }

    public final /* synthetic */ void zze(int i10) {
        this.zzd = 4;
        this.zza |= 2;
    }

    public final /* synthetic */ void zzg(int i10) {
        this.zze = i10 - 1;
        this.zza |= 4;
    }
}
