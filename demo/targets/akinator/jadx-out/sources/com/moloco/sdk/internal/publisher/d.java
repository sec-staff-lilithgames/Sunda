package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d implements InterstitialAd, e0, FullscreenAd {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f46248b;

    public d(h0 fullscreenAd) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fullscreenAd, "fullscreenAd");
        this.f46248b = fullscreenAd;
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        this.f46248b.destroy();
    }

    @Override // com.moloco.sdk.internal.publisher.e0
    public long getCreateAdObjectStartTime() {
        return this.f46248b.getCreateAdObjectStartTime();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.f46248b.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(String bidResponseJson, AdLoad.Listener listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        this.f46248b.load(bidResponseJson, listener);
    }

    @Override // com.moloco.sdk.internal.publisher.e0
    public void setCreateAdObjectStartTime(long j10) {
        this.f46248b.setCreateAdObjectStartTime(j10);
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    public void show(InterstitialAdShowListener interstitialAdShowListener) {
        this.f46248b.show(e.a(interstitialAdShowListener));
    }
}
