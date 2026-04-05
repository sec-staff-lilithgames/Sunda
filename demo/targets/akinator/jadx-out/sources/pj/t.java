package pj;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class t implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final q f81474a;

    public t(q qVar) {
        this.f81474a = qVar;
    }

    public static t create(q qVar) {
        return new t(qVar);
    }

    public static Executor providesLightWeightExecutor(q qVar) {
        return (Executor) dj.d.checkNotNullFromProvides(qVar.providesLightWeightExecutor());
    }

    @Override // dj.b, dj.e, ru.a
    public Executor get() {
        return providesLightWeightExecutor(this.f81474a);
    }
}
