package io.odeeo.internal.g1;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements io.odeeo.internal.y0.b<CoroutineScope> {

    /* renamed from: a, reason: collision with root package name */
    public final b f64210a;

    public d(b bVar) {
        this.f64210a = bVar;
    }

    public static d create(b bVar) {
        return new d(bVar);
    }

    public static CoroutineScope provideIoCoroutineScope(b bVar) {
        return (CoroutineScope) io.odeeo.internal.y0.d.checkNotNullFromProvides(bVar.provideIoCoroutineScope());
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public CoroutineScope get() {
        return provideIoCoroutineScope(this.f64210a);
    }
}
