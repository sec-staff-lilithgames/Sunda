package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z1 implements b6 {

    /* renamed from: a, reason: collision with root package name */
    public final tu.o f80655a;

    public z1(kv.a aVar) {
        this.f80655a = tu.q.lazy(aVar);
    }

    @Override // p0.b6
    public Object readValue(z2 z2Var) {
        return this.f80655a.getValue();
    }

    @Override // p0.b6
    public h3 toProvided(l0 l0Var) {
        d0.composeRuntimeError("Cannot produce a provider from a lazy value holder");
        throw new tu.k();
    }
}
