package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfsl extends zzhwo implements zzhya {
    private static final zzfsl zzf;
    private static volatile zzhyh zzg;
    private int zza;
    private zzhww zzb = zzhwo.zzbC();
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        zzfsl zzfslVar = new zzfsl();
        zzf = zzfslVar;
        zzhwo.zzbu(zzfsl.class, zzfslVar);
    }

    private zzfsl() {
    }

    public static zzfsk zza() {
        return (zzfsk) zzf.zzbn();
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    public final /* synthetic */ void zzd(int i10) {
        zzhww zzhwwVar = this.zzb;
        if (!zzhwwVar.zza()) {
            this.zzb = zzhwo.zzbD(zzhwwVar);
        }
        this.zzb.zzi(2);
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", zzfsj.zza, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzfsl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfsk(bArr);
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
        synchronized (zzfsl.class) {
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
}
