package com.inmobi.media;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.bc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2704bc implements Df {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3093yc f32691a;

    public C2704bc(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc) {
        this.f32691a = gestureDetectorOnGestureListenerC3093yc;
    }

    @Override // com.inmobi.media.Df
    public final void a(View view, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        if (view instanceof GestureDetectorOnGestureListenerC3093yc) {
            if (this.f32691a.hasWindowFocus()) {
                this.f32691a.c(z10);
            } else {
                this.f32691a.c(false);
            }
        }
    }
}
