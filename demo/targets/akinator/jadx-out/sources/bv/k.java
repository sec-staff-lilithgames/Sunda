package bv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class k extends a {
    public k(zu.d<Object> dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != zu.n.f98854b) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // bv.a, zu.d
    public zu.m getContext() {
        return zu.n.f98854b;
    }
}
