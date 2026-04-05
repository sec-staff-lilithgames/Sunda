package bu;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i5 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.b0 f10413b;

    public i5(mt.b0 b0Var) {
        this.f10413b = b0Var;
    }

    @Override // java.util.concurrent.Callable
    public ju.a call() {
        return this.f10413b.replay();
    }
}
