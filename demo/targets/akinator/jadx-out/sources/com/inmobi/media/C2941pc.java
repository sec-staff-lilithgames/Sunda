package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.pc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2941pc implements InterfaceC3046w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3093yc f33271a;

    public C2941pc(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc) {
        this.f33271a = gestureDetectorOnGestureListenerC3093yc;
    }

    @Override // com.inmobi.media.InterfaceC3046w
    public final void a() {
        F5 f52 = this.f33271a.f33628i;
        if (f52 != null) {
            String str = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((G5) f52).a(str, "onAdScreenDisplayFailed");
        }
        this.f33271a.getListener().c();
    }

    @Override // com.inmobi.media.InterfaceC3046w
    public final void b(Object obj) {
        F5 f52 = this.f33271a.f33628i;
        if (f52 != null) {
            String str = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((G5) f52).a(str, com.ironsource.Mf.f35005m);
        }
        if (kotlin.jvm.internal.e0.areEqual("Default", this.f33271a.getViewState())) {
            this.f33271a.setAndUpdateViewState("Hidden");
        }
        this.f33271a.A();
    }

    @Override // com.inmobi.media.InterfaceC3046w
    public final void a(Object obj) {
        F5 f52 = this.f33271a.f33628i;
        if (f52 != null) {
            String str = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((G5) f52).a(str, "onAdScreenDisplayed");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f33271a;
        if (gestureDetectorOnGestureListenerC3093yc.f33614b == 0) {
            gestureDetectorOnGestureListenerC3093yc.N = false;
        }
        gestureDetectorOnGestureListenerC3093yc.getListener().f(this.f33271a);
    }
}
