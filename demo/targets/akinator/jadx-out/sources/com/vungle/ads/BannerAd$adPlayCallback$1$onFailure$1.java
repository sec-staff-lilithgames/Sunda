package com.vungle.ads;

import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class BannerAd$adPlayCallback$1$onFailure$1 extends f0 implements kv.a {
    final /* synthetic */ VungleError $error;
    final /* synthetic */ BannerAd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAd$adPlayCallback$1$onFailure$1(BannerAd bannerAd, VungleError vungleError) {
        super(0);
        this.this$0 = bannerAd;
        this.$error = vungleError;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m3541invoke();
        return x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m3541invoke() {
        BaseAdListener adListener = this.this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(this.this$0, this.$error);
        }
    }
}
