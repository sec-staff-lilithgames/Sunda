package x8;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x0 implements p8.v0 {

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f91886b;

    public x0(Bitmap bitmap) {
        this.f91886b = bitmap;
    }

    @Override // p8.v0
    public Class<Bitmap> getResourceClass() {
        return Bitmap.class;
    }

    @Override // p8.v0
    public int getSize() {
        return j9.s.getBitmapByteSize(this.f91886b);
    }

    @Override // p8.v0
    public Bitmap get() {
        return this.f91886b;
    }

    @Override // p8.v0
    public void recycle() {
    }
}
