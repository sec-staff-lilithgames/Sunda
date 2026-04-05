package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzicg extends zzhwo implements zzhya {
    private static final zzicg zzf;
    private static volatile zzhyh zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private zzhvi zzd;
    private zzhvi zze;

    static {
        zzicg zzicgVar = new zzicg();
        zzf = zzicgVar;
        zzhwo.zzbu(zzicg.class, zzicgVar);
    }

    private zzicg() {
        zzhvi zzhviVar = zzhvi.zzb;
        this.zzd = zzhviVar;
        this.zze = zzhviVar;
    }

    public static zzice zzc() {
        return (zzice) zzf.zzbn();
    }

    public final /* synthetic */ void zzd(String str) {
        this.zza |= 2;
        this.zzc = "image/png";
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", zzicf.zza, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzicg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzice(bArr);
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
        synchronized (zzicg.class) {
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

    public final /* synthetic */ void zze(zzhvi zzhviVar) {
        zzhviVar.getClass();
        this.zza |= 4;
        this.zzd = zzhviVar;
    }

    public final /* synthetic */ void zzh(int i10) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }
}
