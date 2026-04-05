package x8;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e implements p8.v0, p8.r0 {

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f91815b;

    /* renamed from: c, reason: collision with root package name */
    public final q8.d f91816c;

    public e(Bitmap bitmap, q8.d dVar) {
        this.f91815b = (Bitmap) j9.q.checkNotNull(bitmap, "Bitmap must not be null");
        this.f91816c = (q8.d) j9.q.checkNotNull(dVar, "BitmapPool must not be null");
    }

    public static e obtain(Bitmap bitmap, q8.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, dVar);
    }

    @Override // p8.v0
    public Class<Bitmap> getResourceClass() {
        return Bitmap.class;
    }

    @Override // p8.v0
    public int getSize() {
        return j9.s.getBitmapByteSize(this.f91815b);
    }

    @Override // p8.r0
    public void initialize() {
        this.f91815b.prepareToDraw();
    }

    @Override // p8.v0
    public void recycle() {
        this.f91816c.put(this.f91815b);
    }

    @Override // p8.v0
    public Bitmap get() {
        return this.f91815b;
    }
}
