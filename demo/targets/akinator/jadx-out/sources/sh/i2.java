package sh;

import com.ironsource.C3191e4;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class i2 extends o0 implements RunnableFuture {

    /* renamed from: j, reason: collision with root package name */
    public volatile l1 f85825j;

    public i2(Callable callable) {
        this.f85825j = new h2(this, callable);
    }

    @Override // sh.k
    public final void d() {
        l1 l1Var;
        if (m() && (l1Var = this.f85825j) != null) {
            l1Var.c();
        }
        this.f85825j = null;
    }

    @Override // sh.k
    public final String l() {
        l1 l1Var = this.f85825j;
        if (l1Var == null) {
            return super.l();
        }
        return "task=[" + l1Var + C3191e4.i.f36531e;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        l1 l1Var = this.f85825j;
        if (l1Var != null) {
            l1Var.run();
        }
        this.f85825j = null;
    }
}
