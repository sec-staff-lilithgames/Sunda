package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j1 implements b6 {

    /* renamed from: a, reason: collision with root package name */
    public final j2 f80284a;

    public j1(j2 j2Var) {
        this.f80284a = j2Var;
    }

    public static /* synthetic */ j1 copy$default(j1 j1Var, j2 j2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j2Var = j1Var.f80284a;
        }
        return j1Var.copy(j2Var);
    }

    public final j2 component1() {
        return this.f80284a;
    }

    public final j1 copy(j2 j2Var) {
        return new j1(j2Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && kotlin.jvm.internal.e0.areEqual(this.f80284a, ((j1) obj).f80284a);
    }

    public final j2 getState() {
        return this.f80284a;
    }

    public int hashCode() {
        return this.f80284a.hashCode();
    }

    @Override // p0.b6
    public Object readValue(z2 z2Var) {
        return this.f80284a.getValue();
    }

    @Override // p0.b6
    public h3 toProvided(l0 l0Var) {
        return new h3(l0Var, null, false, null, this.f80284a, null, true);
    }

    public String toString() {
        return "DynamicValueHolder(state=" + this.f80284a + ')';
    }
}
