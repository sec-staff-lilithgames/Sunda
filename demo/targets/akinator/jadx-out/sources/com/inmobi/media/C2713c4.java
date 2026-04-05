package com.inmobi.media;

import android.widget.RelativeLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.c4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2713c4 extends Zf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RelativeLayout.LayoutParams f32706a;

    public C2713c4(RelativeLayout.LayoutParams layoutParams) {
        this.f32706a = layoutParams;
    }

    @Override // com.inmobi.media.Zf
    public final void a(EnumC3108za orientation, bg finalInsets) {
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        kotlin.jvm.internal.e0.checkNotNullParameter(finalInsets, "finalInsets");
        D2.a(finalInsets, this.f32706a, orientation);
    }
}
