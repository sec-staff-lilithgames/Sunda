package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfso extends zzhwo implements zzhya {
    private static final zzfso zzf;
    private static volatile zzhyh zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private String zzd = "";
    private zzfsl zze;

    static {
        zzfso zzfsoVar = new zzfso();
        zzf = zzfsoVar;
        zzhwo.zzbu(zzfso.class, zzfsoVar);
    }

    private zzfso() {
    }

    public static zzfsm zza() {
        return (zzfsm) zzf.zzbn();
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void zzc(zzfsl zzfslVar) {
        zzfslVar.getClass();
        this.zze = zzfslVar;
        this.zza |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zza", "zzb", zzfsn.zza, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzfso();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfsm(bArr);
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
        synchronized (zzfso.class) {
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
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }
}
