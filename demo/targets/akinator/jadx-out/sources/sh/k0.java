package sh;

import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class k0 extends z {

    /* renamed from: r, reason: collision with root package name */
    public j0 f85829r;

    @Override // sh.k
    public final void j() {
        j0 j0Var = this.f85829r;
        if (j0Var != null) {
            j0Var.c();
        }
    }

    @Override // sh.z
    public final void p() {
        j0 j0Var = this.f85829r;
        if (j0Var != null) {
            try {
                j0Var.f85826e.execute(j0Var);
            } catch (RejectedExecutionException e10) {
                j0Var.f85827f.setException(e10);
            }
        }
    }

    @Override // sh.z
    public final void t(y yVar) {
        mh.p1.checkNotNull(yVar);
        this.f85887n = null;
        if (yVar == y.f85880b) {
            this.f85829r = null;
        }
    }

    @Override // sh.z
    public final void n(int i10, Object obj) {
    }
}
