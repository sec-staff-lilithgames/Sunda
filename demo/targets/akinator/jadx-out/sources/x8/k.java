package x8;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class k extends f {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f91846b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(n8.q.f75849a);

    @Override // x8.f
    public final Bitmap a(q8.d dVar, Bitmap bitmap, int i10, int i11) {
        return w0.circleCrop(dVar, bitmap, i10, i11);
    }

    @Override // n8.q
    public boolean equals(Object obj) {
        return obj instanceof k;
    }

    @Override // n8.q
    public int hashCode() {
        return 1101716364;
    }

    @Override // x8.f, n8.z, n8.q
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f91846b);
    }
}
