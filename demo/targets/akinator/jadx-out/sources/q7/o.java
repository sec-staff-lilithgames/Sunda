package q7;

import java.io.IOException;
import kotlinx.coroutines.CancellableContinuation;
import tu.x0;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o implements xv.k, kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final xv.j f82547b;

    /* renamed from: c, reason: collision with root package name */
    public final CancellableContinuation f82548c;

    public o(xv.j jVar, CancellableContinuation<? super v0> cancellableContinuation) {
        this.f82547b = jVar;
        this.f82548c = cancellableContinuation;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return x0.f87415a;
    }

    @Override // xv.k
    public void onFailure(xv.j jVar, IOException iOException) {
        if (jVar.isCanceled()) {
            return;
        }
        int i10 = tu.z.f87419c;
        this.f82548c.resumeWith(tu.z.m7131constructorimpl(tu.a0.createFailure(iOException)));
    }

    @Override // xv.k
    public void onResponse(xv.j jVar, v0 v0Var) {
        this.f82548c.resumeWith(tu.z.m7131constructorimpl(v0Var));
    }

    public void invoke(Throwable th2) {
        try {
            this.f82547b.cancel();
        } catch (Throwable unused) {
        }
    }
}
