package pj;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class r implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final q f81465a;

    public r(q qVar) {
        this.f81465a = qVar;
    }

    public static r create(q qVar) {
        return new r(qVar);
    }

    public static Executor providesBackgroundExecutor(q qVar) {
        return (Executor) dj.d.checkNotNullFromProvides(qVar.providesBackgroundExecutor());
    }

    @Override // dj.b, dj.e, ru.a
    public Executor get() {
        return providesBackgroundExecutor(this.f81465a);
    }
}
