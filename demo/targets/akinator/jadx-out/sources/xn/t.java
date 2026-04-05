package xn;

import android.media.MediaCodecInfo;
import io.bidmachine.media3.common.util.a1;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class t {
    public static int a(boolean z10) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            io.bidmachine.media3.common.b bVarBuild = new gn.w().setSampleMimeType("video/avc").build();
            if (bVarBuild.f60665o != null) {
                List<s> decoderInfosSoftMatch = h0.getDecoderInfosSoftMatch(z.f92166a, bVarBuild, z10, false);
                for (int i10 = 0; i10 < decoderInfosSoftMatch.size(); i10++) {
                    if (decoderInfosSoftMatch.get(i10).f92114d != null && decoderInfosSoftMatch.get(i10).f92114d.getVideoCapabilities() != null && (supportedPerformancePoints = decoderInfosSoftMatch.get(i10).f92114d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i11 = 0; i11 < supportedPerformancePoints.size(); i11++) {
                            if (pe.a.b(supportedPerformancePoints.get(i11)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (c0 unused) {
        }
        return 0;
    }

    public static int areResolutionAndFrameRateCovered(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        boolean z10;
        int i12;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d10);
            int i13 = 0;
            while (true) {
                z10 = true;
                if (i13 >= supportedPerformancePoints.size()) {
                    i12 = 1;
                    break;
                }
                if (pe.a.b(supportedPerformancePoints.get(i13)).covers(performancePoint)) {
                    i12 = 2;
                    break;
                }
                i13++;
            }
            if (i12 == 1 && u.f92122a == null) {
                if (a1.f60679a < 35) {
                    int iA = a(false);
                    int iA2 = a(true);
                    if (iA != 0 && (iA2 != 0 ? !(iA != 2 || iA2 != 2) : iA == 2)) {
                    }
                    u.f92122a = Boolean.valueOf(z10);
                    if (!z10) {
                    }
                }
                z10 = false;
                u.f92122a = Boolean.valueOf(z10);
                if (!z10) {
                }
            }
            return i12;
        }
        return 0;
    }
}
