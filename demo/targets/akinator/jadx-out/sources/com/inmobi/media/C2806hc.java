package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.hc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2806hc extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3093yc f32898a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2806hc(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc) {
        super(1);
        this.f32898a = gestureDetectorOnGestureListenerC3093yc;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f32898a;
        F5 f52 = gestureDetectorOnGestureListenerC3093yc.f33628i;
        if (f52 != null) {
            String TAG = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onRenderProcessGone");
        }
        gestureDetectorOnGestureListenerC3093yc.getListener().a(gestureDetectorOnGestureListenerC3093yc, zBooleanValue);
        return tu.x0.f87415a;
    }
}
