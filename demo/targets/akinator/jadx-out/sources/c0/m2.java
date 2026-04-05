package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m2 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11540a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11541b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f11542c;

    public m2() {
        this(0, 0, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof m2) {
            m2 m2Var = (m2) obj;
            if (m2Var.f11540a == this.f11540a && m2Var.f11541b == this.f11541b && kotlin.jvm.internal.e0.areEqual(m2Var.f11542c, this.f11542c)) {
                return true;
            }
        }
        return false;
    }

    public final int getDelay() {
        return this.f11541b;
    }

    public final int getDurationMillis() {
        return this.f11540a;
    }

    public final g0 getEasing() {
        return this.f11542c;
    }

    public int hashCode() {
        return ((this.f11542c.hashCode() + (this.f11540a * 31)) * 31) + this.f11541b;
    }

    public m2(int i10, int i11, g0 easing) {
        kotlin.jvm.internal.e0.checkNotNullParameter(easing, "easing");
        this.f11540a = i10;
        this.f11541b = i11;
        this.f11542c = easing;
    }

    @Override // c0.f0, c0.j0, c0.n
    public <V extends v> x3 vectorize(n2 converter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(converter, "converter");
        return new x3(this.f11540a, this.f11541b, this.f11542c);
    }

    public /* synthetic */ m2(int i10, int i11, g0 g0Var, int i12, kotlin.jvm.internal.u uVar) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? i0.getFastOutSlowInEasing() : g0Var);
    }
}
