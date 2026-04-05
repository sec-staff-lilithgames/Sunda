package z8;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g extends f {
    @Override // z8.f, p8.v0
    public Class<Drawable> getResourceClass() {
        return this.f97696b.getClass();
    }

    @Override // z8.f, p8.v0
    public int getSize() {
        Drawable drawable = this.f97696b;
        return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
    }

    @Override // z8.f, p8.v0
    public void recycle() {
    }
}
