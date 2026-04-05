package x8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d0 implements n8.z {

    /* renamed from: b, reason: collision with root package name */
    public final n8.z f91813b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f91814c;

    public d0(n8.z zVar, boolean z10) {
        this.f91813b = zVar;
        this.f91814c = z10;
    }

    @Override // n8.q
    public boolean equals(Object obj) {
        if (obj instanceof d0) {
            return this.f91813b.equals(((d0) obj).f91813b);
        }
        return false;
    }

    @Override // n8.q
    public int hashCode() {
        return this.f91813b.hashCode();
    }

    @Override // n8.z
    public p8.v0 transform(Context context, p8.v0 v0Var, int i10, int i11) {
        q8.d bitmapPool = com.bumptech.glide.c.get(context).getBitmapPool();
        Drawable drawable = (Drawable) v0Var.get();
        e eVarA = c0.a(bitmapPool, drawable, i10, i11);
        if (eVarA != null) {
            p8.v0 v0VarTransform = this.f91813b.transform(context, eVarA, i10, i11);
            if (!v0VarTransform.equals(eVarA)) {
                return m0.obtain(context.getResources(), v0VarTransform);
            }
            v0VarTransform.recycle();
            return v0Var;
        }
        if (!this.f91814c) {
            return v0Var;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // n8.z, n8.q
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f91813b.updateDiskCacheKey(messageDigest);
    }

    public n8.z asBitmapDrawable() {
        return this;
    }
}
