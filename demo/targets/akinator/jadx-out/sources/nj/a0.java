package nj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a0 implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f76856a;

    public a0(ru.a aVar) {
        this.f76856a = aVar;
    }

    public static a0 create(ru.a aVar) {
        return new a0(aVar);
    }

    public static z newInstance(q0 q0Var) {
        return new z(q0Var);
    }

    @Override // dj.b, dj.e, ru.a
    public z get() {
        return newInstance((q0) this.f76856a.get());
    }
}
