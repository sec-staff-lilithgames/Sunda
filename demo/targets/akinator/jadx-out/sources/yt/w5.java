package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w5 implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public final st.o f96488b;

    public w5(st.o oVar) {
        this.f96488b = oVar;
    }

    @Override // st.o
    public tw.b apply(Object obj) throws Exception {
        return new z4((Iterable) ut.o0.requireNonNull(this.f96488b.apply(obj), "The mapper returned a null Iterable"));
    }
}
