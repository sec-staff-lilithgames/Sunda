package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzibq extends zzhwo implements zzhya {
    private static final zzibq zzi;
    private static volatile zzhyh zzj;
    private int zza;
    private zzibp zzb;
    private zzhvi zzd;
    private zzhvi zze;
    private int zzf;
    private zzhvi zzg;
    private byte zzh = 2;
    private zzhxa zzc = zzhwo.zzbM();

    static {
        zzibq zzibqVar = new zzibq();
        zzi = zzibqVar;
        zzhwo.zzbu(zzibq.class, zzibqVar);
    }

    private zzibq() {
        zzhvi zzhviVar = zzhvi.zzb;
        this.zzd = zzhviVar;
        this.zze = zzhviVar;
        this.zzg = zzhviVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        byte[] bArr = null;
        switch (zzhwnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzh);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzh = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhwo.zzbv(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", zzibi.class, "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzibq();
            case NEW_BUILDER:
                return new zzibn(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzi;
            case GET_PARSER:
                zzhyh zzhyhVar = zzj;
                if (zzhyhVar != null) {
                    return zzhyhVar;
                }
                synchronized (zzibq.class) {
                    try {
                        zzhwjVar = zzj;
                        if (zzhwjVar == null) {
                            zzhwjVar = new zzhwj(zzi);
                            zzj = zzhwjVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return zzhwjVar;
            default:
                throw null;
        }
    }
}
