package xn;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f92085a;

    /* renamed from: b, reason: collision with root package name */
    public MediaCodecInfo[] f92086b;

    public f0(boolean z10, boolean z11, boolean z12) {
        this.f92085a = (z10 || z11 || z12) ? 1 : 0;
    }

    @Override // xn.d0
    public int getCodecCount() {
        if (this.f92086b == null) {
            this.f92086b = new MediaCodecList(this.f92085a).getCodecInfos();
        }
        return this.f92086b.length;
    }

    @Override // xn.d0
    public MediaCodecInfo getCodecInfoAt(int i10) {
        if (this.f92086b == null) {
            this.f92086b = new MediaCodecList(this.f92085a).getCodecInfos();
        }
        return this.f92086b[i10];
    }

    @Override // xn.d0
    public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // xn.d0
    public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // xn.d0
    public boolean secureDecodersExplicit() {
        return true;
    }
}
