package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0.q f73684a;

    /* renamed from: b, reason: collision with root package name */
    public final long f73685b;

    public d0(l0.q qVar, long j10, kotlin.jvm.internal.u uVar) {
        this.f73684a = qVar;
        this.f73685b = j10;
    }

    /* renamed from: copy-Uv8p0NA$default, reason: not valid java name */
    public static /* synthetic */ d0 m5497copyUv8p0NA$default(d0 d0Var, l0.q qVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qVar = d0Var.f73684a;
        }
        if ((i10 & 2) != 0) {
            j10 = d0Var.f73685b;
        }
        return d0Var.m5499copyUv8p0NA(qVar, j10);
    }

    public final l0.q component1() {
        return this.f73684a;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m5498component2F1C5BW0() {
        return this.f73685b;
    }

    /* renamed from: copy-Uv8p0NA, reason: not valid java name */
    public final d0 m5499copyUv8p0NA(l0.q handle, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(handle, "handle");
        return new d0(handle, j10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f73684a == d0Var.f73684a && i1.h.m4182equalsimpl0(this.f73685b, d0Var.f73685b);
    }

    public final l0.q getHandle() {
        return this.f73684a;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m5500getPositionF1C5BW0() {
        return this.f73685b;
    }

    public int hashCode() {
        return i1.h.m4187hashCodeimpl(this.f73685b) + (this.f73684a.hashCode() * 31);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.f73684a + ", position=" + ((Object) i1.h.m4193toStringimpl(this.f73685b)) + ')';
    }
}
