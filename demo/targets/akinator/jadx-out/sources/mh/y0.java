package mh;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y0 extends j0 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Pattern f74720b;

    public y0(Pattern pattern) {
        this.f74720b = (Pattern) p1.checkNotNull(pattern);
    }

    @Override // mh.j0
    public int flags() {
        return this.f74720b.flags();
    }

    @Override // mh.j0
    public i0 matcher(CharSequence charSequence) {
        return new x0(this.f74720b.matcher(charSequence));
    }

    @Override // mh.j0
    public String pattern() {
        return this.f74720b.pattern();
    }

    @Override // mh.j0
    public String toString() {
        return this.f74720b.toString();
    }
}
