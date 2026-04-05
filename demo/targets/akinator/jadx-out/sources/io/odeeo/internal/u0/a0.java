package io.odeeo.internal.u0;

import java.util.Queue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class a0<T> extends b<T> {

    /* renamed from: c, reason: collision with root package name */
    public final Queue<T> f66521c;

    public a0(Queue<T> queue) {
        this.f66521c = (Queue) io.odeeo.internal.t0.u.checkNotNull(queue);
    }

    @Override // io.odeeo.internal.u0.b
    public T computeNext() {
        return this.f66521c.isEmpty() ? a() : this.f66521c.remove();
    }
}
