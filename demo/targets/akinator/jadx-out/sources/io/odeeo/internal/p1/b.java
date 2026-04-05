package io.odeeo.internal.p1;

import io.odeeo.internal.a.c;
import java.lang.Throwable;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineDispatcher;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b<V, E extends Throwable> extends a<V, E, x0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CoroutineDispatcher dispatcher) {
        super(dispatcher);
        e0.checkNotNullParameter(dispatcher, "dispatcher");
    }

    @Override // io.odeeo.internal.p1.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object execute(x0 x0Var, d<? super c<? extends V, ? extends E>> dVar) {
        return a(dVar);
    }

    public abstract Object a(d<? super c<? extends V, ? extends E>> dVar);

    public final Object invoke(d<? super c<? extends V, ? extends E>> dVar) {
        return invoke(x0.f87415a, dVar);
    }
}
