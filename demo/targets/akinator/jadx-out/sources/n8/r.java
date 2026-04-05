package n8;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p8.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class r implements z {

    /* renamed from: b, reason: collision with root package name */
    public final Collection f75850b;

    @SafeVarargs
    public r(z... zVarArr) {
        if (zVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f75850b = Arrays.asList(zVarArr);
    }

    @Override // n8.q
    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f75850b.equals(((r) obj).f75850b);
        }
        return false;
    }

    @Override // n8.q
    public int hashCode() {
        return this.f75850b.hashCode();
    }

    @Override // n8.z
    public v0 transform(Context context, v0 v0Var, int i10, int i11) {
        Iterator it = this.f75850b.iterator();
        v0 v0Var2 = v0Var;
        while (it.hasNext()) {
            v0 v0VarTransform = ((z) it.next()).transform(context, v0Var2, i10, i11);
            if (v0Var2 != null && !v0Var2.equals(v0Var) && !v0Var2.equals(v0VarTransform)) {
                v0Var2.recycle();
            }
            v0Var2 = v0VarTransform;
        }
        return v0Var2;
    }

    @Override // n8.z, n8.q
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        Iterator it = this.f75850b.iterator();
        while (it.hasNext()) {
            ((z) it.next()).updateDiskCacheKey(messageDigest);
        }
    }

    public r(Collection<? extends z> collection) {
        if (!collection.isEmpty()) {
            this.f75850b = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }
}
