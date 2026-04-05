package com.inmobi.media;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class R6 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S6 f32205a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R6(S6 s62) {
        super(2);
        this.f32205a = s62;
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) {
        String trackerName = (String) obj;
        Map macros = (Map) obj2;
        kotlin.jvm.internal.e0.checkNotNullParameter(trackerName, "trackerName");
        kotlin.jvm.internal.e0.checkNotNullParameter(macros, "macros");
        C2924oc c2924oc = this.f32205a.f32260d;
        if (c2924oc != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(trackerName, "trackerName");
            kotlin.jvm.internal.e0.checkNotNullParameter(macros, "macros");
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = c2924oc.f33206a;
            if (!gestureDetectorOnGestureListenerC3093yc.f33620e) {
                gestureDetectorOnGestureListenerC3093yc.a(trackerName, macros);
            }
        }
        return tu.x0.f87415a;
    }
}
