package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class N extends AbstractC2694b2 {

    /* renamed from: a, reason: collision with root package name */
    public final O f32038a;

    /* renamed from: b, reason: collision with root package name */
    public final C3078xe f32039b;

    public N(O adImpressionCallbackHandler, C3078xe c3078xe) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adImpressionCallbackHandler, "adImpressionCallbackHandler");
        this.f32038a = adImpressionCallbackHandler;
        this.f32039b = c3078xe;
    }

    @Override // com.inmobi.media.AbstractC2694b2
    public final void a(C2897n2 click) {
        kotlin.jvm.internal.e0.checkNotNullParameter(click, "click");
        this.f32038a.a(this.f32039b);
    }

    @Override // com.inmobi.media.AbstractC2694b2
    public final void a(C2897n2 click, String reason) {
        kotlin.jvm.internal.e0.checkNotNullParameter(click, "click");
        kotlin.jvm.internal.e0.checkNotNullParameter(reason, "error");
        C3078xe c3078xe = this.f32039b;
        kotlin.jvm.internal.e0.checkNotNullParameter(reason, "reason");
        LinkedHashMap linkedHashMapA = c3078xe.a();
        linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2178);
        linkedHashMapA.put("reason", reason);
        String str = c3078xe.f33585d;
        if (str == null) {
            str = "";
        }
        linkedHashMapA.put("impressionId", str);
        C2926oe c2926oe = C2926oe.f33217a;
        C2926oe.b("AdImpressionSuccessful", linkedHashMapA, EnumC2993se.f33373a);
    }
}
