package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b5 implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public final st.o f10118b;

    public b5(st.o oVar) {
        this.f10118b = oVar;
    }

    @Override // st.o
    public mt.g0 apply(Object obj) throws Exception {
        return new f4((Iterable) ut.o0.requireNonNull(this.f10118b.apply(obj), "The mapper returned a null Iterable"));
    }
}
