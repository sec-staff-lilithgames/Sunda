package com.inmobi.media;

import android.view.ViewParent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.k4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2848k4 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2899n4 f33006a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2848k4(C2899n4 c2899n4) {
        super(0);
        this.f33006a = c2899n4;
    }

    @Override // kv.a
    public final Object invoke() {
        InterfaceC2798h4 interfaceC2798h4;
        ViewParent parent = this.f33006a.getParent();
        C2747e4 c2747e4 = parent instanceof C2747e4 ? (C2747e4) parent : null;
        if (c2747e4 != null && (interfaceC2798h4 = c2747e4.f32803d) != null) {
            InterfaceC3063x interfaceC3063x = ((C2917o5) interfaceC2798h4).f33179a.f33249b;
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = interfaceC3063x instanceof GestureDetectorOnGestureListenerC3093yc ? (GestureDetectorOnGestureListenerC3093yc) interfaceC3063x : null;
            if (gestureDetectorOnGestureListenerC3093yc != null) {
                gestureDetectorOnGestureListenerC3093yc.q();
            }
        }
        return tu.x0.f87415a;
    }
}
