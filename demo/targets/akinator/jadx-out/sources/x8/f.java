package x8;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class f implements n8.z {
    public abstract Bitmap a(q8.d dVar, Bitmap bitmap, int i10, int i11);

    @Override // n8.z
    public final p8.v0 transform(Context context, p8.v0 v0Var, int i10, int i11) {
        if (!j9.s.isValidDimensions(i10, i11)) {
            throw new IllegalArgumentException(o2.i(i10, i11, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        q8.d bitmapPool = com.bumptech.glide.c.get(context).getBitmapPool();
        Bitmap bitmap = (Bitmap) v0Var.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapA = a(bitmapPool, bitmap, i10, i11);
        return bitmap.equals(bitmapA) ? v0Var : e.obtain(bitmapA, bitmapPool);
    }

    @Override // n8.z, n8.q
    public abstract /* synthetic */ void updateDiskCacheKey(MessageDigest messageDigest);
}
