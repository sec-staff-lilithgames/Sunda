package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.a5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2680a5 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EnumC3108za f32642a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2680a5(EnumC3108za enumC3108za) {
        super(1);
        this.f32642a = enumC3108za;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        GestureDetectorOnGestureListenerC3093yc it = (GestureDetectorOnGestureListenerC3093yc) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        EnumC3108za orientation = this.f32642a;
        it.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        F5 f52 = it.f33628i;
        if (f52 != null) {
            String TAG = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "handle orientationChange " + it + ' ' + orientation);
        }
        int iA = Aa.a(orientation);
        F5 f53 = it.f33628i;
        if (f53 != null) {
            String TAG2 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f53).a(TAG2, "fireOrientationChange " + it + ' ' + iA);
        }
        it.c("window.imraid.broadcastEvent('orientationChange','" + iA + "');");
        return tu.x0.f87415a;
    }
}
