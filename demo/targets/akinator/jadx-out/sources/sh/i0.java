package sh;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class i0 extends j0 {

    /* renamed from: g, reason: collision with root package name */
    public final Callable f85820g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k0 f85821h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, Callable callable, Executor executor) {
        super(k0Var, executor);
        this.f85821h = k0Var;
        this.f85820g = (Callable) mh.p1.checkNotNull(callable);
    }

    @Override // sh.l1
    public final Object e() {
        return this.f85820g.call();
    }

    @Override // sh.l1
    public final String f() {
        return this.f85820g.toString();
    }

    @Override // sh.j0
    public final void h(Object obj) {
        this.f85821h.set(obj);
    }
}
