package com.inmobi.media;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.l2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2863l2 implements androidx.browser.customtabs.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2880m2 f33039a;

    public C2863l2(C2880m2 c2880m2) {
        this.f33039a = c2880m2;
    }

    @Override // androidx.browser.customtabs.o0
    public final void onGreatestScrollPercentageIncreased(int i10, Bundle extras) {
        kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
    }

    @Override // androidx.browser.customtabs.o0
    public final void onSessionEnded(boolean z10, Bundle extras) {
        InterfaceC2779g2 interfaceC2779g2;
        kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
        if (z10 && (interfaceC2779g2 = (InterfaceC2779g2) this.f33039a.f33077i.get()) != null) {
            GestureDetectorOnGestureListenerC3093yc.Z0.getClass();
            interfaceC2779g2.a(C2687ac.a("IN_NATIVE_BROWSER", "onInteraction"));
        }
        InterfaceC2779g2 interfaceC2779g22 = (InterfaceC2779g2) this.f33039a.f33077i.get();
        if (interfaceC2779g22 != null) {
            GestureDetectorOnGestureListenerC3093yc.Z0.getClass();
            interfaceC2779g22.a(C2687ac.a("IN_NATIVE_BROWSER", "onClose"));
        }
    }

    @Override // androidx.browser.customtabs.o0
    public final void onVerticalScrollEvent(boolean z10, Bundle extras) {
        kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
        C2880m2 c2880m2 = this.f33039a;
        if (c2880m2.f33076h) {
            return;
        }
        c2880m2.f33076h = true;
        InterfaceC2779g2 interfaceC2779g2 = (InterfaceC2779g2) c2880m2.f33077i.get();
        if (interfaceC2779g2 != null) {
            GestureDetectorOnGestureListenerC3093yc.Z0.getClass();
            interfaceC2779g2.a(C2687ac.a("IN_NATIVE_BROWSER", "onScroll"));
        }
    }
}
