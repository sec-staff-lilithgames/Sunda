package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfyl extends zzhwo implements zzhya {
    private static final zzfyl zzf;
    private static volatile zzhyh zzg;
    private int zza;
    private float zzc;
    private String zzb = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1";
    private long zzd = 1000;
    private long zze = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;

    static {
        zzfyl zzfylVar = new zzfyl();
        zzf = zzfylVar;
        zzhwo.zzbu(zzfyl.class, zzfylVar);
    }

    private zzfyl() {
    }

    public static zzfyk zze() {
        return (zzfyk) zzf.zzbn();
    }

    public static zzfyl zzg() {
        return zzf;
    }

    public final String zza() {
        return this.zzb;
    }

    public final float zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhwo
    public final Object zzdh(zzhwn zzhwnVar, Object obj, Object obj2) {
        zzhyh zzhwjVar;
        int iOrdinal = zzhwnVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhwo.zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzfyl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfyk(bArr);
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
        synchronized (zzfyl.class) {
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

    public final /* synthetic */ void zzh(float f10) {
        this.zza |= 2;
        this.zzc = f10;
    }
}
