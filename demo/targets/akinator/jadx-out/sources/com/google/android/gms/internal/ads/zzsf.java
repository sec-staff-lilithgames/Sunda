package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzsf implements zzst {
    private final zzgmv zza;
    private final zzgmv zzb;

    public zzsf(final int i10) {
        zzgmv zzgmvVar = new zzgmv() { // from class: com.google.android.gms.internal.ads.zzse
            @Override // com.google.android.gms.internal.ads.zzgmv
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zzsg.zzt(i10, "ExoPlayer:MediaCodecAsyncAdapter:"));
            }
        };
        zzgmv zzgmvVar2 = new zzgmv() { // from class: com.google.android.gms.internal.ads.zzsd
            @Override // com.google.android.gms.internal.ads.zzgmv
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zzsg.zzt(i10, "ExoPlayer:MediaCodecQueueingThread:"));
            }
        };
        this.zza = zzgmvVar;
        this.zzb = zzgmvVar2;
    }

    public final zzsg zza(zzss zzssVar) throws Exception {
        Exception exc;
        MediaCodec mediaCodecCreateByCodecName;
        zzsy zzsyVar = zzssVar.zza;
        String str = zzsyVar.zza;
        zzsg zzsgVar = null;
        try {
            StringBuilder sb2 = new StringBuilder(str.length() + 12);
            sb2.append("createCodec:");
            sb2.append(str);
            Trace.beginSection(sb2.toString());
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                zzsg zzsgVar2 = new zzsg(mediaCodecCreateByCodecName, (HandlerThread) this.zza.zza(), new zzsj(mediaCodecCreateByCodecName, (HandlerThread) this.zzb.zza()), zzssVar.zzf, null);
                try {
                    Trace.endSection();
                    Surface surface = zzssVar.zzd;
                    int i10 = 0;
                    if (surface == null && zzsyVar.zzh && Build.VERSION.SDK_INT >= 35) {
                        i10 = 8;
                    }
                    zzsgVar2.zzq(zzssVar.zzb, surface, null, i10);
                    return zzsgVar2;
                } catch (Exception e10) {
                    exc = e10;
                    zzsgVar = zzsgVar2;
                    if (zzsgVar != null) {
                        zzsgVar.zzk();
                        throw exc;
                    }
                    if (mediaCodecCreateByCodecName == null) {
                        throw exc;
                    }
                    mediaCodecCreateByCodecName.release();
                    throw exc;
                }
            } catch (Exception e11) {
                exc = e11;
            }
        } catch (Exception e12) {
            exc = e12;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final /* bridge */ /* synthetic */ zzsv zzb(zzss zzssVar) throws IOException {
        throw null;
    }
}
