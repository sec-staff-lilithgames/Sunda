package wr;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Executor f90972b;

    public i0(Executor executor) {
        this.f90972b = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f90972b.execute(u0.current().wrap(runnable));
    }
}
