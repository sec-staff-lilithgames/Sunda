package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class J8 implements InterfaceC2971r9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N8 f31910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2887m9 f31911b;

    public J8(N8 n82, C2887m9 c2887m9) {
        this.f31910a = n82;
        this.f31911b = c2887m9;
    }

    public final void a(byte b10) {
        C2734d8 c2734d8 = this.f31910a.f32052b;
        if (c2734d8.f32759t || !(c2734d8 instanceof C2853k9)) {
            return;
        }
        C2853k9 c2853k9 = (C2853k9) c2734d8;
        C2887m9 videoAsset = this.f31911b;
        kotlin.jvm.internal.e0.checkNotNullParameter(videoAsset, "videoAsset");
        if (!c2853k9.f32759t) {
            if (b10 == 0) {
                videoAsset.a("firstQuartile", c2853k9.j(videoAsset), (V7) null, c2853k9.W);
                F5 f52 = c2853k9.W;
                if (f52 != null) {
                    String TAG = c2853k9.X;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                    ((G5) f52).c(TAG, SFPXhf.SorAhsctXsKLX);
                }
                AbstractC3045vf abstractC3045vf = c2853k9.f32755p;
                if (abstractC3045vf != null) {
                    abstractC3045vf.a((byte) 9);
                }
            } else if (b10 == 1) {
                videoAsset.a(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, c2853k9.j(videoAsset), (V7) null, c2853k9.W);
                F5 f53 = c2853k9.W;
                if (f53 != null) {
                    String TAG2 = c2853k9.X;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                    ((G5) f53).c(TAG2, "onVideoQuartileEvent(Q2)");
                }
                AbstractC3045vf abstractC3045vf2 = c2853k9.f32755p;
                if (abstractC3045vf2 != null) {
                    abstractC3045vf2.a((byte) 10);
                }
            } else if (b10 == 2) {
                videoAsset.a("thirdQuartile", c2853k9.j(videoAsset), (V7) null, c2853k9.W);
                F5 f54 = c2853k9.W;
                if (f54 != null) {
                    String TAG3 = c2853k9.X;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
                    ((G5) f54).c(TAG3, "onVideoQuartileEvent(Q3)");
                }
                AbstractC3045vf abstractC3045vf3 = c2853k9.f32755p;
                if (abstractC3045vf3 != null) {
                    abstractC3045vf3.a((byte) 11);
                }
            } else if (b10 == 3) {
                Object obj = videoAsset.f33155t.get("didQ4Fire");
                if (kotlin.jvm.internal.e0.areEqual(obj instanceof Boolean ? (Boolean) obj : null, Boolean.FALSE)) {
                    c2853k9.d(videoAsset);
                }
            } else {
                F5 f55 = c2853k9.W;
                if (f55 != null) {
                    String TAG4 = c2853k9.X;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG4, "TAG");
                    ((G5) f55).b(TAG4, "Unhandled quartileEvent ( " + ((int) b10) + " ) for Native Video");
                }
            }
        }
        if (3 == b10) {
            try {
                ((C2853k9) this.f31910a.f32052b).c(this.f31911b);
            } catch (Exception e10) {
                N8 n82 = this.f31910a;
                F5 f56 = n82.f32056f;
                if (f56 != null) {
                    String str = n82.f32057g;
                    ((G5) f56).b(str, Qf.a(e10, N6.a(str, "access$getTAG$p(...)", "SDK encountered unexpected error in handling the onVideoCompleted event; ")));
                }
            }
        }
    }
}
