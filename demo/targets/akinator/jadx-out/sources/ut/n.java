package ut;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n implements st.q {

    /* renamed from: b, reason: collision with root package name */
    public final Class f88689b;

    public n(Class cls) {
        this.f88689b = cls;
    }

    @Override // st.q
    public boolean test(Object obj) throws Exception {
        return this.f88689b.isInstance(obj);
    }
}
