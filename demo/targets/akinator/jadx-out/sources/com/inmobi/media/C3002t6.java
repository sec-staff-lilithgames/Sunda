package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.t6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3002t6 extends PublisherCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<InMobiInterstitial> f33387a;

    public C3002t6(InMobiInterstitial interstitial) {
        kotlin.jvm.internal.e0.checkNotNullParameter(interstitial, "interstitial");
        this.f33387a = new WeakReference<>(interstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(Map<Object, ? extends Object> params) {
        AbstractC2901n6 mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(params, "params");
        InMobiInterstitial inMobiInterstitial = this.f33387a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, params);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        AbstractC2901n6 mPubListener$media_release;
        InMobiInterstitial ad2 = this.f33387a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        ((C2918o6) mPubListener$media_release).f33180a.onAdDismissed(ad2);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayFailed() {
        AbstractC2901n6 mPubListener$media_release;
        InMobiInterstitial ad2 = this.f33387a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        ((C2918o6) mPubListener$media_release).f33180a.onAdDisplayFailed(ad2);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(AdMetaInfo info) {
        AbstractC2901n6 mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        InMobiInterstitial ad2 = this.f33387a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        ((C2918o6) mPubListener$media_release).f33180a.onAdDisplayed(ad2, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus status) {
        AbstractC2901n6 mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        InMobiInterstitial ad2 = this.f33387a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        ((C2918o6) mPubListener$media_release).f33180a.onAdFetchFailed(ad2, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo info) {
        AbstractC2901n6 mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        InMobiInterstitial inMobiInterstitial = this.f33387a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(C3078xe c3078xe) {
        InMobiInterstitial inMobiInterstitial = this.f33387a.get();
        AbstractC2901n6 mPubListener$media_release = inMobiInterstitial != null ? inMobiInterstitial.getMPubListener$media_release() : null;
        if (mPubListener$media_release == null) {
            if (c3078xe != null) {
                c3078xe.c();
            }
        } else {
            mPubListener$media_release.a(inMobiInterstitial);
            if (c3078xe != null) {
                c3078xe.d();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(InMobiAdRequestStatus status) {
        AbstractC2901n6 mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        InMobiInterstitial inMobiInterstitial = this.f33387a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(AdMetaInfo info) {
        AbstractC2901n6 mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        InMobiInterstitial inMobiInterstitial = this.f33387a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.b(inMobiInterstitial, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdWillDisplay() {
        AbstractC2901n6 mPubListener$media_release;
        InMobiInterstitial ad2 = this.f33387a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        ((C2918o6) mPubListener$media_release).f33180a.onAdWillDisplay(ad2);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(String log) {
        AbstractC2901n6 mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(log, "log");
        InMobiInterstitial inMobiInterstitial = this.f33387a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, log);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] request) {
        AbstractC2901n6 mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        InMobiInterstitial inMobiInterstitial = this.f33387a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C2918o6) mPubListener$media_release).f33180a.onRequestPayloadCreated(request);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus status) {
        AbstractC2901n6 mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "reason");
        InMobiInterstitial inMobiInterstitial = this.f33387a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        ((C2918o6) mPubListener$media_release).f33180a.onRequestPayloadCreationFailed(status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(Map<Object, ? extends Object> rewards) {
        AbstractC2901n6 mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(rewards, "rewards");
        InMobiInterstitial ad2 = this.f33387a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(rewards, "rewards");
        ((C2918o6) mPubListener$media_release).f33180a.onRewardsUnlocked(ad2, rewards);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        AbstractC2901n6 mPubListener$media_release;
        InMobiInterstitial ad2 = this.f33387a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        ((C2918o6) mPubListener$media_release).f33180a.onUserLeftApplication(ad2);
    }
}
