package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class V7 extends AbstractC2694b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2734d8 f32392a;

    public V7(C2734d8 c2734d8) {
        this.f32392a = c2734d8;
    }

    @Override // com.inmobi.media.AbstractC2694b2
    public final void a(C2897n2 click) {
        kotlin.jvm.internal.e0.checkNotNullParameter(click, "click");
        C2734d8 c2734d8 = this.f32392a;
        LinkedHashMap linkedHashMap = c2734d8.R;
        C3078xe telemetryOnAdImpression = new C3078xe(linkedHashMap != null ? (W0) linkedHashMap.get("AdImpressionSuccessful") : null, c2734d8.f32748i.f32572f, c2734d8.getCreativeId(), c2734d8.getImpressionId(), "inmobiJson");
        kotlin.jvm.internal.e0.checkNotNullParameter("nativeBeacon", "<set-?>");
        telemetryOnAdImpression.f33587f = "nativeBeacon";
        R0 r02 = this.f32392a.f32762w;
        if (r02 != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(telemetryOnAdImpression, "telemetryOnAdImpression");
            kotlin.jvm.internal.e0.checkNotNullParameter("nativeBeacon", "<set-?>");
            telemetryOnAdImpression.f33587f = "nativeBeacon";
            if (r02.f32179a.a0()) {
                telemetryOnAdImpression.b();
            } else {
                r02.f32179a.D.a(telemetryOnAdImpression);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC2694b2
    public final void a(C2897n2 click, String reason) {
        kotlin.jvm.internal.e0.checkNotNullParameter(click, "click");
        kotlin.jvm.internal.e0.checkNotNullParameter(reason, "error");
        C2734d8 c2734d8 = this.f32392a;
        LinkedHashMap linkedHashMap = c2734d8.R;
        W0 w02 = linkedHashMap != null ? (W0) linkedHashMap.get("AdImpressionSuccessful") : null;
        String str = c2734d8.f32748i.f32572f;
        String creativeId = c2734d8.getCreativeId();
        String impressionId = c2734d8.getImpressionId();
        C3078xe c3078xe = new C3078xe(w02, str, creativeId, impressionId, "inmobiJson");
        kotlin.jvm.internal.e0.checkNotNullParameter("nativeBeacon", "<set-?>");
        c3078xe.f33587f = "nativeBeacon";
        kotlin.jvm.internal.e0.checkNotNullParameter(reason, "reason");
        LinkedHashMap linkedHashMapA = c3078xe.a();
        linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2178);
        linkedHashMapA.put("reason", reason);
        if (impressionId == null) {
            impressionId = "";
        }
        linkedHashMapA.put("impressionId", impressionId);
        C2926oe c2926oe = C2926oe.f33217a;
        C2926oe.b("AdImpressionSuccessful", linkedHashMapA, EnumC2993se.f33373a);
    }
}
