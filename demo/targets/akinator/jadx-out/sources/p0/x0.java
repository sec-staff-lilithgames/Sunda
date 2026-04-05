package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x0 implements b6 {

    /* renamed from: a, reason: collision with root package name */
    public final kv.l f80585a;

    public x0(kv.l lVar) {
        this.f80585a = lVar;
    }

    public static /* synthetic */ x0 copy$default(x0 x0Var, kv.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = x0Var.f80585a;
        }
        return x0Var.copy(lVar);
    }

    public final kv.l component1() {
        return this.f80585a;
    }

    public final x0 copy(kv.l lVar) {
        return new x0(lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && kotlin.jvm.internal.e0.areEqual(this.f80585a, ((x0) obj).f80585a);
    }

    public final kv.l getCompute() {
        return this.f80585a;
    }

    public int hashCode() {
        return this.f80585a.hashCode();
    }

    @Override // p0.b6
    public Object readValue(z2 z2Var) {
        return this.f80585a.invoke(z2Var);
    }

    @Override // p0.b6
    public h3 toProvided(l0 l0Var) {
        return new h3(l0Var, null, false, null, null, this.f80585a, false);
    }

    public String toString() {
        return "ComputedValueHolder(compute=" + this.f80585a + ')';
    }
}
