package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d5 implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public final st.c f10207b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10208c;

    public d5(st.o oVar, st.c cVar) {
        this.f10207b = cVar;
        this.f10208c = oVar;
    }

    @Override // st.o
    public mt.g0 apply(Object obj) throws Exception {
        return new c6((mt.g0) ut.o0.requireNonNull(this.f10208c.apply(obj), "The mapper returned a null ObservableSource"), new c5(obj, this.f10207b));
    }
}
