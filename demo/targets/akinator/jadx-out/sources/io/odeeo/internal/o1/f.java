package io.odeeo.internal.o1;

import io.odeeo.internal.j1.k;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f implements io.odeeo.internal.y0.b<e> {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<io.odeeo.internal.j1.h> f65215a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<CoroutineScope> f65216b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<k> f65217c;

    public f(io.odeeo.internal.x1.a<io.odeeo.internal.j1.h> aVar, io.odeeo.internal.x1.a<CoroutineScope> aVar2, io.odeeo.internal.x1.a<k> aVar3) {
        this.f65215a = aVar;
        this.f65216b = aVar2;
        this.f65217c = aVar3;
    }

    public static f create(io.odeeo.internal.x1.a<io.odeeo.internal.j1.h> aVar, io.odeeo.internal.x1.a<CoroutineScope> aVar2, io.odeeo.internal.x1.a<k> aVar3) {
        return new f(aVar, aVar2, aVar3);
    }

    public static e newInstance(io.odeeo.internal.j1.h hVar, io.odeeo.internal.x1.a<CoroutineScope> aVar) {
        return new e(hVar, aVar);
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public e get() {
        e eVarNewInstance = newInstance(this.f65215a.get(), this.f65216b);
        g.injectRetryManagerProvider(eVarNewInstance, this.f65217c);
        return eVarNewInstance;
    }
}
