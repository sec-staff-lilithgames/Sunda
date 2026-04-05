package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteOrder;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzadn {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzadm zzk;
    private final zzap zzl;

    public zzadn(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, zzadm zzadmVar, zzap zzapVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = zzf(i14);
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = zzg(i16);
        this.zzj = j10;
        this.zzk = zzadmVar;
        this.zzl = zzapVar;
    }

    private static int zzf(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static int zzg(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return i10 != 32 ? -1 : 7;
        }
        return 6;
    }

    public final long zza() {
        long j10 = this.zzj;
        return j10 == 0 ? C.TIME_UNSET : (j10 * 1000000) / this.zze;
    }

    public final long zzb(long j10) {
        String str = zzep.zza;
        return Math.max(0L, Math.min((j10 * this.zze) / 1000000, this.zzj - 1));
    }

    public final zzv zzc(byte[] bArr, zzap zzapVar) {
        bArr[4] = -128;
        zzap zzapVarZzd = zzd(zzapVar);
        zzt zztVar = new zzt();
        zztVar.zzm(MimeTypes.AUDIO_FLAC);
        int i10 = this.zzd;
        if (i10 <= 0) {
            i10 = -1;
        }
        zztVar.zzn(i10);
        zztVar.zzE(this.zzg);
        zztVar.zzF(this.zze);
        zztVar.zzG(zzep.zzz(this.zzh, ByteOrder.LITTLE_ENDIAN));
        zztVar.zzp(Collections.singletonList(bArr));
        zztVar.zzk(zzapVarZzd);
        return zztVar.zzM();
    }

    public final zzap zzd(zzap zzapVar) {
        zzap zzapVar2 = this.zzl;
        return zzapVar2 == null ? zzapVar : zzapVar2.zzf(zzapVar);
    }

    public final zzadn zze(zzadm zzadmVar) {
        return new zzadn(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzadmVar, this.zzl);
    }

    public zzadn(byte[] bArr, int i10) {
        zzef zzefVar = new zzef(bArr, bArr.length);
        zzefVar.zzf(i10 * 8);
        this.zza = zzefVar.zzj(16);
        this.zzb = zzefVar.zzj(16);
        this.zzc = zzefVar.zzj(24);
        this.zzd = zzefVar.zzj(24);
        int iZzj = zzefVar.zzj(20);
        this.zze = iZzj;
        this.zzf = zzf(iZzj);
        this.zzg = zzefVar.zzj(3) + 1;
        int iZzj2 = zzefVar.zzj(5) + 1;
        this.zzh = iZzj2;
        this.zzi = zzg(iZzj2);
        this.zzj = zzefVar.zzk(36);
        this.zzk = null;
        this.zzl = null;
    }
}
