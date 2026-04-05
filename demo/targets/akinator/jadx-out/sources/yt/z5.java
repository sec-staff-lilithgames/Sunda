package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z5 implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public final st.o f96643b;

    public z5(st.o oVar) {
        this.f96643b = oVar;
    }

    @Override // st.o
    public tw.b apply(Object obj) throws Exception {
        return new sc((tw.b) ut.o0.requireNonNull(this.f96643b.apply(obj), "The itemDelay returned a null Publisher"), 1L).map(ut.m0.justFunction(obj)).defaultIfEmpty(obj);
    }
}
