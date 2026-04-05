package b9;

import android.content.Context;
import android.graphics.Bitmap;
import j9.q;
import java.security.MessageDigest;
import n8.z;
import p8.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class g implements z {

    /* renamed from: b, reason: collision with root package name */
    public final z f8945b;

    public g(z zVar) {
        this.f8945b = (z) q.checkNotNull(zVar);
    }

    @Override // n8.q
    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f8945b.equals(((g) obj).f8945b);
        }
        return false;
    }

    @Override // n8.q
    public int hashCode() {
        return this.f8945b.hashCode();
    }

    @Override // n8.z
    public v0 transform(Context context, v0 v0Var, int i10, int i11) {
        d dVar = (d) v0Var.get();
        x8.e eVar = new x8.e(dVar.getFirstFrame(), com.bumptech.glide.c.get(context).getBitmapPool());
        z zVar = this.f8945b;
        v0 v0VarTransform = zVar.transform(context, eVar, i10, i11);
        if (!eVar.equals(v0VarTransform)) {
            eVar.recycle();
        }
        dVar.setFrameTransformation(zVar, (Bitmap) v0VarTransform.get());
        return v0Var;
    }

    @Override // n8.z, n8.q
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f8945b.updateDiskCacheKey(messageDigest);
    }
}
