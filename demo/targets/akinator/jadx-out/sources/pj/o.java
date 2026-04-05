package pj;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class o implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final n f81457a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f81458b;

    public o(n nVar, ru.a aVar) {
        this.f81457a = nVar;
        this.f81458b = aVar;
    }

    public static o create(n nVar, ru.a aVar) {
        return new o(nVar, aVar);
    }

    public static nj.k developerListenerManager(n nVar, Executor executor) {
        return (nj.k) dj.d.checkNotNullFromProvides(nVar.developerListenerManager(executor));
    }

    @Override // dj.b, dj.e, ru.a
    public nj.k get() {
        return developerListenerManager(this.f81457a, (Executor) this.f81458b.get());
    }
}
