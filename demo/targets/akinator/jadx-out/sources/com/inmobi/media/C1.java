package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.listeners.AudioAdEventListener;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class C1 extends PublisherCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<InMobiAudio> f31699a;

    public C1(InMobiAudio audio) {
        kotlin.jvm.internal.e0.checkNotNullParameter(audio, "audio");
        this.f31699a = new WeakReference<>(audio);
    }

    public final WeakReference<InMobiAudio> a() {
        return this.f31699a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(Map<Object, ? extends Object> params) {
        AudioAdEventListener mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(params, "params");
        InMobiAudio inMobiAudio = this.f31699a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdClicked(inMobiAudio, params);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        AudioAdEventListener mPubListener$media_release;
        InMobiAudio inMobiAudio = this.f31699a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdDismissed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayFailed() {
        AudioAdEventListener mPubListener$media_release;
        InMobiAudio inMobiAudio = this.f31699a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdDisplayFailed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(AdMetaInfo info) {
        AudioAdEventListener mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        InMobiAudio inMobiAudio = this.f31699a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdDisplayed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo info) {
        AudioAdEventListener mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        InMobiAudio inMobiAudio = this.f31699a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdFetchSuccessful(inMobiAudio, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(C3078xe c3078xe) {
        InMobiAudio inMobiAudio = this.f31699a.get();
        AudioAdEventListener mPubListener$media_release = inMobiAudio != null ? inMobiAudio.getMPubListener$media_release() : null;
        if (mPubListener$media_release == null) {
            if (c3078xe != null) {
                c3078xe.c();
            }
        } else {
            mPubListener$media_release.onAdImpression(inMobiAudio);
            if (c3078xe != null) {
                c3078xe.d();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(InMobiAdRequestStatus status) {
        AudioAdEventListener mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        InMobiAudio inMobiAudio = this.f31699a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdLoadFailed(inMobiAudio, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(AdMetaInfo info) {
        AudioAdEventListener mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        InMobiAudio inMobiAudio = this.f31699a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdLoadSucceeded(inMobiAudio, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAudioStatusChanged(F1 item) {
        AudioAdEventListener mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(item, "audioStatusInternal");
        InMobiAudio inMobiAudio = this.f31699a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        F1.f31761b.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(item, "item");
        int iOrdinal = item.ordinal();
        mPubListener$media_release.onAudioStatusChanged(inMobiAudio, iOrdinal != 1 ? iOrdinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED : AudioStatus.PLAYING);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] request) {
        AudioAdEventListener mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        InMobiAudio inMobiAudio = this.f31699a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onRequestPayloadCreated(request);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus reason) {
        AudioAdEventListener mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(reason, "reason");
        InMobiAudio inMobiAudio = this.f31699a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onRequestPayloadCreationFailed(reason);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(Map<Object, ? extends Object> rewards) {
        AudioAdEventListener mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(rewards, "rewards");
        InMobiAudio inMobiAudio = this.f31699a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onRewardsUnlocked(inMobiAudio, rewards);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        AudioAdEventListener mPubListener$media_release;
        InMobiAudio inMobiAudio = this.f31699a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onUserLeftApplication(inMobiAudio);
    }

    public final void a(WeakReference<InMobiAudio> weakReference) {
        kotlin.jvm.internal.e0.checkNotNullParameter(weakReference, "<set-?>");
        this.f31699a = weakReference;
    }
}
