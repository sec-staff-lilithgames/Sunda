package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f90849a;

    /* renamed from: b, reason: collision with root package name */
    public final b2 f90850b;

    /* renamed from: c, reason: collision with root package name */
    public final long f90851c;

    /* renamed from: d, reason: collision with root package name */
    public final v2 f90852d;

    /* renamed from: e, reason: collision with root package name */
    public final v2 f90853e;

    public c2(String str, b2 b2Var, long j10, v2 v2Var, v2 v2Var2) {
        this.f90849a = str;
        this.f90850b = (b2) mh.p1.checkNotNull(b2Var, "severity");
        this.f90851c = j10;
        this.f90852d = v2Var;
        this.f90853e = v2Var2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c2) {
            c2 c2Var = (c2) obj;
            if (mh.h1.equal(this.f90849a, c2Var.f90849a) && mh.h1.equal(this.f90850b, c2Var.f90850b) && this.f90851c == c2Var.f90851c && mh.h1.equal(this.f90852d, c2Var.f90852d) && mh.h1.equal(this.f90853e, c2Var.f90853e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return mh.h1.hashCode(this.f90849a, this.f90850b, Long.valueOf(this.f90851c), this.f90852d, this.f90853e);
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("description", this.f90849a).add("severity", this.f90850b).add("timestampNanos", this.f90851c).add("channelRef", this.f90852d).add("subchannelRef", this.f90853e).toString();
    }
}
