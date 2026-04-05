package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Q1 extends PublisherCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<InMobiBanner> f32148a;

    public Q1(InMobiBanner banner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(banner, "banner");
        this.f32148a = new WeakReference<>(banner);
    }

    public final WeakReference<InMobiBanner> a() {
        return this.f32148a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(Map<Object, ? extends Object> params) {
        J1 mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(params, "params");
        InMobiBanner inMobiBanner = this.f32148a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiBanner, params);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        InMobiBanner ad2 = this.f32148a.get();
        if (ad2 == null) {
            return;
        }
        J1 mPubListener$media_release = ad2.getMPubListener$media_release();
        if (mPubListener$media_release != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
            ((K1) mPubListener$media_release).f31935a.onAdDismissed(ad2);
        }
        ad2.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(AdMetaInfo info) {
        J1 mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        InMobiBanner ad2 = this.f32148a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        ((K1) mPubListener$media_release).f31935a.onAdDisplayed(ad2);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus status) {
        J1 mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        InMobiBanner ad2 = this.f32148a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        ((K1) mPubListener$media_release).f31935a.onAdFetchFailed(ad2, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo info) {
        J1 mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        InMobiBanner inMobiBanner = this.f32148a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiBanner, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(C3078xe c3078xe) {
        InMobiBanner inMobiBanner = this.f32148a.get();
        J1 mPubListener$media_release = inMobiBanner != null ? inMobiBanner.getMPubListener$media_release() : null;
        if (mPubListener$media_release == null) {
            if (c3078xe != null) {
                c3078xe.c();
            }
        } else {
            mPubListener$media_release.a(inMobiBanner);
            if (c3078xe != null) {
                c3078xe.d();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(InMobiAdRequestStatus status) {
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("Q1", "getSimpleName(...)");
        InMobiBanner inMobiBanner = this.f32148a.get();
        if (inMobiBanner == null) {
            return;
        }
        J1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
        if (mPubListener$media_release != null) {
            mPubListener$media_release.a(inMobiBanner, status);
        }
        inMobiBanner.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(AdMetaInfo info) {
        T1 mAdManager$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        InMobiBanner inMobiBanner = this.f32148a.get();
        if (inMobiBanner == null || (mAdManager$media_release = inMobiBanner.getMAdManager$media_release()) == null) {
            return;
        }
        if (!mAdManager$media_release.B() && mAdManager$media_release.x()) {
            inMobiBanner.swapAdUnitsAndDisplayAd$media_release();
            J1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
            if (mPubListener$media_release != null) {
                mPubListener$media_release.b(inMobiBanner, info);
            }
            inMobiBanner.scheduleRefresh$media_release();
            return;
        }
        if (mAdManager$media_release.B()) {
            U0 u0J = mAdManager$media_release.j();
            if (u0J != null) {
                u0J.b((short) 2173);
                return;
            }
            return;
        }
        U0 u0J2 = mAdManager$media_release.j();
        if (u0J2 != null) {
            u0J2.b((short) 2174);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAudioStatusChanged(F1 item) {
        kotlin.jvm.internal.e0.checkNotNullParameter(item, "audioStatusInternal");
        InMobiBanner inMobiBanner = this.f32148a.get();
        if (inMobiBanner == null) {
            return;
        }
        inMobiBanner.setAudioStatusInternal$media_release(item);
        AudioListener mAudioListener$media_release = inMobiBanner.getMAudioListener$media_release();
        if (mAudioListener$media_release != null) {
            F1.f31761b.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(item, "item");
            int iOrdinal = item.ordinal();
            mAudioListener$media_release.onAudioStatusChanged(inMobiBanner, iOrdinal != 1 ? iOrdinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED : AudioStatus.PLAYING);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(String log) {
        J1 mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(log, "log");
        InMobiBanner inMobiBanner = this.f32148a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiBanner, log);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] request) {
        J1 mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        InMobiBanner inMobiBanner = this.f32148a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        ((K1) mPubListener$media_release).f31935a.onRequestPayloadCreated(request);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus status) {
        J1 mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "reason");
        InMobiBanner inMobiBanner = this.f32148a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        ((K1) mPubListener$media_release).f31935a.onRequestPayloadCreationFailed(status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(Map<Object, ? extends Object> rewards) {
        J1 mPubListener$media_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(rewards, "rewards");
        InMobiBanner ad2 = this.f32148a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(rewards, "rewards");
        ((K1) mPubListener$media_release).f31935a.onRewardsUnlocked(ad2, rewards);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        J1 mPubListener$media_release;
        InMobiBanner ad2 = this.f32148a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        ((K1) mPubListener$media_release).f31935a.onUserLeftApplication(ad2);
    }

    public final void a(WeakReference<InMobiBanner> weakReference) {
        kotlin.jvm.internal.e0.checkNotNullParameter(weakReference, "<set-?>");
        this.f32148a = weakReference;
    }
}
