package com.facebook.ads.redexgen.core;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.mi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2484mi implements InterfaceC1091Aw {
    public MediaCodecInfo[] A00;
    public final int A01;

    public C2484mi(boolean z10, boolean z11) {
        int i10;
        if (z10 || z11) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.A01 = i10;
    }

    @EnsuresNonNull({"mediaCodecInfos"})
    private void A00() {
        if (this.A00 == null) {
            this.A00 = new MediaCodecList(this.A01).getCodecInfos();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1091Aw
    public final int A7H() {
        A00();
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1091Aw
    public final MediaCodecInfo A7I(int i10) {
        A00();
        return this.A00[i10];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1091Aw
    public final boolean AAI(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1091Aw
    public final boolean AAJ(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1091Aw
    public final boolean AIK() {
        return true;
    }
}
