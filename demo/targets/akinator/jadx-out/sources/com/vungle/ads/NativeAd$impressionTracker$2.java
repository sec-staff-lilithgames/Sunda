package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.ImpressionTracker;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class NativeAd$impressionTracker$2 extends f0 implements kv.a {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAd$impressionTracker$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kv.a
    public final ImpressionTracker invoke() {
        return new ImpressionTracker(this.$context);
    }
}
