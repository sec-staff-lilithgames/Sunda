package com.vungle.ads.internal.presenter;

import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.util.LogEntry;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class NativeAdPresenter$logEntry$2 extends f0 implements kv.a {
    final /* synthetic */ NativeAdPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdPresenter$logEntry$2(NativeAdPresenter nativeAdPresenter) {
        super(0);
        this.this$0 = nativeAdPresenter;
    }

    @Override // kv.a
    public final LogEntry invoke() {
        AdPayload adPayload = this.this$0.advertisement;
        if (adPayload != null) {
            return adPayload.getLogEntry$vungle_ads_release();
        }
        return null;
    }
}
