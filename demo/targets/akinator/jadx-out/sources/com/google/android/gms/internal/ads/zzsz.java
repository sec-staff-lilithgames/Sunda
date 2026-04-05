package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzsz {
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            int iZzc = zzc(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d10));
            boolean z10 = true;
            if (iZzc == 1 && zzta.zza == null) {
                if (Build.VERSION.SDK_INT < 35) {
                    int iZzb = zzb(false);
                    int iZzb2 = zzb(true);
                    if (iZzb != 0 && (iZzb2 != 0 ? !(iZzb != 2 || iZzb2 != 2) : iZzb == 2)) {
                    }
                    zzta.zza = Boolean.valueOf(z10);
                    if (!zzta.zza.booleanValue()) {
                    }
                }
                z10 = false;
                zzta.zza = Boolean.valueOf(z10);
                if (!zzta.zza.booleanValue()) {
                }
            }
            return iZzc;
        }
        return 0;
    }

    private static int zzb(boolean z10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            zzt zztVar = new zzt();
            zztVar.zzm("video/avc");
            zzv zzvVarZzM = zztVar.zzM();
            if (zzvVarZzM.zzo != null) {
                List listZzc = zztq.zzc(zztg.zzb, zzvVarZzM, z10, false);
                for (int i10 = 0; i10 < listZzc.size(); i10++) {
                    if (((zzsy) listZzc.get(i10)).zzd != null && (videoCapabilities = ((zzsy) listZzc.get(i10)).zzd.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        return zzc(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60));
                    }
                }
            }
        } catch (zzti unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (pe.a.b(list.get(i10)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
