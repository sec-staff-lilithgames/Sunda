package qe;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z implements y {
    @Override // qe.y
    public int getCodecCount() {
        return MediaCodecList.getCodecCount();
    }

    @Override // qe.y
    public MediaCodecInfo getCodecInfoAt(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // qe.y
    public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // qe.y
    public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // qe.y
    public boolean secureDecodersExplicit() {
        return false;
    }
}
