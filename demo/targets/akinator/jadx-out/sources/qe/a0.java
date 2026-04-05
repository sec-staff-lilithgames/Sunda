package qe;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a0 implements y {

    /* renamed from: a, reason: collision with root package name */
    public final int f82785a;

    /* renamed from: b, reason: collision with root package name */
    public MediaCodecInfo[] f82786b;

    public a0(boolean z10, boolean z11) {
        this.f82785a = (z10 || z11) ? 1 : 0;
    }

    @Override // qe.y
    public int getCodecCount() {
        if (this.f82786b == null) {
            this.f82786b = new MediaCodecList(this.f82785a).getCodecInfos();
        }
        return this.f82786b.length;
    }

    @Override // qe.y
    public MediaCodecInfo getCodecInfoAt(int i10) {
        if (this.f82786b == null) {
            this.f82786b = new MediaCodecList(this.f82785a).getCodecInfos();
        }
        return this.f82786b[i10];
    }

    @Override // qe.y
    public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // qe.y
    public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // qe.y
    public boolean secureDecodersExplicit() {
        return true;
    }
}
