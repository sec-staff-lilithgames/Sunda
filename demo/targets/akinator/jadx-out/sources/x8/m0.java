package x8;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m0 implements p8.v0, p8.r0 {

    /* renamed from: b, reason: collision with root package name */
    public final Resources f91849b;

    /* renamed from: c, reason: collision with root package name */
    public final p8.v0 f91850c;

    public m0(Resources resources, p8.v0 v0Var) {
        this.f91849b = (Resources) j9.q.checkNotNull(resources);
        this.f91850c = (p8.v0) j9.q.checkNotNull(v0Var);
    }

    @Deprecated
    public static m0 obtain(Context context, Bitmap bitmap) {
        return (m0) obtain(context.getResources(), e.obtain(bitmap, com.bumptech.glide.c.get(context).getBitmapPool()));
    }

    @Override // p8.v0
    public Class<BitmapDrawable> getResourceClass() {
        return BitmapDrawable.class;
    }

    @Override // p8.v0
    public int getSize() {
        return this.f91850c.getSize();
    }

    @Override // p8.r0
    public void initialize() {
        p8.v0 v0Var = this.f91850c;
        if (v0Var instanceof p8.r0) {
            ((p8.r0) v0Var).initialize();
        }
    }

    @Override // p8.v0
    public void recycle() {
        this.f91850c.recycle();
    }

    @Override // p8.v0
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f91849b, (Bitmap) this.f91850c.get());
    }

    @Deprecated
    public static m0 obtain(Resources resources, q8.d dVar, Bitmap bitmap) {
        return (m0) obtain(resources, e.obtain(bitmap, dVar));
    }

    public static p8.v0 obtain(Resources resources, p8.v0 v0Var) {
        if (v0Var == null) {
            return null;
        }
        return new m0(resources, v0Var);
    }
}
