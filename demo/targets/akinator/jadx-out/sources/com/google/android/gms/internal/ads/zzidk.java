package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzidk extends zzhwo implements zzhya {
    private static final zzidk zzp;
    private static volatile zzhyh zzu;
    private int zza;
    private boolean zzh;
    private double zzi;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private zzhxa zze = zzhwo.zzbM();
    private String zzf = "";
    private String zzg = "";
    private zzhxa zzj = zzhwo.zzbM();

    static {
        zzidk zzidkVar = new zzidk();
        zzp = zzidkVar;
        zzhwo.zzbu(zzidk.class, zzidkVar);
    }

    private zzidk() {
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", zzidj.zza, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzidi.class, "zzc", "zzk", zzidg.zza, "zzl", "zzm", "zzn", "zzo"});
        }
        if (iOrdinal == 3) {
            return new zzidk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzidf(bArr);
        }
        if (iOrdinal == 5) {
            return zzp;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhyh zzhyhVar = zzu;
        if (zzhyhVar != null) {
            return zzhyhVar;
        }
        synchronized (zzidk.class) {
            try {
                zzhwjVar = zzu;
                if (zzhwjVar == null) {
                    zzhwjVar = new zzhwj(zzp);
                    zzu = zzhwjVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhwjVar;
    }
}
