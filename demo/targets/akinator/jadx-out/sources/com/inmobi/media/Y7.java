package com.inmobi.media;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Y7 implements Df {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2734d8 f32576a;

    public Y7(C2734d8 c2734d8) {
        this.f32576a = c2734d8;
    }

    @Override // com.inmobi.media.Df
    public final void a(View view, boolean z10) {
        C2727d1 c2727d1;
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        C2734d8 c2734d8 = this.f32576a;
        if (z10) {
            c2734d8.p();
            return;
        }
        N8 n8H = c2734d8.h();
        if (n8H == null || (c2727d1 = n8H.f32062l) == null) {
            return;
        }
        c2727d1.a();
    }
}
