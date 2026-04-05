package io.odeeo.internal.g1;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e implements io.odeeo.internal.y0.b<Executor> {

    /* renamed from: a, reason: collision with root package name */
    public final b f64211a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<Context> f64212b;

    public e(b bVar, io.odeeo.internal.x1.a<Context> aVar) {
        this.f64211a = bVar;
        this.f64212b = aVar;
    }

    public static e create(b bVar, io.odeeo.internal.x1.a<Context> aVar) {
        return new e(bVar, aVar);
    }

    public static Executor provideMainThreadExecutor(b bVar, Context context) {
        return (Executor) io.odeeo.internal.y0.d.checkNotNullFromProvides(bVar.provideMainThreadExecutor(context));
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public Executor get() {
        return provideMainThreadExecutor(this.f64211a, this.f64212b.get());
    }
}
