package xn;

import android.media.MediaCodecInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface d0 {
    int getCodecCount();

    MediaCodecInfo getCodecInfoAt(int i10);

    boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

    boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

    boolean secureDecodersExplicit();
}
