package com.facebook.ads.redexgen.core;

import android.media.MediaCodecInfo;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class AP {
    public static String[] A00 = {"XFGs1lyyeZSUQVmeVGOQgjZdx0Lg5SQ7", "gIr6pD0DRCuLw9pu", "xFdIOEguE42sAuXi", "sWe2SXgfKDUPeP6q9qV3qPenQfS3yrFL", "xArwsOhMvePeNXFYJk80LlCaAczGuKur", "d6DKz523SxuOwdk6", "C714aw4WOKSmleIF7c9CmjeVatfjbSsR", "QY3y3Mpjcqc9dDZ4GPBIzJJwsqI"};

    public static int A00(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty() || AR.A07()) {
            return 0;
        }
        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d10);
        for (int i12 = 0; i12 < supportedPerformancePoints.size(); i12++) {
            if (supportedPerformancePoints.get(i12).covers(performancePoint)) {
                return 2;
            }
        }
        if (A00[3].charAt(9) != 'D') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[5] = "YcALvT0VMkVLsK9p";
        strArr[1] = "SPZaEiX7Pp9WtVjf";
        return 1;
    }
}
