package q5;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements zu.k {

    /* renamed from: c, reason: collision with root package name */
    public static final a f82415c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final r f82416b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements zu.l {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    public d(r connectionWrapper) {
        e0.checkNotNullParameter(connectionWrapper, "connectionWrapper");
        this.f82416b = connectionWrapper;
    }

    @Override // zu.k, zu.m
    public <R> R fold(R r10, kv.p pVar) {
        return (R) zu.j.fold(this, r10, pVar);
    }

    @Override // zu.k, zu.m
    public <E extends zu.k> E get(zu.l lVar) {
        return (E) zu.j.get(this, lVar);
    }

    public final r getConnectionWrapper() {
        return this.f82416b;
    }

    @Override // zu.k
    public zu.l getKey() {
        return f82415c;
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
