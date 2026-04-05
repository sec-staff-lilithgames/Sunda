package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j implements zu.k {

    /* renamed from: b, reason: collision with root package name */
    public static final a f80259b = new a(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements zu.l {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    @Override // zu.k, zu.m
    public <R> R fold(R r10, kv.p pVar) {
        return (R) zu.j.fold(this, r10, pVar);
    }

    @Override // zu.k, zu.m
    public <E extends zu.k> E get(zu.l lVar) {
        return (E) zu.j.get(this, lVar);
    }

    @Override // zu.k
    public zu.l getKey() {
        return f80259b;
    }

    @Override // zu.k, zu.m
    public zu.m minusKey(zu.l lVar) {
        return zu.j.minusKey(this, lVar);
    }

    @Override // zu.k, zu.m
    public zu.m plus(zu.m mVar) {
        return zu.j.plus(this, mVar);
    }
}
