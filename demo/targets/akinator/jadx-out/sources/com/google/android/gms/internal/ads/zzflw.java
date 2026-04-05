package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzflw extends zzhwo implements zzhya {
    private static final zzflw zzb;
    private static volatile zzhyh zzc;
    private zzhxa zza = zzhwo.zzbM();

    static {
        zzflw zzflwVar = new zzflw();
        zzb = zzflwVar;
        zzhwo.zzbu(zzflw.class, zzflwVar);
    }

    private zzflw() {
    }

    public static zzflt zzb() {
        return (zzflt) zzb.zzbn();
    }

    public final int zza() {
        return this.zza.size();
    }

    public final /* synthetic */ void zzc(zzflv zzflvVar) {
        zzflvVar.getClass();
        zzhxa zzhxaVar = this.zza;
        if (!zzhxaVar.zza()) {
            this.zza = zzhwo.zzbN(zzhxaVar);
        }
        this.zza.add(zzflvVar);
    }

    public final /* synthetic */ void zzd() {
        this.zza = zzhwo.zzbM();
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzflv.class});
        }
        if (iOrdinal == 3) {
            return new zzflw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzflt(bArr);
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
        synchronized (zzflw.class) {
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
