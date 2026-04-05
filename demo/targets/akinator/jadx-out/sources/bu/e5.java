package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e5 implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public final st.o f10257b;

    public e5(st.o oVar) {
        this.f10257b = oVar;
    }

    @Override // st.o
    public mt.g0 apply(Object obj) throws Exception {
        return new ua((mt.g0) ut.o0.requireNonNull(this.f10257b.apply(obj), "The itemDelay returned a null ObservableSource"), 1L).map(ut.m0.justFunction(obj)).defaultIfEmpty(obj);
    }
}
