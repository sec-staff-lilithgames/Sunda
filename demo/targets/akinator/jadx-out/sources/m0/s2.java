package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f73825a;

    /* renamed from: b, reason: collision with root package name */
    public final long f73826b;

    public s2(long j10, long j11, kotlin.jvm.internal.u uVar) {
        this.f73825a = j10;
        this.f73826b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return j1.m0.m4859equalsimpl0(this.f73825a, s2Var.f73825a) && j1.m0.m4859equalsimpl0(this.f73826b, s2Var.f73826b);
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m5568getBackgroundColor0d7_KjU() {
        return this.f73826b;
    }

    /* renamed from: getHandleColor-0d7_KjU, reason: not valid java name */
    public final long m5569getHandleColor0d7_KjU() {
        return this.f73825a;
    }

    public int hashCode() {
        return j1.m0.m4865hashCodeimpl(this.f73826b) + (j1.m0.m4865hashCodeimpl(this.f73825a) * 31);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) j1.m0.m4866toStringimpl(this.f73825a)) + ", selectionBackgroundColor=" + ((Object) j1.m0.m4866toStringimpl(this.f73826b)) + ')';
    }
}
