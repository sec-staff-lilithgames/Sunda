package xn;

import android.media.MediaCodecInfo;
import io.bidmachine.media3.common.util.a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f92122a;

    public static int areResolutionAndFrameRateCovered(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (a1.f60679a < 29) {
            return 0;
        }
        Boolean bool = f92122a;
        if (bool == null || !bool.booleanValue()) {
            return t.areResolutionAndFrameRateCovered(videoCapabilities, i10, i11, d10);
        }
        return 0;
    }
}
