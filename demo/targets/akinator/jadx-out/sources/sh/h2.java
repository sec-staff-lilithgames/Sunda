package sh;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class h2 extends l1 {

    /* renamed from: e, reason: collision with root package name */
    public final Callable f85818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i2 f85819f;

    public h2(i2 i2Var, Callable callable) {
        this.f85819f = i2Var;
        this.f85818e = (Callable) mh.p1.checkNotNull(callable);
    }

    @Override // sh.l1
    public final void a(Throwable th2) {
        this.f85819f.setException(th2);
    }

    @Override // sh.l1
    public final void b(Object obj) {
        this.f85819f.set(obj);
    }

    @Override // sh.l1
    public final boolean d() {
        return this.f85819f.isDone();
    }

    @Override // sh.l1
    public final Object e() {
        return this.f85818e.call();
    }

    @Override // sh.l1
    public final String f() {
        return this.f85818e.toString();
    }
}
