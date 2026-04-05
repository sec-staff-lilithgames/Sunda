package com.inmobi.media;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Y0 extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z0 f32530a;

    public Y0(Z0 z02) {
        this.f32530a = z02;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(drawable, "drawable");
        super.onAnimationEnd(drawable);
        this.f32530a.e();
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(drawable, "drawable");
        super.onAnimationStart(drawable);
    }
}
