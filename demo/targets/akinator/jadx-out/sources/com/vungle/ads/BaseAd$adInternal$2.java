package com.vungle.ads;

import com.vungle.ads.internal.AdInternal;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class BaseAd$adInternal$2 extends f0 implements kv.a {
    final /* synthetic */ BaseAd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAd$adInternal$2(BaseAd baseAd) {
        super(0);
        this.this$0 = baseAd;
    }

    @Override // kv.a
    public final AdInternal invoke() {
        BaseAd baseAd = this.this$0;
        AdInternal adInternalConstructAdInternal$vungle_ads_release = baseAd.constructAdInternal$vungle_ads_release(baseAd.getContext());
        adInternalConstructAdInternal$vungle_ads_release.setLogEntry$vungle_ads_release(this.this$0.getLogEntry$vungle_ads_release());
        return adInternalConstructAdInternal$vungle_ads_release;
    }
}
