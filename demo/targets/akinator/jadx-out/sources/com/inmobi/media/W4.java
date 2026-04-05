package com.inmobi.media;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class W4 implements InterfaceC2832j5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y4 f32436a;

    public W4(Y4 y42) {
        this.f32436a = y42;
    }

    @Override // com.inmobi.media.InterfaceC2832j5
    public final void a(View view, Object obj) {
        if (view instanceof GestureDetectorOnGestureListenerC3093yc) {
            F5 f52 = this.f32436a.f32558f;
            if (f52 != null) {
                ((G5) f52).a("HtmlAdTracker", "fireImpression");
            }
            ((GestureDetectorOnGestureListenerC3093yc) view).m();
        }
    }
}
