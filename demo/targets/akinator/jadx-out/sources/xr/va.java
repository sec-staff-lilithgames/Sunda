package xr;

import com.ironsource.C3191e4;
import wr.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class va extends b3.d {

    /* renamed from: a, reason: collision with root package name */
    public final wr.i f93196a;

    /* renamed from: b, reason: collision with root package name */
    public final wr.e4 f93197b;

    /* renamed from: c, reason: collision with root package name */
    public final wr.k4 f93198c;

    public va(wr.k4 k4Var, wr.e4 e4Var, wr.i iVar) {
        this.f93198c = (wr.k4) mh.p1.checkNotNull(k4Var, "method");
        this.f93197b = (wr.e4) mh.p1.checkNotNull(e4Var, "headers");
        this.f93196a = (wr.i) mh.p1.checkNotNull(iVar, "callOptions");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && va.class == obj.getClass()) {
            va vaVar = (va) obj;
            if (mh.h1.equal(this.f93196a, vaVar.f93196a) && mh.h1.equal(this.f93197b, vaVar.f93197b) && mh.h1.equal(this.f93198c, vaVar.f93198c)) {
                return true;
            }
        }
        return false;
    }

    @Override // wr.b3.d
    public wr.i getCallOptions() {
        return this.f93196a;
    }

    @Override // wr.b3.d
    public wr.e4 getHeaders() {
        return this.f93197b;
    }

    @Override // wr.b3.d
    public wr.k4 getMethodDescriptor() {
        return this.f93198c;
    }

    public int hashCode() {
        return mh.h1.hashCode(this.f93196a, this.f93197b, this.f93198c);
    }

    public final String toString() {
        return "[method=" + this.f93198c + " headers=" + this.f93197b + " callOptions=" + this.f93196a + C3191e4.i.f36531e;
    }
}
