package wr;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Executor f90977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f90978c;

    public j0(u0 u0Var, Executor executor) {
        this.f90978c = u0Var;
        this.f90977b = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f90977b.execute(this.f90978c.wrap(runnable));
    }
}
