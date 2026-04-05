package z8;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import j9.s;
import p8.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final AnimatedImageDrawable f97690b;

    public a(AnimatedImageDrawable animatedImageDrawable) {
        this.f97690b = animatedImageDrawable;
    }

    @Override // p8.v0
    public Class<Drawable> getResourceClass() {
        return Drawable.class;
    }

    @Override // p8.v0
    public int getSize() {
        return s.getBytesPerPixel(Bitmap.Config.ARGB_8888) * this.f97690b.getIntrinsicHeight() * this.f97690b.getIntrinsicWidth() * 2;
    }

    @Override // p8.v0
    public void recycle() {
        this.f97690b.stop();
        this.f97690b.clearAnimationCallbacks();
    }

    @Override // p8.v0
    public AnimatedImageDrawable get() {
        return this.f97690b;
    }
}
