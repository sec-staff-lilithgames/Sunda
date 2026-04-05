package ut;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public final st.c f88662b;

    public b(st.c cVar) {
        this.f88662b = cVar;
    }

    @Override // st.o
    public Object apply(Object[] objArr) throws Exception {
        if (objArr.length == 2) {
            return this.f88662b.apply(objArr[0], objArr[1]);
        }
        throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
    }
}
