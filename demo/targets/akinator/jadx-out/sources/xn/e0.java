package xn;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e0 implements d0 {
    @Override // xn.d0
    public int getCodecCount() {
        return MediaCodecList.getCodecCount();
    }

    @Override // xn.d0
    public MediaCodecInfo getCodecInfoAt(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // xn.d0
    public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // xn.d0
    public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // xn.d0
    public boolean secureDecodersExplicit() {
        return false;
    }
}
