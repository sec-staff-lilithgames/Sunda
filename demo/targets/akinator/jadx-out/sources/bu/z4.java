package bu;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z4 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.b0 f11302b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11303c;

    public z4(mt.b0 b0Var, int i10) {
        this.f11302b = b0Var;
        this.f11303c = i10;
    }

    @Override // java.util.concurrent.Callable
    public ju.a call() {
        return this.f11302b.replay(this.f11303c);
    }
}
