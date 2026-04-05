package xr;

import wr.b6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class jd extends b6.b {

    /* renamed from: a, reason: collision with root package name */
    public final wr.k4 f92719a;

    /* renamed from: b, reason: collision with root package name */
    public final wr.c f92720b;

    /* renamed from: c, reason: collision with root package name */
    public final String f92721c;

    public jd(wr.k4 k4Var, wr.c cVar, String str) {
        this.f92719a = k4Var;
        this.f92720b = cVar;
        this.f92721c = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof jd)) {
            return false;
        }
        jd jdVar = (jd) obj;
        return mh.h1.equal(this.f92719a, jdVar.f92719a) && mh.h1.equal(this.f92720b, jdVar.f92720b) && mh.h1.equal(this.f92721c, jdVar.f92721c);
    }

    @Override // wr.b6.b
    public wr.c getAttributes() {
        return this.f92720b;
    }

    @Override // wr.b6.b
    public String getAuthority() {
        return this.f92721c;
    }

    @Override // wr.b6.b
    public wr.k4 getMethodDescriptor() {
        return this.f92719a;
    }

    public int hashCode() {
        return mh.h1.hashCode(this.f92719a, this.f92720b, this.f92721c);
    }
}
