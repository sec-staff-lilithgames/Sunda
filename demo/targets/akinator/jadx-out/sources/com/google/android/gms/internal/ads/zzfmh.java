package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfmh extends zzhwo implements zzhya {
    private static final zzfmh zzc;
    private static volatile zzhyh zzd;
    private zzhxa zza = zzhwo.zzbM();
    private long zzb;

    static {
        zzfmh zzfmhVar = new zzfmh();
        zzc = zzfmhVar;
        zzhwo.zzbu(zzfmh.class, zzfmhVar);
    }

    private zzfmh() {
    }

    public static zzfmg zza() {
        return (zzfmg) zzc.zzbn();
    }

    public final /* synthetic */ void zzb(zzflb zzflbVar) {
        zzflbVar.getClass();
        zzhxa zzhxaVar = this.zza;
        if (!zzhxaVar.zza()) {
            this.zza = zzhwo.zzbN(zzhxaVar);
        }
        this.zza.add(zzflbVar);
    }

    public final /* synthetic */ void zzc(long j10) {
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", zzflb.class, "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfmh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfmg(bArr);
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
        synchronized (zzfmh.class) {
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
}
