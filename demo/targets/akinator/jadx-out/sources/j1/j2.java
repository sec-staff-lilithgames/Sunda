package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j2 extends b0 {

    /* renamed from: b, reason: collision with root package name */
    public final long f68899b;

    public j2(long j10, kotlin.jvm.internal.u uVar) {
        super(null);
        this.f68899b = j10;
    }

    @Override // j1.b0
    /* renamed from: applyTo-Pq9zytI */
    public void mo4671applyToPq9zytI(long j10, i1 p10, float f10) {
        long jM4857copywmQWz5c$default;
        kotlin.jvm.internal.e0.checkNotNullParameter(p10, "p");
        p10.setAlpha(1.0f);
        if (f10 == 1.0f) {
            jM4857copywmQWz5c$default = this.f68899b;
        } else {
            long j11 = this.f68899b;
            jM4857copywmQWz5c$default = m0.m4857copywmQWz5c$default(j11, m0.m4860getAlphaimpl(j11) * f10, 0.0f, 0.0f, 0.0f, 14, null);
        }
        p10.mo4772setColor8_81llA(jM4857copywmQWz5c$default);
        if (p10.getShader() != null) {
            p10.setShader(null);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j2) {
            return m0.m4859equalsimpl0(this.f68899b, ((j2) obj).f68899b);
        }
        return false;
    }

    /* renamed from: getValue-0d7_KjU, reason: not valid java name */
    public final long m4781getValue0d7_KjU() {
        return this.f68899b;
    }

    public int hashCode() {
        return m0.m4865hashCodeimpl(this.f68899b);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) m0.m4866toStringimpl(this.f68899b)) + ')';
    }
}
