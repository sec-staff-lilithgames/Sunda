package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzafm extends zzafr {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzafm(zzaem zzaemVar) {
        super(zzaemVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final boolean zza(zzeg zzegVar) throws zzafq {
        if (this.zzc) {
            zzegVar.zzk(1);
        } else {
            int iZzs = zzegVar.zzs();
            int i10 = iZzs >> 4;
            this.zze = i10;
            if (i10 == 2) {
                int i11 = zzb[(iZzs >> 2) & 3];
                zzt zztVar = new zzt();
                zztVar.zzl("video/x-flv");
                zztVar.zzm(MimeTypes.AUDIO_MPEG);
                zztVar.zzE(1);
                zztVar.zzF(i11);
                this.zza.zzu(zztVar.zzM());
                this.zzd = true;
            } else if (i10 == 7 || i10 == 8) {
                zzt zztVar2 = new zzt();
                zztVar2.zzl("video/x-flv");
                zztVar2.zzm(i10 == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW);
                zztVar2.zzE(1);
                zztVar2.zzF(8000);
                this.zza.zzu(zztVar2.zzM());
                this.zzd = true;
            } else if (i10 != 10) {
                throw new zzafq(o2.l(i10, "Audio format not supported: ", new StringBuilder(String.valueOf(i10).length() + 28)));
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final boolean zzb(zzeg zzegVar, long j10) throws zzat {
        if (this.zze == 2) {
            int iZzd = zzegVar.zzd();
            zzaem zzaemVar = this.zza;
            zzaemVar.zzz(zzegVar, iZzd);
            zzaemVar.zzx(j10, 1, iZzd, 0, null);
            return true;
        }
        int iZzs = zzegVar.zzs();
        if (iZzs != 0 || this.zzd) {
            if (this.zze == 10 && iZzs != 1) {
                return false;
            }
            int iZzd2 = zzegVar.zzd();
            zzaem zzaemVar2 = this.zza;
            zzaemVar2.zzz(zzegVar, iZzd2);
            zzaemVar2.zzx(j10, 1, iZzd2, 0, null);
            return true;
        }
        int iZzd3 = zzegVar.zzd();
        byte[] bArr = new byte[iZzd3];
        zzegVar.zzm(bArr, 0, iZzd3);
        zzaby zzabyVarZza = zzabz.zza(bArr);
        zzt zztVar = new zzt();
        zztVar.zzl("video/x-flv");
        zztVar.zzm(MimeTypes.AUDIO_AAC);
        zztVar.zzj(zzabyVarZza.zzc);
        zztVar.zzE(zzabyVarZza.zzb);
        zztVar.zzF(zzabyVarZza.zza);
        zztVar.zzp(Collections.singletonList(bArr));
        this.zza.zzu(zztVar.zzM());
        this.zzd = true;
        return false;
    }
}
