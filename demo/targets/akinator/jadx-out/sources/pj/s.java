package pj;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class s implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final q f81473a;

    public s(q qVar) {
        this.f81473a = qVar;
    }

    public static s create(q qVar) {
        return new s(qVar);
    }

    public static Executor providesBlockingExecutor(q qVar) {
        return (Executor) dj.d.checkNotNullFromProvides(qVar.providesBlockingExecutor());
    }

    @Override // dj.b, dj.e, ru.a
    public Executor get() {
        return providesBlockingExecutor(this.f81473a);
    }
}
