package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfzs extends zzhwo implements zzhya {
    private static final zzfzs zzd;
    private static volatile zzhyh zze;
    private int zza;
    private zzhxa zzb = zzhwo.zzbM();
    private zziaa zzc;

    static {
        zzfzs zzfzsVar = new zzfzs();
        zzd = zzfzsVar;
        zzhwo.zzbu(zzfzs.class, zzfzsVar);
    }

    private zzfzs() {
    }

    public static zzfzr zza() {
        return (zzfzr) zzd.zzbn();
    }

    public final /* synthetic */ void zzb(zzfzq zzfzqVar) {
        zzfzqVar.getClass();
        zzhxa zzhxaVar = this.zzb;
        if (!zzhxaVar.zza()) {
            this.zzb = zzhwo.zzbN(zzhxaVar);
        }
        this.zzb.add(zzfzqVar);
    }

    public final /* synthetic */ void zzc(zziaa zziaaVar) {
        zziaaVar.getClass();
        this.zzc = zziaaVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", zzfzq.class, "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzfzs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfzr(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhyh zzhyhVar = zze;
        if (zzhyhVar != null) {
            return zzhyhVar;
        }
        synchronized (zzfzs.class) {
            try {
                zzhwjVar = zze;
                if (zzhwjVar == null) {
                    zzhwjVar = new zzhwj(zzd);
                    zze = zzhwjVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhwjVar;
    }
}
