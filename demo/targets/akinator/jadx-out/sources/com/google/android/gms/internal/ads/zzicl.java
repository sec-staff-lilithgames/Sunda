package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzicl extends zzhwo implements zzhya {
    private static final zzicl zzl;
    private static volatile zzhyh zzm;
    private int zza;
    private int zzb;
    private zzibm zzd;
    private zzibq zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private zzhww zzg = zzhwo.zzbC();
    private String zzh = "";
    private zzhxa zzj = zzhwo.zzbM();

    static {
        zzicl zziclVar = new zzicl();
        zzl = zziclVar;
        zzhwo.zzbu(zzicl.class, zziclVar);
    }

    private zzicl() {
    }

    public static zzick zze() {
        return (zzick) zzl.zzbn();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzj.size();
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        byte[] bArr = null;
        switch (zzhwnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzk);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzk = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhwo.zzbv(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzici.zza, "zzj"});
            case NEW_MUTABLE_INSTANCE:
                return new zzicl();
            case NEW_BUILDER:
                return new zzick(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzl;
            case GET_PARSER:
                zzhyh zzhyhVar = zzm;
                if (zzhyhVar != null) {
                    return zzhyhVar;
                }
                synchronized (zzicl.class) {
                    try {
                        zzhwjVar = zzm;
                        if (zzhwjVar == null) {
                            zzhwjVar = new zzhwj(zzl);
                            zzm = zzhwjVar;
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

    public final /* synthetic */ void zzg(int i10) {
        this.zza |= 1;
        this.zzb = i10;
    }

    public final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void zzi(zzibm zzibmVar) {
        zzibmVar.getClass();
        this.zzd = zzibmVar;
        this.zza |= 4;
    }

    public final /* synthetic */ void zzj(String str) {
        str.getClass();
        zzhxa zzhxaVar = this.zzj;
        if (!zzhxaVar.zza()) {
            this.zzj = zzhwo.zzbN(zzhxaVar);
        }
        this.zzj.add(str);
    }

    public final /* synthetic */ void zzl(int i10) {
        this.zzi = i10 - 1;
        this.zza |= 64;
    }
}
