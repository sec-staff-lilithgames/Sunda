package sh;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class h0 extends j0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k0 f85817g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var, Executor executor) {
        super(k0Var, executor);
        this.f85817g = k0Var;
        if (mh.p1.checkNotNull(null) != null) {
            throw new ClassCastException();
        }
    }

    @Override // sh.l1
    public final Object e() {
        throw null;
    }

    @Override // sh.l1
    public final String f() {
        throw null;
    }

    @Override // sh.j0
    public final void h(Object obj) {
        this.f85817g.setFuture((n1) obj);
    }
}
