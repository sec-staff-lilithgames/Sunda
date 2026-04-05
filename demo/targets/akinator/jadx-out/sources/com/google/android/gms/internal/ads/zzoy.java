package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import y3.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzoy implements zzml, zzoz {
    private boolean zzA;
    private final Context zza;
    private final zzpa zzc;
    private final PlaybackSession zzd;
    private String zzj;
    private PlaybackMetrics.Builder zzk;
    private int zzl;
    private zzau zzo;
    private zzox zzp;
    private zzox zzq;
    private zzox zzr;
    private zzv zzs;
    private zzv zzt;
    private zzv zzu;
    private boolean zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;
    private final Executor zzb = zzcw.zza();
    private final zzbe zzf = new zzbe();
    private final zzbd zzg = new zzbd();
    private final HashMap zzi = new HashMap();
    private final HashMap zzh = new HashMap();
    private final long zze = SystemClock.elapsedRealtime();
    private int zzm = 0;
    private int zzn = 0;

    private zzoy(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzd = playbackSession;
        zzor zzorVar = new zzor(zzor.zza);
        this.zzc = zzorVar;
        zzorVar.zza(this);
    }

    private final void zzA(int i10, long j10, zzv zzvVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.zze);
        if (zzvVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i11 != 1 ? 1 : 2);
            String str = zzvVar.zzn;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzvVar.zzo;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzvVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = zzvVar.zzj;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = zzvVar.zzv;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = zzvVar.zzw;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = zzvVar.zzG;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = zzvVar.zzH;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = zzvVar.zzd;
            if (str4 != null) {
                String str5 = zzep.zza;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = zzvVar.zzz;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzA = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzou
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzu(trackChangeEventBuild);
            }
        });
    }

    @RequiresNonNull({"metricsBuilder"})
    private final void zzB(zzbf zzbfVar, zzuu zzuuVar) {
        int iZze;
        PlaybackMetrics.Builder builder = this.zzk;
        if (zzuuVar == null || (iZze = zzbfVar.zze(zzuuVar.zza)) == -1) {
            return;
        }
        zzbd zzbdVar = this.zzg;
        int i10 = 0;
        zzbfVar.zzd(iZze, zzbdVar, false);
        zzbe zzbeVar = this.zzf;
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzag zzagVar = zzbeVar.zzd.zzb;
        if (zzagVar != null) {
            int iZzG = zzep.zzG(zzagVar.zza);
            i10 = iZzG != 0 ? iZzG != 1 ? iZzG != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        long j10 = zzbeVar.zzm;
        if (j10 != C.TIME_UNSET && !zzbeVar.zzk && !zzbeVar.zzi && !zzbeVar.zzb()) {
            builder.setMediaDurationMillis(zzep.zzp(j10));
        }
        builder.setPlaybackType(true != zzbeVar.zzb() ? 1 : 2);
        this.zzA = true;
    }

    private final void zzC() {
        PlaybackMetrics.Builder builder = this.zzk;
        if (builder != null && this.zzA) {
            builder.setAudioUnderrunCount(this.zzz);
            this.zzk.setVideoFramesDropped(this.zzx);
            this.zzk.setVideoFramesPlayed(this.zzy);
            Long l9 = (Long) this.zzh.get(this.zzj);
            this.zzk.setNetworkTransferDurationMillis(l9 == null ? 0L : l9.longValue());
            Long l10 = (Long) this.zzi.get(this.zzj);
            this.zzk.setNetworkBytesRead(l10 == null ? 0L : l10.longValue());
            this.zzk.setStreamSource((l10 == null || l10.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.zzk.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzov
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(playbackMetricsBuild);
                }
            });
        }
        this.zzk = null;
        this.zzj = null;
        this.zzz = 0;
        this.zzx = 0;
        this.zzy = 0;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzA = false;
    }

    private static int zzD(int i10) {
        switch (zzep.zzF(i10)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    public static zzoy zza(Context context) {
        MediaMetricsManager mediaMetricsManagerB = f.b(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerB == null) {
            return null;
        }
        return new zzoy(context, mediaMetricsManagerB.createPlaybackSession());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private final boolean zzw(zzox zzoxVar) {
        if (zzoxVar != null) {
            return zzoxVar.zzc.equals(this.zzc.zzf());
        }
        return false;
    }

    private final void zzx(long j10, zzv zzvVar, int i10) {
        if (Objects.equals(this.zzs, zzvVar)) {
            return;
        }
        int i11 = this.zzs == null ? 1 : 0;
        this.zzs = zzvVar;
        zzA(1, j10, zzvVar, i11);
    }

    private final void zzy(long j10, zzv zzvVar, int i10) {
        if (Objects.equals(this.zzt, zzvVar)) {
            return;
        }
        int i11 = this.zzt == null ? 1 : 0;
        this.zzt = zzvVar;
        zzA(0, j10, zzvVar, i11);
    }

    private final void zzz(long j10, zzv zzvVar, int i10) {
        if (Objects.equals(this.zzu, zzvVar)) {
            return;
        }
        int i11 = this.zzu == null ? 1 : 0;
        this.zzu = zzvVar;
        zzA(2, j10, zzvVar, i11);
    }

    public final LogSessionId zzb() {
        return this.zzd.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzc(zzmj zzmjVar, String str) {
        zzuu zzuuVar = zzmjVar.zzd;
        if (zzuuVar == null || !zzuuVar.zzb()) {
            zzC();
            this.zzj = str;
            this.zzk = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0");
            zzB(zzmjVar.zzb, zzuuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzd(zzmj zzmjVar, String str, boolean z10) {
        zzuu zzuuVar = zzmjVar.zzd;
        if ((zzuuVar == null || !zzuuVar.zzb()) && str.equals(this.zzj)) {
            zzC();
        }
        this.zzh.remove(str);
        this.zzi.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzdj(zzmj zzmjVar, zzba zzbaVar, zzba zzbaVar2, int i10) {
        if (i10 == 1) {
            this.zzv = true;
            i10 = 1;
        }
        this.zzl = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzdk(zzmj zzmjVar, zzuq zzuqVar) {
        zzuu zzuuVar = zzmjVar.zzd;
        if (zzuuVar == null) {
            return;
        }
        zzv zzvVar = zzuqVar.zzb;
        zzvVar.getClass();
        zzox zzoxVar = new zzox(zzvVar, 0, this.zzc.zzb(zzmjVar.zzb, zzuuVar));
        int i10 = zzuqVar.zza;
        if (i10 != 0) {
            if (i10 == 1) {
                this.zzq = zzoxVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.zzr = zzoxVar;
                return;
            }
        }
        this.zzp = zzoxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzdl(zzmj zzmjVar, int i10, long j10, long j11) {
        zzuu zzuuVar = zzmjVar.zzd;
        if (zzuuVar != null) {
            String strZzb = this.zzc.zzb(zzmjVar.zzb, zzuuVar);
            HashMap map = this.zzi;
            Long l9 = (Long) map.get(strZzb);
            HashMap map2 = this.zzh;
            Long l10 = (Long) map2.get(strZzb);
            map.put(strZzb, Long.valueOf((l9 == null ? 0L : l9.longValue()) + j10));
            map2.put(strZzb, Long.valueOf((l10 != null ? l10.longValue() : 0L) + i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzdm(zzmj zzmjVar, zzhs zzhsVar) {
        this.zzx += zzhsVar.zzg;
        this.zzy += zzhsVar.zze;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x029c  */
    @Override // com.google.android.gms.internal.ads.zzml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzdn(com.google.android.gms.internal.ads.zzbb r20, com.google.android.gms.internal.ads.zzmk r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoy.zzdn(com.google.android.gms.internal.ads.zzbb, com.google.android.gms.internal.ads.zzmk):void");
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzg(zzmj zzmjVar, zzau zzauVar) {
        this.zzo = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzp(zzmj zzmjVar, zzbv zzbvVar) {
        zzox zzoxVar = this.zzp;
        if (zzoxVar != null) {
            zzv zzvVar = zzoxVar.zza;
            if (zzvVar.zzw == -1) {
                zzt zztVarZza = zzvVar.zza();
                zztVarZza.zzt(zzbvVar.zzb);
                zztVarZza.zzu(zzbvVar.zzc);
                this.zzp = new zzox(zztVarZza.zzM(), 0, zzoxVar.zzc);
            }
        }
    }

    public final /* synthetic */ void zzr(PlaybackErrorEvent playbackErrorEvent) {
        this.zzd.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public final /* synthetic */ void zzs(NetworkEvent networkEvent) {
        this.zzd.reportNetworkEvent(networkEvent);
    }

    public final /* synthetic */ void zzt(PlaybackStateEvent playbackStateEvent) {
        this.zzd.reportPlaybackStateEvent(playbackStateEvent);
    }

    public final /* synthetic */ void zzu(TrackChangeEvent trackChangeEvent) {
        this.zzd.reportTrackChangeEvent(trackChangeEvent);
    }

    public final /* synthetic */ void zzv(PlaybackMetrics playbackMetrics) {
        this.zzd.reportPlaybackMetrics(playbackMetrics);
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzh(zzmj zzmjVar, zzul zzulVar, zzuq zzuqVar, IOException iOException, boolean z10) {
    }
}
