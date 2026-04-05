package wr;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k0 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callable f91006b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f91007c;

    public k0(u0 u0Var, Callable callable) {
        this.f91007c = u0Var;
        this.f91006b = callable;
    }

    @Override // java.util.concurrent.Callable
    public Object call() throws Exception {
        u0 u0Var = this.f91007c;
        u0 u0VarAttach = u0Var.attach();
        try {
            return this.f91006b.call();
        } finally {
            u0Var.detach(u0VarAttach);
        }
    }
}
